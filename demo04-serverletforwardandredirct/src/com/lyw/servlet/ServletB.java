package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-22 19:03
 * @Description:
 */
@WebServlet("/servletb")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletB执行了");

        // 响应重定向
        /*
        *   特点
        *   1、通过HttpServletResponse.sendRedirect
        *   2、客户端行为，客户端地址在变化，客户端产生了至少两次请求
        *   3、后端有多个request对象，不能传递
        *   4、不能是保护资源
        *   5、可以是外部资源
        * */
        // resp.setStatus(302);
        // resp.setHeader("location","servleta");
        resp.sendRedirect("servleta");

    }
}
