package net.czqu.openimserver.util.response;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2022-12-24 15:27
 **/
public enum ResultCode {
    SUCCESS("200", ""),
    FAILED("500", "操作失败"),
    VALIDATE_FAILED("404", "参数检验失败"),
    UNAUTHORIZED("401", "暂未登录或token已经过期"),
    FORBIDDEN("403", "没有相关权限");
    private String code;
    private String message;

    private ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public ResultCode setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultCode setMessage(String message) {
        this.message = message;
        return this;
    }
}