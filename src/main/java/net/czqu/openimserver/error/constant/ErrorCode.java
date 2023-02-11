package net.czqu.openimserver.error.constant;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.czqu.openimserver.error.exception.IBaseErrorCode;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-16 21:22
 * @param: <errCode><为了兼容>
 **/
@SuppressFBWarnings(value = {"ME_ENUM_FIELD_SETTER"})
public enum ErrorCode implements IBaseErrorCode {
    //
    //    500", "操作失败
    // "404", "参数检验失败"),
    //   401", "暂未登录或token已经过期
    //  "403", "没有相关权限
    // user
    USER_NOT_FOUND(OpenIMModule.USER, ExceptionLevelEnum.ERROR, "00", "user not found", "404"),
    USER_ID_INVALID(OpenIMModule.USER, ExceptionLevelEnum.ERROR, "01", "user id invalid", "404"),
    USER_PARAM_ERR(OpenIMModule.USER, ExceptionLevelEnum.ERROR, "02", "", "404"),
    ;
    private OpenIMModule module;
    private ExceptionLevelEnum level;
    private String code;
    private String msg;
    private String errCode;

    ErrorCode(OpenIMModule module, ExceptionLevelEnum exceptionLevelEnum, String code, String msg, String errCode) {
        this.module = module;
        this.level = exceptionLevelEnum;
        this.code = code;
        this.msg = msg;
        this.errCode = errCode;
    }

    @Override
    public String getModule() {
        return module.getValue();
    }

    @Override
    public String getLevel() {
        return level.getValue();
    }

    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getFullErrCode() {
        StringBuilder sb = new StringBuilder();
        sb.append(module.getCode());
        sb.append(level.getId());
        sb.append(code);
        return sb.toString();
    }


}
