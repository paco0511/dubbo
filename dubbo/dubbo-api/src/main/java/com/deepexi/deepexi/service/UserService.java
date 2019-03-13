package com.deepexi.deepexi.service;

import com.deepexi.deepexi.domain.eo.User;
import com.deepexi.util.pageHelper.PageBean;
import java.util.*;

public interface UserService {

    PageBean<User> findPage(User eo, Integer page, Integer size);

    List<User> findAll(User eo);

    User detail(Integer pk);

    Boolean update(Integer pk, User eo);

    Boolean create(User eo);

    Boolean delete(Integer... pk);

    User find(Integer pk);
}