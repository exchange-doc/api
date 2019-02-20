# ws测试工具类（Java）

package test;                <br>

import java.io.ByteArrayInputStream;                <br>
import java.io.ByteArrayOutputStream;                <br>
import java.io.IOException;                <br>
import java.net.URI;                <br>
import java.nio.ByteBuffer;                <br>
import java.nio.CharBuffer;                <br>
import java.nio.charset.Charset;                <br>
import java.nio.charset.CharsetDecoder;                <br>
import java.security.cert.CertificateException;                <br>
import java.security.cert.X509Certificate;                <br>
import java.util.HashMap;                <br>
import java.util.Map;                <br>
import java.util.zip.GZIPInputStream;                <br>

import javax.net.ssl.SSLContext;                <br>
import javax.net.ssl.TrustManager;                <br>
import javax.net.ssl.X509TrustManager;                <br>

import org.java_websocket.client.DefaultSSLWebSocketClientFactory;                <br>
import org.java_websocket.client.WebSocketClient;                <br>
import org.java_websocket.drafts.Draft;                <br>
import org.java_websocket.drafts.Draft_17;                <br>
import org.java_websocket.handshake.ServerHandshake;                <br>

/**                <br>
\* @author 鲫鱼哥 DateTime:2018年11月22日 下午9:25:20                 <br>
\* 建议使用的websocket client版本                <br>
\* \<dependency\>                <br>
\* \<groupId\>org.java-websocket\</groupId\>                <br>
\* \<artifactId\>Java-WebSocket\</artifactId\>                <br>
\* \<version\>1.3.0\</version\>                <br>
\* \</dependency\>                <br>
\*                 <br>
*/                <br>
public class WsTest {                <br>

public static void main(String[] args) {                <br>
try {                <br>
//wsurl                <br>
String url = "wss://ws.***.com/kline-api/ws";                <br>
//历史数据请求参数                <br>
String reqParam = "{\"event\":\"req\",\"params\":{\"channel\":\"market_btcusdt_trade_ticker\",\"cb_id\":\"btcusdt\",\"top\":150}}";                <br>
//订阅参数                <br>
String subParam = "{\"event\":\"sub\",\"params\":{\"channel\":\"market_btcusdt_trade_ticker\",\"cb_id\":\"btcusdt\",\"top\":150}}";                <br>

//初始化请求历史数据                <br>
WebSocketUtils wsc = WebSocketUtils.executeWebSocket(url, reqParam);                <br>

//订阅实时数据                <br>
wsc.send(subParam);                <br>

//线程不结束，等待新的消息，www.***.com 一般一分钟左右会有新的成交返回                <br>
while (true) {                <br>
Thread.sleep(1000);                <br>
}                <br>

}catch (Exception e) {                <br>
e.printStackTrace();                <br>
}                <br>
}                <br>

static class WebSocketUtils extends WebSocketClient {                <br>
private static WebSocketUtils wsclient = null;                <br>
private String msg = "";                <br>

public WebSocketUtils(URI serverURI) {                <br>
super(serverURI);                <br>
}                <br>

public WebSocketUtils(URI serverUri, Draft draft) {                <br>
super(serverUri, draft);                <br>
}                <br>

public WebSocketUtils(URI serverUri, Map<String, String> headers, int connecttimeout) {                <br>
super(serverUri, new Draft_17(), headers, connecttimeout);                <br>
}                <br>

@Override                <br>
public void onOpen(ServerHandshake serverHandshake) {                <br>
System.out.println("链接已建立");                <br>
                <br>
}                <br>

@Override                <br>
public void onMessage(String s) {                <br>
System.out.println("收到字符串消息");                <br>
}                <br>

@Override                <br>
public void onClose(int i, String s, boolean b) {                <br>
System.out.println("链接已关闭");                <br>
}                <br>

@Override                <br>
public void onError(Exception e) {                <br>
System.out.println("报错啦");                <br>
}                <br>

@Override                <br>
public void onMessage(ByteBuffer socketBuffer) {                <br>
try {                <br>
String marketStr = byteBufferToString(socketBuffer);                <br>
String market = uncompress(marketStr).toLowerCase();                <br>
if (market.contains("ping")) {                <br>
System.out.println("收到消息ping："+market);                <br>
String tmp = market.replace("ping", "pong");                <br>
wsclient.send(market.replace("ping", "pong"));                <br>
} else {                <br>
msg = market;                <br>
System.out.println("收到消息："+msg);                <br>
}                <br>
} catch (IOException e) {                <br>
e.printStackTrace();                <br>
}                <br>
}                <br>

public static Map<String, String> getWebSocketHeaders() throws IOException {                <br>
Map<String, String> headers = new HashMap<String, String>();                <br>
return headers;                <br>
}                <br>

private static void trustAllHosts(WebSocketUtils appClient) {                <br>
TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {                <br>
public java.security.cert.X509Certificate[] getAcceptedIssuers() {                <br>
return new java.security.cert.X509Certificate[] {};                <br>
}                <br>

public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {                <br>
}                <br>

public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {                <br>
}                <br>
} };                <br>

try {                <br>
SSLContext sc = SSLContext.getInstance("TLS");                <br>
sc.init(null, trustAllCerts, new java.security.SecureRandom());                <br>
appClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(sc));                <br>
} catch (Exception e) {                <br>
e.printStackTrace();                <br>
}                <br>
}                <br>

public static WebSocketUtils executeWebSocket(String url,String sendMsg) throws Exception {                <br>
wsclient = new WebSocketUtils(new URI(url), getWebSocketHeaders(), 1000);                <br>
trustAllHosts(wsclient);                <br>
wsclient.connectBlocking();                <br>
wsclient.send(sendMsg);                <br>
return wsclient;                <br>
}                <br>

// buffer 转String                <br>
public String byteBufferToString(ByteBuffer buffer) {                <br>
CharBuffer charBuffer = null;                <br>
try {                <br>
Charset charset = Charset.forName("ISO-8859-1");                <br>
CharsetDecoder decoder = charset.newDecoder();                <br>
charBuffer = decoder.decode(buffer);                <br>
buffer.flip();                <br>
return charBuffer.toString();                <br>
} catch (Exception ex) {                <br>
ex.printStackTrace();                <br>
return null;                <br>
}                <br>
}                <br>


// 解压缩                <br>
public String uncompress(String str) throws IOException {                <br>
if (str == null || str.length() == 0) {                <br>
return str;                <br>
}                <br>
ByteArrayOutputStream out = new ByteArrayOutputStream();                <br>
ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));                <br>
GZIPInputStream gunzip = new GZIPInputStream(in);                <br>
byte[] buffer = new byte[256];                <br>
int n;                <br>
while ((n = gunzip.read(buffer)) >= 0) {                <br>
out.write(buffer, 0, n);                <br>
}                <br>
return out.toString();                <br>
}                <br>

}                <br>
}