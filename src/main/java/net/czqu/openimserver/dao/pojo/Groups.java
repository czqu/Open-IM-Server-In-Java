package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Groups implements Cloneable {
    private String groupId;

    private String name;

    private String notification;

    private String introduction;

    private String faceUrl;

    private Date createTime;

    private Integer status;

    private String creatorUserId;

    private Integer groupType;

    private Integer needVerification;

    private Integer lookMemberInfo;

    private Integer applyMemberFriend;

    private Date notificationUpdateTime;

    private String notificationUserId;

    private String ex;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification == null ? null : notification.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId == null ? null : creatorUserId.trim();
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Integer getNeedVerification() {
        return needVerification;
    }

    public void setNeedVerification(Integer needVerification) {
        this.needVerification = needVerification;
    }

    public Integer getLookMemberInfo() {
        return lookMemberInfo;
    }

    public void setLookMemberInfo(Integer lookMemberInfo) {
        this.lookMemberInfo = lookMemberInfo;
    }

    public Integer getApplyMemberFriend() {
        return applyMemberFriend;
    }

    public void setApplyMemberFriend(Integer applyMemberFriend) {
        this.applyMemberFriend = applyMemberFriend;
    }

    public Date getNotificationUpdateTime() {
        return notificationUpdateTime;
    }

    public void setNotificationUpdateTime(Date notificationUpdateTime) {
        this.notificationUpdateTime = notificationUpdateTime;
    }

    public String getNotificationUserId() {
        return notificationUserId;
    }

    public void setNotificationUserId(String notificationUserId) {
        this.notificationUserId = notificationUserId == null ? null : notificationUserId.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static Groups.Builder builder() {
        return new Groups.Builder();
    }

    @Override
    public Groups clone() throws CloneNotSupportedException {
        return (Groups) super.clone();
    }

    public static class Builder {
        private Groups obj;

        public Builder() {
            this.obj = new Groups();
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder notification(String notification) {
            obj.setNotification(notification);
            return this;
        }

        public Builder notificationUserId(String notificationUserId) {
            obj.setNotificationUserId(notificationUserId);
            return this;
        }

        public Builder notificationUpdateTime(Date notificationUpdateTime) {
            obj.setNotificationUpdateTime(notificationUpdateTime);
            return this;
        }

        public Builder introduction(String introduction) {
            obj.setIntroduction(introduction);
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            obj.setFaceUrl(faceUrl);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        public Builder creatorUserId(String creatorUserId) {
            obj.setCreatorUserId(creatorUserId);
            return this;
        }

        public Builder groupType(Integer groupType) {
            obj.setGroupType(groupType);
            return this;
        }

        public Builder needVerification(Integer needVerification) {
            obj.setNeedVerification(needVerification);
            return this;
        }

        public Builder lookMemberInfo(Integer lookMemberInfo) {
            obj.setLookMemberInfo(lookMemberInfo);
            return this;
        }

        public Builder applyMemberFriend(Integer applyMemberFriend) {
            obj.setApplyMemberFriend(applyMemberFriend);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Groups build() {
            return this.obj;
        }
    }

    public enum Column {
        groupId("group_id", "groupId", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        notification("notification", "notification", "VARCHAR", false),
        introduction("introduction", "introduction", "VARCHAR", false),
        faceUrl("face_url", "faceUrl", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        status("status", "status", "INTEGER", false),
        creatorUserId("creator_user_id", "creatorUserId", "VARCHAR", false),
        groupType("group_type", "groupType", "INTEGER", false),
        needVerification("need_verification", "needVerification", "INTEGER", false),
        lookMemberInfo("look_member_info", "lookMemberInfo", "INTEGER", false),
        applyMemberFriend("apply_member_friend", "applyMemberFriend", "INTEGER", false),
        notificationUpdateTime("notification_update_time", "notificationUpdateTime", "TIMESTAMP", false),
        notificationUserId("notification_user_id", "notificationUserId", "VARCHAR", false),
        ex("ex", "ex", "LONGVARCHAR", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}