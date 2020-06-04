package cn.com.webxml.client;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        //1、设置服务的地址(没有跟?wsdl)
        factoryBean.setAddress("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        //2、设置服务的接口
        factoryBean.setServiceClass(MobileCodeWSSoap.class);
        //3、通过工厂获取对象
        MobileCodeWSSoap service = factoryBean.create(MobileCodeWSSoap.class);
        //4、调用方法
        String info = service.getMobileCodeInfo("15876161217", "");
        System.out.println(info);
    }
}
