package net.czqu.openimserver.error.constant;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-16 20:54
 **/
public enum ExceptionLevelEnum {
    INFO(0, "info"),
    WARN(1, "warn"),
    ERROR(2, "error");

    ExceptionLevelEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    ExceptionLevelEnum(int id, String value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public ExceptionLevelEnum setId(int id) {
        this.id = id;
        return this;
    }

    public java.lang.String getValue() {
        return value;
    }

    public ExceptionLevelEnum setValue(java.lang.String value) {
        this.value = value;
        return this;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public ExceptionLevelEnum setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }


    private int id;
    private String value;
    private String description;
}

