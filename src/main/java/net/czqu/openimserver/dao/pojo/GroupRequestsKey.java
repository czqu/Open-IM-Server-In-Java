package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupRequestsKey implements Cloneable {
    private String userId;

    private String groupId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public static GroupRequestsKey.Builder builder() {
        return new GroupRequestsKey.Builder();
    }

    @Override
    public GroupRequestsKey clone() throws CloneNotSupportedException {
        return (GroupRequestsKey) super.clone();
    }

    public static class Builder {
        private GroupRequestsKey obj;

        public Builder() {
            this.obj = new GroupRequestsKey();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public GroupRequestsKey build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        groupId("group_id", "groupId", "VARCHAR", false),
        handleResult("handle_result", "handleResult", "INTEGER", false),
        reqMsg("req_msg", "reqMsg", "VARCHAR", false),
        handleMsg("handle_msg", "handleMsg", "VARCHAR", false),
        reqTime("req_time", "reqTime", "TIMESTAMP", false),
        handleUserId("handle_user_id", "handleUserId", "VARCHAR", false),
        handleTime("handle_time", "handleTime", "TIMESTAMP", false),
        joinSource("join_source", "joinSource", "INTEGER", false),
        inviterUserId("inviter_user_id", "inviterUserId", "VARCHAR", false),
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