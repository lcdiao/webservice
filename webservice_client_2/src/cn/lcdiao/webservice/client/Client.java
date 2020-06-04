package cn.lcdiao.webservice.client;

import cn.lcdiao.webservice.IWeatherServiceImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        //URL url = new URL("http://localhost:8080/weatherService?wsdl");
        //去请求TunnelliJ，查看请求的数据
        URL url = new URL("http://localhost:8000/weatherService?wsdl");
        //在<definitions 标签下找到 targetNamespace="http://webservice.lcdiao.cn/" name="IWeatherServiceImplService" 这两个属性
        QName qName = new QName("http://webservice.lcdiao.cn/","IWeatherServiceImplService");
        //相当于上一种的底层实现
        Service service = Service.create(url, qName);

        IWeatherServiceImpl port = service.getPort(IWeatherServiceImpl.class);
        String query = port.query("深圳");
        System.out.println(query);
//        String other = port.other();
//        System.out.println(other);
    }
}
