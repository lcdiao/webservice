package cn.lcdiao.ssm;

import cn.lcdiao.ssm.service.User;
import cn.lcdiao.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class WebserviceTest {
    @Resource
    private UserService wsUserService;

    @Test
    public void test(){
        User user = wsUserService.getUser(1L);
        System.out.println(user);
    }
}
