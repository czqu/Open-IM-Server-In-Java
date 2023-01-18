package net.czqu.openimserver.dto;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Date;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-08 14:27
 **/
@SuppressFBWarnings(value = {"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class UserInfoDTO {
    private String userId;
    private String name;
    private String phone;
    private String email;
    private Date birth;

    public String getUserId() {
        return userId;
    }

    public UserInfoDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserInfoDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserInfoDTO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInfoDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getBirth() {
        return birth;
    }

    public UserInfoDTO setBirth(Date birth) {
        this.birth = birth;
        return this;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" + "userId='" + userId + '\'' + ", name='" + name + '\'' + ", phone='" + phone + '\''
            + ", email='" + email + '\'' + ", birth=" + birth + '}';
    }
}
