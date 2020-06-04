package cn.lcdiao.ssm.controller;

import cn.lcdiao.ssm.entity.User;
import cn.lcdiao.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(Long id) {
        User user = userService.getUser(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> list(Long id) {
        return userService.list();
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ResponseBody
    public int insert(@RequestBody User user) {
        return userService.insertSelective(user);
    }
}
