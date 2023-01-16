package net.czqu.openimserver.error.exception;

/**
 * @author ryan
 */
public interface IBaseErrorCode {
    public String getModule();

    public String getLevel();

    public String getErrCode();

    public String getFullErrCode();
}
