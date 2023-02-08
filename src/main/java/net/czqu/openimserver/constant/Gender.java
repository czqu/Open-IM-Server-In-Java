package net.czqu.openimserver.constant;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/1/17 23:01
 */


public enum Gender {
    //   "0", "未知"
    //   "1", "男性"
    //   “2", "女性“
    UNKNOWN(0, "unknown"),
    MALE(1, "male"), FEMALE(2, "female");
    private int id;
    private String value;

    Gender(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
