package cn.com.webxml.client;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.EnglishChinese;
import cn.com.webxml.EnglishChineseSoap;

public class Client {
    public static void main(String[] args) {
        //1、创建服务视图对象
        EnglishChinese englishChinese = new EnglishChinese();
        //2、创建服务的实体类
        EnglishChineseSoap port = englishChinese.getEnglishChineseSoap();
        //3、调用方法
/*GetMp3
获得朗读MP3字节流
输入参数：Mp3 = Mp3名称； 返回数据：字节数组 Byte[]。
SuggestWord
获得候选词
输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。
Translator
中英文双向翻译 DataSet
输入参数：wordKey = 单词； 返回数据：DataSet。（包括全部数据三个DataTable）
TranslatorReferString
中英文双向翻译（相关词条）String()
输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。
TranslatorSentenceString
中英文双向翻译（例句）String()
输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。
TranslatorString
中英文双向翻译（基本）String()
输入参数：wordKey = 单词； 返回数据：一维字符串数组 String[]。*/
        ArrayOfString hello = port.translatorString("你好");
        System.out.println(hello.getString());
        System.out.println("=============");
        ArrayOfString hello1 = port.translatorString("hello");
        System.out.println(hello1.getString());
    }
}
