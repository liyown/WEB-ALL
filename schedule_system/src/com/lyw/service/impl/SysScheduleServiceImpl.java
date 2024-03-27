package com.lyw.service.impl;

import com.lyw.dao.impl.SysScheduleDaoImpl;
import com.lyw.pojo.SysSchedule;
import com.lyw.service.interface_.SysScheduleService;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 17:05
 * @Description:
 */
public class SysScheduleServiceImpl implements SysScheduleService {
    private final SysScheduleDaoImpl sysScheduleDao = new SysScheduleDaoImpl();

    public List<SysSchedule> selectAllScheduleForUid(int uid) {
        return sysScheduleDao.selectAllScheduleForUid(uid);
    }

    public int updateSchedule(SysSchedule sysSchedule) {
        return sysScheduleDao.updateSchedule(sysSchedule);
    }

    public SysSchedule selectScheduleForSid(int sid) {
        return sysScheduleDao.selectScheduleForSid(sid);
    }

    public int deleteSchedule(int sid) {
        return sysScheduleDao.deleteSchedule(sid);
    }
    public int addSchedule(SysSchedule sysSchedule) {
        return sysScheduleDao.addSysSchedule(sysSchedule);
    }
}
