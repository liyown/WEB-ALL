package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletContext")
public class ServletContext extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //      获取servletContext参数

        //  1   获取servletContext对象
        jakarta.servlet.ServletContext servletContext = getServletContext();
        // 2 通过getInitParameter获取参数值
        System.out.println(servletContext.getInitParameter("keyContext"));

        //  3   获得项目部署某个文件或者某个文件夹的项目目录
        String path = servletContext.getRealPath("");

        //  4   获得项目的访问路径
        //      为了获取资源的绝对路径或者相对路径使用的
        String appPath = servletContext.getContextPath();// /demo_servletconfig_servletcontext_war_exploded
        System.out.println(appPath);

        // 向 servletContext 存放，修改，获取，删除数据 键值对
        servletContext.setAttribute("k", "v");
        servletContext.getAttribute("k");
        servletContext.removeAttribute("k");
    }
}
