package com.example.knback.controller;

import com.example.knback.entity.LoginUser;
import com.example.knback.service.SysUserService;
import com.example.knback.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lihongyu
 */
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn( LoginUser loginUser) {
        System.out.println(loginUser);
        return sysUserService.userLogin(loginUser);
    }
}
