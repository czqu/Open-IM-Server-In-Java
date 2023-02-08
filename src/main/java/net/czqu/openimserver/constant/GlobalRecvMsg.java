package net.czqu.openimserver.constant;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/2/8 19:59
 */
public enum GlobalRecvMsg {
    RECV_MSG(0,"ReceiveMessage"), NOT_RECV_MSG(1,"NotReceiveMessage"),
    RECV_NOT_NOTIFY_MSG(2, "ReceiveNotNotifyMessage");
    private int id;
    private String value;

    GlobalRecvMsg(int id, String value) {
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
