package cn.lcdiao.ssm.mapper;

import cn.lcdiao.ssm.entity.User;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    List<User> list();

    User getUser(Long id);
}