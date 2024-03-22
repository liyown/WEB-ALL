package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author: liuyaowen
 * @create: 2024-03-22 17:04
 * @Description: HttpServletRequest相关API的学习
 */
@WebServlet("/request")
public class ServletHttpServletRequest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //     行相关 GET/POST url http/1.1
        System.out.println(req.getMethod());// GET
        System.out.println(req.getScheme());// http
        System.out.println(req.getProtocol());// HTTP/1.1
        System.out.println(req.getRequestURI());///demo_servletconfig_servletcontext_war_exploded/request  路径要求
        System.out.println(req.getRequestURL());// http://localhost:8080/demo_servletconfig_servletcontext_war_exploded/request
        System.out.println(req.getLocalPort());// 8080
        System.out.println(req.getRemotePort());// 55717
        System.out.println(req.getServerPort());// 8080

        //     头相关 key:value
        System.out.println(req.getHeader("accept"));
        System.out.println(req.getHeaderNames());

        //     请求的表单
        System.out.println(req.getParameter("hobby"));// 获取单个值
        System.out.println(Arrays.toString(req.getParameterValues("hobby")));// 多个值
        System.out.println(req.getParameterMap());// 返回一个map

        //     非键值对的读取
        System.out.println(req.getReader());
        System.out.println(req.getInputStream());


    }
}
