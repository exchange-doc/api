
package com.chainup.stats.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.io.IOUtils;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
/** 4个变量，api_key,secret_key */ 
 String api_key = "9750*****************65d1";
 String secret_key = "1c16******************2982";

 /** 封装需要签名的参数 */
        TreeMap<String, String> params = new TreeMap<String, String>();
        params.put("api_key", api_key);
        params.put("time", new Date().getTime() + "");
/** 拼接签名字符串，md5签名 */
        StringBuilder result = new StringBuilder();
        Set<Entry<String, String>> entrys = params.entrySet();
        for (Entry<String, String> param : entrys) {
/** 去掉签名字段 */
            if (param.getKey().equals("sign")) {
                continue;
            }

/** 空参数不参与签名 */
            if (param.getValue() != null) {
                result.append(param.getKey());
                result.append(param.getValue().toString());
            }
        }
        result.append(secret_key);
        String sign = getMD5(result.toString());
        params.put("sign", sign);

/** http请求 */
        String resultJson = get("https://www.***.com/exchange-open-api/open/api/get_trades?symbol=btcusdt", params);
        System.out.println(resultJson);
    }

    /**
     * 通过post来提交数据，带参数的方法
     *
     * @param url    请求地址
     * @param params 参数
     * @return
     */
    public static String post(String url, Map<String, String> params) {
        String str = null;
        try {
            HttpClient client = new HttpClient();
            PostMethod method = new PostMethod(url);
//设定请求头的样式 
            method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            if (params != null && params.size() > 0) {
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    method.setParameter(entry.getKey(), entry.getValue());
                }
            }
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
     * 通过get来提交数据，带参数的方法
     *
     * @param url    请求地址
     * @param params 参数
     * @return
     */
    public static String get(String url, Map<String, String> params) {
        String str = null;
        try {
            if (params != null && params.size() > 0) {
                int x = 1;
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    if (x == 1) {
                        url = url + "?";
                    } else {
                        url = url + "&";
                    }
                    url += entry.getKey() + "=" + entry.getValue();
                    x++;
                }
            }
            HttpClient client = new HttpClient();
            System.out.println("url:::" + url);
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
