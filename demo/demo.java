package test;
 
import com.alibaba.fastjson.JSON;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
 
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.Map.Entry;
 
public class Main {
    private static  final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class.getName());
    private static final int DEFAULT_TIMEOUT = 10000;
    private static int timeout = DEFAULT_TIMEOUT;
    private static int maxConnTotal = 500;   //最大不要超过1000
    private static int maxConnPerRoute = 200;//实际的单个连接池大小，
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /** api_key,secret_key */
        String api_key = "61908ad2a29e1c1f20c73b0dd72cdb30";
        String secret_key = "a665ac2932b63507b8f4ef1700997d7a";
        long time = new Date().getTime();
        /** 封装需要签名的参数 */
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("symbol", "btcusdt");
        params.put("type", "1");
        params.put("side", "BUY");
        params.put("volume", "1");
        params.put("price", "5");
        params.put("api_key", api_key);
        params.put("time", time+"");
        /** 拼接签名字符串，md5签名 */
        StringBuilder result = new StringBuilder();
        Set<Entry<String, String>> entrys = params.entrySet();
        for (Entry<String, String> param : entrys) {
            /** 去掉签名字段 */
            if(param.getKey().equals("sign")){
                continue;
            }
 
            /** 空参数不参与签名 */
            if(param.getValue()!=null) {
                result.append(param.getKey());
                result.append(param.getValue().toString());
            }
        }
        result.append(secret_key);
        String sign = getMD5(result.toString());
        params.put("sign", sign);
        ArrayList<BasicNameValuePair> basicNameValuePairs = new ArrayList<>();
        params.forEach((k,v) -> basicNameValuePairs.add(new BasicNameValuePair(k, v)));
        System.out.println(JSON.toJSONString(params));
        String resultJson = doPost("https://openapi.chaindown.com/open/api/create_order", basicNameValuePairs );
        System.out.println(resultJson);
    }
 
    /**
     * post请求
     * @param url
     * @param data
     * @return
     */
    public static String doPost(String url, ArrayList<BasicNameValuePair> data) {
        HttpResponse response = null;
        try {
            //UrlEncodedFormEntity这个类是用来把输入数据编码成合适的内容
            //两个键值对，被UrlEncodedFormEntity实例编码后变为如下内容：param1=value1¶m2=value2
            //首先将参数设置为utf-8的形式
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(data,
                    HTTP.UTF_8);
            String result = "";
            HttpPost post = new HttpPost(url);//post方式
            RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(timeout)
                    .setConnectTimeout(timeout).setSocketTimeout(timeout).build();
 
            post.setConfig(config);
            post.setEntity(entity);//带上参数
            CloseableHttpClient client = HttpClients.custom().setDefaultRequestConfig(config)
                    .setMaxConnTotal(maxConnTotal)
                    .setMaxConnPerRoute(maxConnPerRoute).build();
            response = client.execute(post);//响应结果
            if (response.getStatusLine().getStatusCode() == 200) {
                //把结果取出来是一个STRING类型的
                result = EntityUtils.toString(response.getEntity());
                if (log.isDebugEnabled()) {
                    log.debug("doPost to {} response: {}", url, result);
                }
            } else {
                log.warn("doPost to {} response statusCode: {}, payload: {}", url, response.getStatusLine().getStatusCode(),
                        EntityUtils.toString(response.getEntity()));
            }
 
            return result;
        } catch (ConnectTimeoutException e) {
            log.error("doPost to {} raise ConnectTimeoutException, {}", url, e.getMessage());
        } catch (HttpHostConnectException e) {
            log.error("doPost to {} raise HttpHostConnectException, {}", url, e.getMessage());
        } catch (Exception e) {
            log.error("doPost to {} raise exception ,{}", url, e.getMessage());
        } finally {
            try {
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                }
            } catch (IOException e) {
                log.error("doPost to {} raise final exception ,{}", url, e.getMessage());
            }
        }
        return null;
    }
 
    /**
     * 通过get来提交数据，带参数的方法
     *
     * @param url 请求地址
     * @param params 参数
     * @return
     */
    public static String get(String url, Map<String, String> params) {
        String str = null;
        try {
            if (params != null && params.size() > 0) {
                int x = 1;
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if(x==1){
                        url = url + "?";
                    }else {
                        url = url + "&";
                    }
                    url+=entry.getKey()+"="+entry.getValue();
                    x++;
                }
            }
            HttpClient client = new HttpClient();
            System.out.println("url:::"+url);
            GetMethod method = new GetMethod(url);
//设定请求头的样式
            method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            int code = client.executeMethod(method);
            if (code >= 200 && code < 300) {
                InputStream in = method.getResponseBodyAsStream();
                str = IOUtils.toString(in);
            }
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }
 
 
    /**
     * 获取String的MD5值
     *
     * @param info 字符串
     * @return 该字符串的MD5值
     */
    public static String getMD5(String info) {
        try {
//获取 MessageDigest 对象，参数为 MD5 字符串，表示这是一个 MD5 算法（其他还有 SHA1 算法等）：
            MessageDigest md5 = MessageDigest.getInstance("MD5");
//update(byte[])方法，输入原数据
//类似StringBuilder对象的append()方法，追加模式，属于一个累计更改的过程
            md5.update(info.getBytes("UTF-8"));
//digest()被调用后,MessageDigest对象就被重置，即不能连续再次调用该方法计算原数据的MD5值。可以手动调用reset()方法重置输入源。
//digest()返回值16位长度的哈希值，由byte[]承接
            byte[] md5Array = md5.digest();
//byte[]通常我们会转化为十六进制的32位长度的字符串来使用,本文会介绍三种常用的转换方法
            return bytesToHex(md5Array);
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
 
    private static String bytesToHex(byte[] md5Array) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < md5Array.length; i++) {
            int temp = 0xff & md5Array[i];
            String hexString = Integer.toHexString(temp);
            if (hexString.length() == 1) {//如果是十六进制的0f，默认只显示f，此时要补上0
                strBuilder.append("0").append(hexString);
            } else {
                strBuilder.append(hexString);
            }
        }
        return strBuilder.toString();
    }
 
}
