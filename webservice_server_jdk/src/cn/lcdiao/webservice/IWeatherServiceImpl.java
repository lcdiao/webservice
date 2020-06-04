package cn.lcdiao.webservice;

import javax.jws.WebService;
import java.util.Random;

@WebService
public class IWeatherServiceImpl implements IWeatherService {
    @Override
    public String query(String cityName) {
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
}
