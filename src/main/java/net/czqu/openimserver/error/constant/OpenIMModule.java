package net.czqu.openimserver.error.constant;

/**
 * @author ryan
 */

public enum OpenIMModule {
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

    public OpenIMModule setValue(String value) {
        this.value = value;
        return this;
    }

    public String getCode() {
        return code;
    }

    public OpenIMModule setCode(String code) {
        this.code = code;
        return this;
    }
}
