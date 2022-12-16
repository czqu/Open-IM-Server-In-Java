package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupMembersKey implements Cloneable {
    private String groupId;

    private String userId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public static GroupMembersKey.Builder builder() {
        return new GroupMembersKey.Builder();
    }

    @Override
    public GroupMembersKey clone() throws CloneNotSupportedException {
        return (GroupMembersKey) super.clone();
    }

    public static class Builder {
        private GroupMembersKey obj;

        public Builder() {
            this.obj = new GroupMembersKey();
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public GroupMembersKey build() {
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