package cn.lcdiao.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Random;

@WebService(endpointInterface = "cn.lcdiao.webservice.IWeatherService")
public class IWeatherServiceImpl implements IWeatherService,IOtherService {
    //WebResult(name="weatherInfo")  表明返回的参数
    //@WebParam(name="cityName")  表明请求的参数名称，默认为arg0..
    @Override
    public @WebResult(name="weatherInfo") String query(@WebParam(name="cityName") String cityName) {
        Random random = new Random();
        int n = random.nextInt(3);
        String weather = n==2? "晴天":n==1?"阴天":"暴雨";
        System.out.println("查询-> "+cityName+" 的天气为:"+weather);
        return weather;
    }

    @Override
    public String other() {
        return "新的服务！庆祝webservice发布成功！";
    }

    @Override
    @WebMethod(exclude = true)
    public String noPublish() {
        return "使用注解@WebMethod(exclude = true)不发布出去";
    }

    @Override
    public void test() {
        //使用@WebService(endpointInterface = "cn.lcdiao.webservice.IWeatherService")
        //指定要发布的哪个接口的方法，不是该接口的方法不发布
        //但还需要去该接口类上加上@WebService注解，否则报错
    }
}
