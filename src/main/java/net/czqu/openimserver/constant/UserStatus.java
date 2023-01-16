package net.czqu.openimserver.constant;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/1/16 20:12
 */
public enum UserStatus {
    REGISTERED(1,"registered"),UNREGISTERED(2,"unregistered");
    private int id;
    private String value;

    UserStatus(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
