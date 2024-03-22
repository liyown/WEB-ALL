package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: liuyaowen
 * @create: 2024-03-22 17:38
 * @Description:
 */
public class ServletHttpServletResponse extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置相应行  协议  状态码   描述符
        resp.setStatus(404);//状态码
        //设置响应头
        resp.setHeader("aaa","bbb");

        resp.setContentType("text/html");//MiME

        //响应体 写字符和写字节
        PrintWriter writer = resp.getWriter();
        ServletOutputStream outputStream = resp.getOutputStream();

    }
}
