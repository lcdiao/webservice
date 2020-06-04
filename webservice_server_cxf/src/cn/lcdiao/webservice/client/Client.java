package cn.lcdiao.webservice.client;

import cn.lcdiao.webservice.IWeatherService;
import cn.lcdiao.webservice.WeatherServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Client {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //1、设置发布的地址
        factoryBean.setAddress("http://localhost:8888/weatherService");
        //2、设置访问的接口
        factoryBean.setServiceClass(IWeatherService.class);
        //3、设置服务的实现对象
        factoryBean.setServiceBean(new WeatherServiceImpl());
        //4、通过工厂创建服务
        factoryBean.create();
        System.out.println("发布服务成功！");
    }
}
