package com.lyw.service.impl;

import com.lyw.dao.impl.SysUserDaoImpl;
import com.lyw.pojo.SysUser;
import com.lyw.service.interface_.SysUserService;
import com.lyw.util.MD5;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 17:03
 * @Description:
 */
public class SysUserServiceImpl implements SysUserService {

    private final SysUserDaoImpl sysUserDao = new SysUserDaoImpl();

    @Override
    public int register(SysUser sysUser) {
        sysUser.setUserPwd(MD5.encrypt(sysUser.getUserPwd()));
        return sysUserDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findUser(SysUser sysUser) {
        return sysUserDao.findUser(sysUser);
    }
}
