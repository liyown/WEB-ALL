package com.lyw.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyw.dao.impl.SysScheduleDaoImpl;
import com.lyw.dao.impl.SysUserDaoImpl;
import com.lyw.pojo.SysSchedule;
import com.lyw.pojo.SysUser;
import com.lyw.util.WebUtil;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;


/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 16:55
 * @Description:
 */
public class TestSysUserDaoImpl {
    private static SysUserDaoImpl sysUserDaoImpl;
    @BeforeClass
    public static void  newClass() {
        sysUserDaoImpl = new SysUserDaoImpl();
    }
    @Test
    public void testAddShedule() {
        sysUserDaoImpl.addSysUser(new SysUser(0, "刘耀文", "123456"));
        List<SysUser> all = sysUserDaoImpl.findAll();
        System.out.println(all);

    }

    @Test
    public void testFindAll() {
        List<SysUser> all = sysUserDaoImpl.findAll();
        System.out.println(all);
    }
    @Test
    public void test11() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String ss = "{\"username\":\"qweqwe\",\"password\":\"123123\"}";

        SysUser sysUser =  objectMapper.readValue(ss, SysUser.class);
        System.out.println(sysUser);

    }

}
