package com.lyw.filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-24 12:43
 * @Description: 1 实现Filter接口
 * 2 重写过滤方法 doFilter
 * 3 配置过滤器
 * * web.xml
 * * 注解
 * 4 过滤器的生命周期 init  doFilter  destroy
 * 5 过滤器的执行顺序 1. web.xml中配置的顺序 2. 注解中配置的顺序
 * 6 过滤器的应用场景 1. 编码过滤器 2. 登录验证过滤器 3. 日志过滤器 4. 资源过滤器
 */
public class LoggingFilter implements Filter {
    /**
     * 1 请求到达目标资源之前执行
     * 2 过滤请求
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*
                // 1 请求到达目标资源之前判断
                //   * 判断请求是否合法

                // 2 放行代码
        */
        System.out.println("请求到达目标资源之前执行");

        // 放行代码
        filterChain.doFilter(servletRequest, servletResponse);


        System.out.println("请求到达目标资源之后执行");
    }
}
