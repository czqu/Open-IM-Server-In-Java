package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class UserIpRecords implements Cloneable {
    private String userId;

    private String createIp;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer loginTimes;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public static UserIpRecords.Builder builder() {
        return new UserIpRecords.Builder();
    }

    @Override
    public UserIpRecords clone() throws CloneNotSupportedException {
        return (UserIpRecords) super.clone();
    }

    public static class Builder {
        private UserIpRecords obj;

        public Builder() {
            this.obj = new UserIpRecords();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder createIp(String createIp) {
            obj.setCreateIp(createIp);
            return this;
        }

        public Builder lastLoginTime(Date lastLoginTime) {
            obj.setLastLoginTime(lastLoginTime);
            return this;
        }

        public Builder lastLoginIp(String lastLoginIp) {
            obj.setLastLoginIp(lastLoginIp);
            return this;
        }

        public Builder loginTimes(Integer loginTimes) {
            obj.setLoginTimes(loginTimes);
            return this;
        }

        public UserIpRecords build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        createIp("create_ip", "createIp", "VARCHAR", false),
        lastLoginTime("last_login_time", "lastLoginTime", "TIMESTAMP", false),
        lastLoginIp("last_login_ip", "lastLoginIp", "VARCHAR", false),
        loginTimes("login_times", "loginTimes", "INTEGER", false);

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