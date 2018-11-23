package com.example.knback.dao;

import com.example.knback.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lihongyu
 */
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findSysUserByEmail(String email);
}