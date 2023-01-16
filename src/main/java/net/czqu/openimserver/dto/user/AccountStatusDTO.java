package net.czqu.openimserver.dto.user;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: chatelier
 * @create: 2023/1/16 19:53
 */
public class AccountStatusDTO {
    private String accountStatus;
    private String userID;

    public AccountStatusDTO(String accountStatus, String userID) {
        this.accountStatus = accountStatus;
        this.userID = userID;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
