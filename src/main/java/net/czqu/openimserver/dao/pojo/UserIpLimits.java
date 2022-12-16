package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class UserIpLimits extends UserIpLimitsKey implements Cloneable {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public static UserIpLimits.Builder builder() {
        return new UserIpLimits.Builder();
    }

    @Override
    public UserIpLimits clone() throws CloneNotSupportedException {
        return (UserIpLimits) super.clone();
    }

    public static class Builder extends UserIpLimitsKey.Builder {
        private UserIpLimits obj;

        public Builder() {
            this.obj = new UserIpLimits();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder ip(String ip) {
            obj.setIp(ip);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public UserIpLimits build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        ip("ip", "ip", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false);

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