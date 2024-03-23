package com.lyw.dao.interface_;

import com.lyw.pojo.SysSchedule;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 15:15
 * @Description:
 */
public interface SysScheduleDao {
    /**
     * 向日程表添加数据
     * @param sysSchedule  日程实体类
     * @return 返回影响数据库的行数 0 增加失败 大于0 增加成功
     */
    int addSysSchedule(SysSchedule sysSchedule);

    List<SysSchedule> findAll();
}
