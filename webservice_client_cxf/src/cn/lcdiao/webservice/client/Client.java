package cn.lcdiao.webservice.client;

import cn.lcdiao.webservice.IWeatherService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) throws Exception {
        JaxWsProxyFactoryBean proxyFactoryBean = new JaxWsProxyFactoryBean();
        //1、设置服务的地址(没有跟?wsdl)
        proxyFactoryBean.setAddress("http://localhost:8888/weatherService");
        //2、设置服务的接口 (<wsdl:portType name="IWeatherService">)
        proxyFactoryBean.setServiceClass(IWeatherService.class);
        //3、通过工厂获取对象
        IWeatherService service = (IWeatherService)proxyFactoryBean.create();
        //4、调用方法
        String q = service.query("广州");
        System.out.println(q);
    }
}
