package cn.lcdiao.ssm.service;

import cn.lcdiao.ssm.entity.User;

import javax.jws.WebService;
import java.util.List;
@WebService
public interface UserService{


    int insert(User record);

    int insertSelective(User record);

    List<User> list();

    User getUser(Long id);

}
