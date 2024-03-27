package com.lyw.common;

/**
 * @author: liuyaowen
 * @poject: WEB-ALL
 * @create: 2024-03-24 20:51
 * @Description: 响应的结果枚举 用于返回结果的状态码 以及对应的信息
 */
public enum ResultCodeEnum {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    UERNAME_ERROR(400, "用户名错误"),
    PASSWORD_ERROR(401, "密码错误"),
    NOT_LOGIN(402, "未登录"),
    USERNAME_EXIST(403, "用户名已存在");

    private final int code;
    private final String message;

    private ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
