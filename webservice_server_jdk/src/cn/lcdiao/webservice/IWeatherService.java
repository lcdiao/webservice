package cn.lcdiao.webservice;

/**
 * 定义一个查询天气的服务接口
 * */
public interface IWeatherService {

    String query(String cityName);

    String other();
}
