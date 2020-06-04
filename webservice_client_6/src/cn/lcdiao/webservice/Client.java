package cn.lcdiao.webservice;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * 通过观察发送的数据格式，来自己模拟发送请求
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // URL
        URL url = new URL("http://localhost:8000/weatherService");
        //创建一个连接对象，用于向服务器发送http请求信息+获取服务器的响应信息
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        //设置请求信息
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type","text/xml; charset=utf-8");
        //打开通信
        connection.setDoOutput(true);
        connection.setDoInput(true);
        //拼接符合协议要求的数据格式
        String info = buildXML("广州");
        //发送请求信息
        connection.getOutputStream().write(info.getBytes());

        //获取响应的消息
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            //响应状态正常，获取返回的信息
            InputStream inputStream = connection.getInputStream();
            Scanner sc = new Scanner(inputStream);
            while (sc.hasNext()) {
                //输出返回信息
                System.out.println(sc.nextLine());
                //结果：<?xml version="1.0" ?><S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/"><S:Body><ns2:queryResponse xmlns:ns2="http://webservice.lcdiao.cn/"><return>阴天</return></ns2:queryResponse></S:Body></S:Envelope>
            }
            sc.close();
        } else {
            System.out.println(responseCode);
        }
    }

    private static String buildXML(String cityName) {
        return "<?xml version=\"1.0\" ?>" +
                "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<S:Body>" +
                "<ns2:query xmlns:ns2=\"http://webservice.lcdiao.cn/\"><arg0>"+cityName+"</arg0>\t\t\t</ns2:query>" +
                "</S:Body>" +
                "</S:Envelope>";
    }
}
