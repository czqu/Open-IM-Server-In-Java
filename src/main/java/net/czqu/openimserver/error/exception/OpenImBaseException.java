package net.czqu.openimserver.error.exception;

import net.czqu.openimserver.error.constant.ExceptionLevelEnum;
import net.czqu.openimserver.error.constant.OpenIMModule;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-16 20:54
 **/
public class OpenImBaseException extends Exception implements IBaseException {
    private IBaseErrorCode errorCode;
    private String msg;

    public OpenImBaseException(String msg, IBaseErrorCode errorCode) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    @Override
    public String getErrMsg() {
        return msg;
    }

    @Override
    public String getErrCode() {
        return errorCode.getErrCode();
    }

    @Override
    public String getCode() {
        return errorCode.getFullErrCode();
    }
}
