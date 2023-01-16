package net.czqu.openimserver.dto.user;

import java.util.List;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/1/16 19:43
 */
public class AccountCheckListDTO {
    private List<String> checkUserIDList;
    private String operationID;

    public List<String> getCheckUserIDList() {
        return checkUserIDList;
    }

    public String getOperationID() {
        return operationID;
    }

    public void setCheckUserIDList(List<String> checkUserIDList) {
        this.checkUserIDList = checkUserIDList;
    }

    public void setOperationID(String operationID) {
        this.operationID = operationID;
    }
}
