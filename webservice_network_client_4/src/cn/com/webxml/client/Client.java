package cn.com.webxml.client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Client {
    public static void main(String[] args) {
        //1、创建服务视图对象
        WeatherWS weatherWS = new WeatherWS();
        //2、创建服务的实体类
        WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
        //3、调用方法
        /*  其他方法
            getRegionCountry
            获得国外国家名称和与之对应的ID    输入参数：无， 返回数据：一维字符串数组。
            getRegionDataset
            获得中国省份、直辖市、地区；国家名称（国外）和与之对应的ID      输入参数：无，返回数据：DataSet。
            getRegionProvince
            获得中国省份、直辖市、地区和与之对应的ID   输入参数：无，返回数据：一维字符串数组。
            getSupportCityDataset
            获得支持的城市/地区名称和与之对应的ID       输入参数：theRegionCode = 省市、国家ID或名称，返回数据：DataSet。
         */
        //获得支持的城市/地区名称和与之对应的ID      输入参数：theRegionCode = 省市、国家ID或名称，    返回数据：一维字符串数组。
        ArrayOfString sh = weatherWSSoap.getSupportCityString("上海");
        //获得天气预报数据      输入参数：城市/地区ID或名称，    返回数据：一维字符串数组。
        ArrayOfString cityWeather = weatherWSSoap.getWeather("广州", null);
        //4、输出返回结果
        System.out.println(sh.getString());
        System.out.println(cityWeather.getString());
    }
}
