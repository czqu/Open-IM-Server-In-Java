package net.czqu.openimserver.constant;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/2/6 22:49
 */
public enum OnlineStatus {
    //   "1", "在线"
    //   “2", "离线"
    ONLINE_STATUS(1,"online"), OFFLINE_STATUS(2,"offline");
    private int id;
    private String value;

    OnlineStatus(int id, String value) {
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
