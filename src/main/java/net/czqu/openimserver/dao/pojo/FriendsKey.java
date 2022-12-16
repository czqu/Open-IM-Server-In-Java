package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class FriendsKey implements Cloneable {
    private String ownerUserId;

    private String friendUserId;

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId == null ? null : ownerUserId.trim();
    }

    public String getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(String friendUserId) {
        this.friendUserId = friendUserId == null ? null : friendUserId.trim();
    }

    public static FriendsKey.Builder builder() {
        return new FriendsKey.Builder();
    }

    @Override
    public FriendsKey clone() throws CloneNotSupportedException {
        return (FriendsKey) super.clone();
    }

    public static class Builder {
        private FriendsKey obj;

        public Builder() {
            this.obj = new FriendsKey();
        }

        public Builder ownerUserId(String ownerUserId) {
            obj.setOwnerUserId(ownerUserId);
            return this;
        }

        public Builder friendUserId(String friendUserId) {
            obj.setFriendUserId(friendUserId);
            return this;
        }

        public FriendsKey build() {
            return this.obj;
        }
    }

    public enum Column {
        ownerUserId("owner_user_id", "ownerUserId", "VARCHAR", false),
        friendUserId("friend_user_id", "friendUserId", "VARCHAR", false),
        remark("remark", "remark", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        addSource("add_source", "addSource", "INTEGER", false),
        operatorUserId("operator_user_id", "operatorUserId", "VARCHAR", false),
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