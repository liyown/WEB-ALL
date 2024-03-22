package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/servletlifecycle", loadOnStartup = -1)
public class ServletLIfeCycle extends HttpServlet {

    /*
          声明周期                  执行方法                    执行事件
    *   1 实例化                    构造器                    第一次请求/服务请求的时候
    *   2 初始化                    servlet中的init方法        第一次请求/服务请求的时候
    *   3 接收请求 处理请求 服务       service方法               每一次访问
    *   4 销毁                      destroy                  关闭tomcat
    *   单例模式：
            成员变量是共享的 不建议修改变量
    * */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
