package com.lyw.dao.interface_;

import com.lyw.pojo.SysSchedule;
import com.lyw.pojo.SysUser;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 15:15
 * @Description:
 */
public interface SysUserDao {
    /**
     * 向用户表添加数据
     * @param sysUser  用户实体类
     * @return 返回影响数据库的行数 0 增加失败 大于0 增加成功
     */
    int addSysUser(SysUser sysUser);

    List<SysUser> findAll();


    /**
     * 查询用户
     * @param sysUser 用户实体类
     * @return 返回查询到的用户, 如果没有查询到返回null
     */
    SysUser findUser(SysUser sysUser);
}
