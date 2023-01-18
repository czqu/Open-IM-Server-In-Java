package net.czqu.openimserver.error.exception;

/**
 * @author ryan
 */
public interface IBaseErrorCode {
    /**
     * 获取模块名
     * @author: czq
     * @return
     */
    public String getModule();
    /**
     * 获取错误等级
     * @author: czq
     * @return
     */
    public String getLevel();
    /**
     * 获取错误代码
     * @author: czq
     * @return
     */
    public String getErrCode();
    /**
     * 返回错误代码（新）
     * @author: czq
     * @return 错误代码
     */
    public String getFullErrCode();
}
