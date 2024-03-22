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
        //     获取servletContext参数
        //     1 获取servletContext对象
        jakarta.servlet.ServletContext servletContext = getServletContext();
        // 2 通过getInitParameter获取参数值
        System.out.println(servletContext.getInitParameter("keyContext"));

    }
}
