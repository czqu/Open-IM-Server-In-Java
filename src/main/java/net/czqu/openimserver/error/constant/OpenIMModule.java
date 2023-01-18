package net.czqu.openimserver.error.constant;

/**
 * @author ryan
 */

public enum OpenIMModule {
    /**
     * 用户模块
     */
    USER("user", "10");

    private String value;
    private String code;

    OpenIMModule(String value, String code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

}
