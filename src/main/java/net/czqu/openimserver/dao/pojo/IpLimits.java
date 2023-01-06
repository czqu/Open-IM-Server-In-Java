package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class IpLimits implements Cloneable {
    private String ip;

    private Byte limitRegister;

    private Byte limitLogin;

    private Date createTime;

    private Date limitTime;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Byte getLimitRegister() {
        return limitRegister;
    }

    public void setLimitRegister(Byte limitRegister) {
        this.limitRegister = limitRegister;
    }

    public Byte getLimitLogin() {
        return limitLogin;
    }

    public void setLimitLogin(Byte limitLogin) {
        this.limitLogin = limitLogin;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    public static IpLimits.Builder builder() {
        return new IpLimits.Builder();
    }

    @Override
    public IpLimits clone() throws CloneNotSupportedException {
        return (IpLimits) super.clone();
    }

    public static class Builder {
        private IpLimits obj;

        public Builder() {
            this.obj = new IpLimits();
        }

        public Builder ip(String ip) {
            obj.setIp(ip);
            return this;
        }

        public Builder limitRegister(Byte limitRegister) {
            obj.setLimitRegister(limitRegister);
            return this;
        }

        public Builder limitLogin(Byte limitLogin) {
            obj.setLimitLogin(limitLogin);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder limitTime(Date limitTime) {
            obj.setLimitTime(limitTime);
            return this;
        }

        public IpLimits build() {
            return this.obj;
        }
    }

    public enum Column {
        ip("ip", "ip", "VARCHAR", false),
        limitRegister("limit_register", "limitRegister", "TINYINT", false),
        limitLogin("limit_login", "limitLogin", "TINYINT", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        limitTime("limit_time", "limitTime", "TIMESTAMP", false);

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