package com.example.knback.service;

import com.example.knback.entity.LoginUser;
import com.example.knback.utils.ResponseUtil;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);
}
