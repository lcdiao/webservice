package cn.lcdiao;

import cn.com.webxml.EnglishChineseSoap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class translateTest {

    @Resource
    private EnglishChineseSoap translate;

    @Test
    public void test() {
        List<String> happy = translate.translatorString("happy").getString();
        happy.forEach(System.out::println);
        System.out.println("===========");
        System.out.println(happy.get(3));
        System.out.println("===========");
        List<String> list = translate.translatorString("你好").getString();
        list.forEach(System.out::println);
        System.out.println("===========");
        System.out.println(list.get(3));
    }
}
