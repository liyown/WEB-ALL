package com.lyw.controller;

import com.lyw.common.ResultCodeEnum;
import com.lyw.pojo.SysSchedule;
import com.lyw.service.impl.SysScheduleServiceImpl;
import com.lyw.service.impl.SysUserServiceImpl;
import com.lyw.util.WebUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 17:09
 * @Description: 增加日程 /schedule/add
 * 删除日程 /schedule/delete
 * 更新日程 /schedule/update
 * 查询日程 /schedule/select
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {
    private final SysScheduleServiceImpl sysScheduleService = new SysScheduleServiceImpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) {
        // 添加
        SysSchedule sysSchedule = WebUtil.readJsonFromRequest(req, SysSchedule.class);
        assert sysSchedule != null;
        int rows = sysScheduleService.addSchedule(sysSchedule);
        if (rows > 0) {
            // 添加成功
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.SUCCESS, null);
            System.out.println("add success");
        } else {
            // 添加失败
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.FAIL, null);
            System.out.println("add fail");
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 删除
        SysSchedule sysSchedule = WebUtil.readJsonFromRequest(req, SysSchedule.class);
        assert sysSchedule != null;
        int rows = sysScheduleService.deleteSchedule(sysSchedule.getSid());
        if (rows > 0) {
            // 删除成功
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.SUCCESS, null);
        } else {
            // 删除失败
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.FAIL, null);
        }
        System.out.println("delete");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 更新
        SysSchedule sysSchedule = WebUtil.readJsonFromRequest(req, SysSchedule.class);
        assert sysSchedule != null;
        int rows = sysScheduleService.updateSchedule(sysSchedule);
        if (rows > 0) {
            // 更新成功
            System.out.println("update success");
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.SUCCESS, null);
        } else {
            // 更新失败
            SysSchedule previouSysSchedule = sysScheduleService.selectScheduleForSid(sysSchedule.getSid());
            WebUtil.writeJsonToResponse(resp, ResultCodeEnum.FAIL, previouSysSchedule);
        }
        System.out.println("update");
    }

    protected void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 查询
        System.out.println(req.getParameter("uid"));
        List<SysSchedule> sysScheduleList = sysScheduleService.selectAllScheduleForUid(Integer.parseInt(req.getParameter("uid")));

        WebUtil.writeJsonToResponse(resp, ResultCodeEnum.SUCCESS, sysScheduleList);
    }
}
