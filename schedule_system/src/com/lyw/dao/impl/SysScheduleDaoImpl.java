package com.lyw.dao.impl;

import com.lyw.dao.interface_.SysScheduleDao;
import com.lyw.pojo.SysSchedule;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 15:24
 * @Description:
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {

    @Override
    public List<SysSchedule> findAll() {
        String sql = "SELECT sid, uid, title, completed from sys_schedule";
        return baseMultiObjectQuery(SysSchedule.class, sql);
    }

    @Override
    public int addSysSchedule(SysSchedule sysSchedule) {
        String sql = "INSERT INTO sys_schedule VALUES(DEFAULT,?,?,?)";
        return baseUpdate(sql, sysSchedule.getUid(), sysSchedule.getTitle(), sysSchedule.getCompleted());
    }
}
