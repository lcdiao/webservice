package cn.lcdiao.ssm.client.controller;

import cn.lcdiao.ssm.service.User;
import cn.lcdiao.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class WSUserController {
    @Resource(name= "wsUserService")
    private UserService wsUserService;

    @RequestMapping("list")
    @ResponseBody
    public List<User> list(Long id) {
        return wsUserService.list();
    }
}
