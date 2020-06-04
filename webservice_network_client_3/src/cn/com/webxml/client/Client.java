package cn.com.webxml.client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class Client {
    public static void main(String[] args) {
        //1、创建一个服务视图
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        //2、根据服务视图创建对应的实现类
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
        //3、调用方法 （查看文档）
        //获得国内手机号码归属地数据库信息    输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。
        ArrayOfString databaseInfo = mobileCodeWSSoap.getDatabaseInfo();
        //获得国内手机号码归属地省份、地区和手机卡类型信息  输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。
        String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("15876161217", "");
        //4、输出返回结果
        System.out.println(databaseInfo.getString());
        System.out.println(mobileCodeInfo);
    }
}
