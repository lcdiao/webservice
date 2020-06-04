package cn.lcdiao.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.jws.WebService;

import cn.lcdiao.ssm.mapper.UserMapper;
import cn.lcdiao.ssm.entity.User;
import cn.lcdiao.ssm.service.UserService;

import java.util.List;

@Service
@WebService
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

}
