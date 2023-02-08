package net.czqu.openimserver.dto.user;


import net.czqu.openimserver.constant.Gender;
import net.czqu.openimserver.constant.GlobalRecvMsg;

import java.util.Date;

/**
 * @program: Open-IM-Server-In-Java
 * @description:
 * @author: czq
 * @create: 2023-01-08 14:27
 **/
public class UserInfoDTO {
    private String userId;
    private String name;
    private String faceUrl;
    private Gender gender;
    private String phoneNumber;
    private Date birth;
    private String email;
    private String ex;
    private String nickname;
    private Date createTime;

    private GlobalRecvMsg globalRecvMsg;

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
    public String getFaceUrl() {
        return faceUrl;
    }

    public UserInfoDTO setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public UserInfoDTO setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserInfoDTO setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEx() {
        return ex;
    }
    public UserInfoDTO setEx(String ex) {
        this.ex = ex;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserInfoDTO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserInfoDTO setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public GlobalRecvMsg getGlobalRecvMsg() {
        return globalRecvMsg;
    }

    public UserInfoDTO setGlobalRecvMsg(GlobalRecvMsg globalRecvMsg) {
        this.globalRecvMsg = globalRecvMsg;
        return this;
    }
}
