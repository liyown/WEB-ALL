package com.lyw.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
public class ServletConfig extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        *   将        <init-param>
                            <param-name>key1</param-name>
                            <param-value>value1</param-value>
                      </init-param>
            的配置以键值对的形式存入servletconfig对象，并且在初始化的时候传入servlet init()方法


            通过getInitParameter()获取值

        *
        *
        * */


        jakarta.servlet.ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig.getInitParameter("key1"));


    }
}
