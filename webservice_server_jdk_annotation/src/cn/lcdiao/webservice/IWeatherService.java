package cn.lcdiao.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 定义一个查询天气的服务接口
 * */
@WebService
public interface IWeatherService {

    @WebResult(name="weatherInfo")String query(@WebParam(name="cityName") String cityName);

    String other();

    @WebMethod(exclude = true)
    String noPublish();
}
