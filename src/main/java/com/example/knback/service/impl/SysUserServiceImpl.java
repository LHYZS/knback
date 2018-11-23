package com.example.knback.service.impl;

import com.example.knback.dao.SysUserRepository;
import com.example.knback.entity.LoginUser;
import com.example.knback.entity.SysUser;
import com.example.knback.service.SysUserService;
import com.example.knback.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepository;

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepository.findSysUserByEmail(loginUser.getEmail());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "登陆成功", sysUser);
            } else {
                return new ResponseUtil(0, "密码错误");
            }
        } else {
            return new ResponseUtil(0, "邮箱错误");
        }
    }
}
