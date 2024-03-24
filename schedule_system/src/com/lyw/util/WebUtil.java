package com.lyw.util;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.lyw.common.Result;
import com.lyw.common.ResultCodeEnum;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-24 21:35
 * @Description:
 */
public class WebUtil {
    public static <T> void writeJsonToResponse(HttpServletResponse response, ResultCodeEnum resultCodeEnum, T data) {
        try {
            response.getWriter().write(JSONObject.toJSONString(Result.build(resultCodeEnum, data), JSONWriter.Feature.WriteMapNullValue));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从请求中读取json数据
     *
     * @param request 请求
     * @param clazz   类
     * @param <T>     泛型
     * @return 返回类型 T
     */
    public static <T> T readJsonFromRequest(HttpServletRequest request, Class<T> clazz) {
        try {
            request.setCharacterEncoding("UTF-8");
            StringBuilder sb = new StringBuilder();
            while (request.getReader().readLine() != null) {
                sb.append(request.getReader().readLine());
            }
            return JSONObject.parseObject(sb.toString(), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
