package net.czqu.openimserver.error.exception;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-16 21:42
 **/
public class UserException extends OpenImBaseException {
    public UserException(String msg, IBaseErrorCode errorCode) {
        super(msg, errorCode);
    }
}
