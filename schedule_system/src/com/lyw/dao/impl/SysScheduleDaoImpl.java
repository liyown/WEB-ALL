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
        String sqlid = "SELECT LAST_INSERT_ID()";
        int rows = baseUpdate(sql, sysSchedule.getUid(), sysSchedule.getTitle(), sysSchedule.getCompleted());
        if (rows > 0) {
            return baseObjectQuery(Integer.class, sqlid);
        }
        return 0;

    }

    public List<SysSchedule> selectAllScheduleForUid(int uid) {
        String sql = "SELECT sid, uid, title, completed from sys_schedule where uid = ?";
        return baseMultiObjectQuery(SysSchedule.class, sql, uid);
    }

    public int updateSchedule(SysSchedule sysSchedule) {
        String sql = "UPDATE sys_schedule SET title = ?, completed = ? WHERE sid = ?";
        return baseUpdate(sql, sysSchedule.getTitle(), sysSchedule.getCompleted(), sysSchedule.getSid());
    }

    public SysSchedule selectScheduleForSid(int sid) {
        String sql = "SELECT sid, uid, title, completed from sys_schedule where sid = ?";
        return baseObjectQuery(SysSchedule.class, sql, sid);
    }

    public int deleteSchedule(int sid) {
        String sql = "DELETE FROM sys_schedule WHERE sid = ?";
        return baseUpdate(sql, sid);
    }
}
