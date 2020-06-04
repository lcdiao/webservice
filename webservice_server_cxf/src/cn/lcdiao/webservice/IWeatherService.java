package cn.lcdiao.webservice;

import javax.jws.WebService;

@WebService
public interface IWeatherService {
    String query(String cityName);
}
