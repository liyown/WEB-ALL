package com.lyw.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 21:54
 * @Description:
 */
@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 1 cookie的时效性
        *   * 默认情况下, cookie是会话级别的, 浏览器关闭, cookie就会消失
        *   * 如果想让cookie持久化, 需要设置cookie的时效性，通过setMaxAge(int seconds)方法设置
        *   * 如果设置了时效性, 浏览器关闭, cookie不会消失
        *   * 如果设置了时效性, 但是没有设置值, cookie会立即消失
        * 2 cookie的路径
        *   * 默认情况下, cookie可以被任何路径下的资源获取
        *   * 如果想让cookie在其他路径下获取, 需要设置cookie的路径, 通过setPath(String uri)方法设置
        *   * 如果设置了路径, 只有在设置的路径下的资源才能获取cookie
        * */
        // 创建cookie对象
        Cookie cookie = new Cookie("key", "value");

        cookie.setPath("/demo05/ServletB");
        // 设置cookie的时效性
        cookie.setMaxAge(60 * 60 * 24 * 7);

        ServletContext servletContext = req.getServletContext();
        System.out.println(servletContext.getContextPath());
        System.out.println(servletContext.getRealPath("/"));
        System.out.println(servletContext.getContext("/demo05/ServletB").getContextPath());

        // 将cookie对象添加到响应
        resp.addCookie(cookie);

    }
}
