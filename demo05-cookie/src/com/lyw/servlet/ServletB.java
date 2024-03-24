package com.lyw.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 22:04
 * @Description:
 */
@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // session的使用
        // 1. 获取session对象
        HttpSession session = req.getSession();
        // 2. 设置session的属性
        session.setAttribute("key", "value");
        // 3. 获取session的属性
        Object key = session.getAttribute("key");
        // 4. 移除session的属性
        session.removeAttribute("key");
        // 5. 销毁session对象
        session.invalidate();
        // 6. session的时效性
        session.setMaxInactiveInterval(60 * 60 * 24 * 7);
        // 14. session的应用场景 1. 购物车  2. 登录验证  3. 记录用户的访问次数
        //                     4. 记录用户的访问时间  5. 记录用户的访问路径  6. 记录用户的访问IP
        // 15. session的底层原理
        //     * session是依赖于cookie的
        //     * session的id是存储在cookie中的
        //     * session的数据是存储在服务器中的


    }
}
