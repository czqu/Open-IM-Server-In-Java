package net.czqu.openimserver.dto.user;

import java.util.List;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/2/1 11:08
 */
public class UserIdListDTO {
    private List<String> userIdList;

    private String oprationId;

    public List<String> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
    }

    public String getOprationId() {
        return oprationId;
    }

    public void setOprationId(String oprationId) {
        this.oprationId = oprationId;
    }

    @Override
    public String toString() {
        return "UserIdListDTO{" +
                "userIdList=" + userIdList +
                ", oprationId='" + oprationId + '\'' +
                '}';
    }
}
