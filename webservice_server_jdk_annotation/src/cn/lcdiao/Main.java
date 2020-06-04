package cn.lcdiao;

import cn.lcdiao.webservice.IWeatherServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * 采用JDK的方式（jws）发布服务
 * */
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/weatherService",new IWeatherServiceImpl());
        System.out.println("发布成功");
        /*
        在浏览器上通过http://localhost:8080/weatherService?wsdl   就可以查看相关的wsdl文档
         */
    }
}


