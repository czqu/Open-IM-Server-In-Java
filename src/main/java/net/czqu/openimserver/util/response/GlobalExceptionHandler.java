package net.czqu.openimserver.util.response;

import lombok.extern.slf4j.Slf4j;
import net.czqu.openimserver.error.exception.OpenImBaseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-08 22:06
 **/
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseResult runtimeExceptionHandler(Exception ex) {
        return ResponseResult.error().msg(ex.toString()).code("500");
    }

    @ResponseBody
    @ExceptionHandler(OpenImBaseException.class)
    public ResponseResult internalExceptionHandler(OpenImBaseException ex) {
        return ResponseResult.error().code(ex.getCode()).msg(ex.getErrMsg()).errCode(ex.getErrCode());
    }

}
