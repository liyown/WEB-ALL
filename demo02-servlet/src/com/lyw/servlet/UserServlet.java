package com.lyw.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1 创建javaweb项目，将tomcat加入项目
 * 2 重写service方法
 * 3 在service方法定义业务代码
 * 4 在web.xml配置servlet对应的请求路径映射
 *      绑定别名
 *      设置映射
 *
 *
 *  注意问题
 * 1 servlet-api.jar导入问题
 *  编码的时候需要，构建的时候不需要加入
 * 2 content-typr 响应头问题
 *      MIME响应头：文件类型
 *      用于告诉客户端响应的是什么数据，以此决定用什么格式解析，《默认是用HTML解析》
 *
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 1 在req中拿到请求报文中的任何信息
        * 2 处理业务代码
        * 3 将要响应的数据封装到resp
        *   获取响应报文体的打印流，再写入字符
        *
        *  */
        String userName = req.getParameter("userName");

        String info = "YES";

        if ("liuyaowen".equals(userName)) {
            info = "NO";
        }
        // 获取一个向响应体中打印字符的打印流
        // 设置content-type
        resp.setHeader("content-type","text/html");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.write(info);
    }
}
