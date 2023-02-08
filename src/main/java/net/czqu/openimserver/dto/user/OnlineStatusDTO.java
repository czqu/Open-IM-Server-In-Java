package net.czqu.openimserver.dto.user;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/2/7 22:28
 */
public class OnlineStatusDTO {
    String status;
    String userId;

    public OnlineStatusDTO(String status, String userId) {
        this.status = status;
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public OnlineStatusDTO setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public OnlineStatusDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
