package com.lyw.dao.impl;

import com.lyw.dao.interface_.SysUserDao;
import com.lyw.pojo.SysUser;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 15:24
 * @Description:
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public List<SysUser> findAll() {
        String sql = "SELECT uid, username, user_pwd userpwd from sys_user";
        return baseMultiObjectQuery(SysUser.class, sql);
    }

    @Override
    public SysUser findUser(SysUser sysUser) {
        String sql = "SELECT uid, username, user_pwd userpwd from sys_user where username = ?";
        return baseObjectQuery(SysUser.class, sql, sysUser.getUserName());
    }

    @Override
    public int addSysUser(SysUser sysUser) {
        // 判断用户是否存在
        String sql1 = "SELECT uid, username, user_pwd userpwd from sys_user where username = ?";
        SysUser sysUser1 = baseObjectQuery(SysUser.class, sql1, sysUser.getUserName());
        if (sysUser1 != null) {
            return 0;
        }
        String sql = "INSERT INTO sys_user(username, user_pwd) VALUES(?, ?)";
        return baseUpdate(sql,sysUser.getUserName(),sysUser.getUserPwd());
    }
}

