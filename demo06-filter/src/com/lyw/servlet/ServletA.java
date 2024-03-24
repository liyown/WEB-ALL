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
 * @create: 2024-03-24 12:40
 * @Description:
 */
@WebServlet(value="/ServletA",name = "ServletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("ServletA");

    }
}
