package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

import java.util.Objects;

/**
 * Created by 24102 on 2017/6/10.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}