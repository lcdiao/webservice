package cn.lcdiao.webservice.client;

import cn.lcdiao.webservice.IWeatherServiceImpl;
import cn.lcdiao.webservice.IWeatherServiceImplService;

/**调用发布的webservice服务*/
public class Client {
    public static void main(String[] args) {
        //1、创建服务视图对象(视图是从service标签的name属性获取 --->    <service name="IWeatherServiceImplService">)
        IWeatherServiceImplService service = new IWeatherServiceImplService();
        //2、获取服务的实现类（实现类从portType标签的name属性获取    --->    <portType name="IWeatherServiceImpl">）
        IWeatherServiceImpl port = service.getPort(IWeatherServiceImpl.class);
        //3、调用方法(从portType的operation标签获取    --->    <operation name="query">   query就是方法名)
        String query = port.query("广州");
        //输出返回结果
        System.out.println(query);
    }
}
