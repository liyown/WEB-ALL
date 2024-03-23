package com.lyw.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

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

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 添加
        System.out.println("add");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 删除
        System.out.println("delete");
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 更新
        System.out.println("update");
    }

    protected void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 查询
        System.out.println("select");
    }
}
