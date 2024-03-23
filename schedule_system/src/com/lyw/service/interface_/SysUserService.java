package com.lyw.service.interface_;

import com.lyw.pojo.SysUser;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 17:01
 * @Description:定义了以SysUser表格的业务
 */
public interface SysUserService {
    /**
     * 注册用户
     * @param sysUser 用户对象
     * @return 返回受影响的行数 0 注册失败 大于0 注册成功
     */
    int register(SysUser sysUser);

    /**
     * 登录
     * @param sysUser 用户对象
     * @return 返回登录状态 0 登录成功 -1 密码错误 -2 用户不存在
     */
    int login(SysUser sysUser);
}
