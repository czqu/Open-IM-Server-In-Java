package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GroupMembers extends GroupMembersKey implements Cloneable {
    private String nickname;

    private String userGroupFaceUrl;

    private Integer roleLevel;

    private Date joinTime;

    private Integer joinSource;

    private String inviterUserId;

    private String operatorUserId;

    private Date muteEndTime;

    private String ex;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserGroupFaceUrl() {
        return userGroupFaceUrl;
    }

    public void setUserGroupFaceUrl(String userGroupFaceUrl) {
        this.userGroupFaceUrl = userGroupFaceUrl == null ? null : userGroupFaceUrl.trim();
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(Integer joinSource) {
        this.joinSource = joinSource;
    }

    public String getInviterUserId() {
        return inviterUserId;
    }

    public void setInviterUserId(String inviterUserId) {
        this.inviterUserId = inviterUserId == null ? null : inviterUserId.trim();
    }

    public String getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId == null ? null : operatorUserId.trim();
    }

    public Date getMuteEndTime() {
        return muteEndTime;
    }

    public void setMuteEndTime(Date muteEndTime) {
        this.muteEndTime = muteEndTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static GroupMembers.Builder builder() {
        return new GroupMembers.Builder();
    }

    @Override
    public GroupMembers clone() throws CloneNotSupportedException {
        return (GroupMembers) super.clone();
    }

    public static class Builder extends GroupMembersKey.Builder {
        private GroupMembers obj;

        public Builder() {
            this.obj = new GroupMembers();
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder nickname(String nickname) {
            obj.setNickname(nickname);
            return this;
        }

        public Builder userGroupFaceUrl(String userGroupFaceUrl) {
            obj.setUserGroupFaceUrl(userGroupFaceUrl);
            return this;
        }

        public Builder roleLevel(Integer roleLevel) {
            obj.setRoleLevel(roleLevel);
            return this;
        }

        public Builder joinTime(Date joinTime) {
            obj.setJoinTime(joinTime);
            return this;
        }

        public Builder joinSource(Integer joinSource) {
            obj.setJoinSource(joinSource);
            return this;
        }

        public Builder inviterUserId(String inviterUserId) {
            obj.setInviterUserId(inviterUserId);
            return this;
        }

        public Builder operatorUserId(String operatorUserId) {
            obj.setOperatorUserId(operatorUserId);
            return this;
        }

        public Builder muteEndTime(Date muteEndTime) {
            obj.setMuteEndTime(muteEndTime);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public GroupMembers build() {
            return this.obj;
        }
    }

    public enum Column {
        groupId("group_id", "groupId", "VARCHAR", false),
        userId("user_id", "userId", "VARCHAR", false),
        nickname("nickname", "nickname", "VARCHAR", false),
        userGroupFaceUrl("user_group_face_url", "userGroupFaceUrl", "VARCHAR", false),
        roleLevel("role_level", "roleLevel", "INTEGER", false),
        joinTime("join_time", "joinTime", "TIMESTAMP", false),
        joinSource("join_source", "joinSource", "INTEGER", false),
        inviterUserId("inviter_user_id", "inviterUserId", "VARCHAR", false),
        operatorUserId("operator_user_id", "operatorUserId", "VARCHAR", false),
        muteEndTime("mute_end_time", "muteEndTime", "TIMESTAMP", false),
        ex("ex", "ex", "VARCHAR", false);

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