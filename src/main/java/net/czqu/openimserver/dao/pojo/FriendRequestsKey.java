package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class FriendRequestsKey implements Cloneable {
    private String fromUserId;

    private String toUserId;

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId == null ? null : fromUserId.trim();
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    public static FriendRequestsKey.Builder builder() {
        return new FriendRequestsKey.Builder();
    }

    @Override
    public FriendRequestsKey clone() throws CloneNotSupportedException {
        return (FriendRequestsKey) super.clone();
    }

    public static class Builder {
        private FriendRequestsKey obj;

        public Builder() {
            this.obj = new FriendRequestsKey();
        }

        public Builder fromUserId(String fromUserId) {
            obj.setFromUserId(fromUserId);
            return this;
        }

        public Builder toUserId(String toUserId) {
            obj.setToUserId(toUserId);
            return this;
        }

        public FriendRequestsKey build() {
            return this.obj;
        }
    }

    public enum Column {
        fromUserId("from_user_id", "fromUserId", "VARCHAR", false),
        toUserId("to_user_id", "toUserId", "VARCHAR", false),
        handleResult("handle_result", "handleResult", "INTEGER", false),
        reqMsg("req_msg", "reqMsg", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        handlerUserId("handler_user_id", "handlerUserId", "VARCHAR", false),
        handleMsg("handle_msg", "handleMsg", "VARCHAR", false),
        handleTime("handle_time", "handleTime", "TIMESTAMP", false),
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