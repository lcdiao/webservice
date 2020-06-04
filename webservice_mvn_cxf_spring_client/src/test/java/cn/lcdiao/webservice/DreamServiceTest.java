package cn.lcdiao.webservice;

import cn.lcdiao.IDreamService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DreamServiceTest {

    @Test
    public void dreamTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        IDreamService dreamService = context.getBean(IDreamService.class);
        String me = dreamService.query("我");
        System.out.println(me);
    }
}
