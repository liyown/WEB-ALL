package com.lyw.controller;

import com.lyw.pojo.SysUser;
import com.lyw.service.impl.SysUserServiceImpl;
import com.lyw.service.interface_.SysUserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-23 17:07
 * @Description:
 */
@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private final SysUserServiceImpl sysUserService = new SysUserServiceImpl();

    /**
     * 注册的业务接口
     * @param request  请求
     * @param response 响应
     */
    protected void register(HttpServletRequest request, HttpServletResponse response) {
        //     接收用户参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //  调用服务方法
        SysUser sysUser = new SysUser(null, username, password);
        int rows = sysUserService.register(sysUser);

        if (rows > 0) {
            // 注册成功
            try {
                response.sendRedirect(request.getContextPath() + "/registSuccess.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // 注册失败
            try {
                response.sendRedirect(request.getContextPath() + "/registFail.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 登录的业务接口
     * @param request  请求
     * @param response 响应
     */
    protected void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //     接收用户参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //  调用服务方法
        SysUser sysUser = new SysUser(null, username, password);
        int loginFlag = sysUserService.login(sysUser);

        if (loginFlag == 0) {
            // 登录成功
            request.getSession().setAttribute("SysUser", sysUser);
            response.sendRedirect(request.getContextPath() + "/showSchedule.html");
        } else if (loginFlag == -1) {
            // 密码错误
            response.sendRedirect(request.getContextPath() + "/loginUserPasswordError.html");

        } else {
            // 用户不存在
            response.sendRedirect(request.getContextPath() + "/loginUserNameError.html");

        }

    }
}
