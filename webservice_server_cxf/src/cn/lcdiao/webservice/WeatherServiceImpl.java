package cn.lcdiao.webservice;

import java.util.Random;

public class WeatherServiceImpl implements IWeatherService {
    @Override
    public String query(String cityName) {
        Random random = new Random();
        int n = random.nextInt(3);
        String weather = n==2? "晴天":n==1?"阴天":"暴雨";
        System.out.println("查询-> "+cityName+" 的天气为:"+weather);
        return weather;
    }
}
