package com.lyw.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-22 19:01
 * @Description:
 */
@WebServlet("/servleta")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletA执行了");

        //请求转发
        /*
        *   通过getRequestDispatcher执行的
        *   服务器内部行为，客户端是不知道的，客户端只发送了一次请求
        *   服务器只产生了一个req和resp
        *   客户端地址是不变的
        *   请求的参数是可以继续传递的
        *   可以是动态资源和静态资源
        *   可以访问受到保护的资源
        *   *不可以访问外部资源
        *
        * */
        RequestDispatcher servletB = req.getRequestDispatcher("ServletB");
        servletB.forward(req, resp);

    }
}
