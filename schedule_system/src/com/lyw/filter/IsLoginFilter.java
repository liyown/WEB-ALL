package com.lyw.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-24 17:48
 * @Description:
 */
@WebFilter(urlPatterns = {"/showSchedule", "/schedule/*"})
public class IsLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 获取session对象
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        Object sysUser = session.getAttribute("SysUser");
        if (sysUser == null) {
            response.sendRedirect("/login.html");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
