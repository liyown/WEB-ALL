package com.lyw.test;

import com.lyw.dao.impl.SysScheduleDaoImpl;
import com.lyw.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 16:35
 * @Description:
 */
public class TestScheduleDaoImpl {

    private static SysScheduleDaoImpl sysScheduleDao;
    @BeforeClass
    public static void  newClass() {
        sysScheduleDao = new SysScheduleDaoImpl();
    }
    @Test
    public void testAddShedule() {
        sysScheduleDao.addSysSchedule(new SysSchedule(0 ,1, "吃饭", 0));
        List<SysSchedule> all = sysScheduleDao.findAll();
        System.out.println(all);

    }

    @Test
    public void testFindAll() {
        List<SysSchedule> all = sysScheduleDao.findAll();
        System.out.println(all);
    }
}
