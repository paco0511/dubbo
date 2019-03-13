package com.deepexi.deepexi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.deepexi.domain.eo.User;
import com.deepexi.deepexi.mapper.UserMapper;
import com.deepexi.deepexi.service.UserService;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageBean findPage(User eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<User> findAll(User eo) {
        List<User> list = userMapper.findList(eo);
        return list;
    }
    @Override
    public User detail(Integer  pk) {
        return userMapper.selectById(pk);
    }

    @Override
    public Boolean create(User eo) {
        int result = userMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer... pk) {
        int result = userMapper.delete(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public User find(Integer pk) {
        return userMapper.find(pk);
    }


    @Override
    public Boolean update(Integer  pk,User eo) {
        eo.setId(pk);
        int result = userMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }


}