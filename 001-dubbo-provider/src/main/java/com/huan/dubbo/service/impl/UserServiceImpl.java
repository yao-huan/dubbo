package com.huan.dubbo.service.impl;

import com.huan.dubbo.service.IUserService;

/**
 * @author Administrator
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String hello(String msg) {
        return "hello"+msg;
    }
}
