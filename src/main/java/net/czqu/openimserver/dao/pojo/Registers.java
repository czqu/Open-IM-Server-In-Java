package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class Registers implements Cloneable {
    private String account;

    private String password;

    private String ex;

    private String userId;

    private String areaCode;

    private String invitationCode;

    private String registerIp;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public static Registers.Builder builder() {
        return new Registers.Builder();
    }

    @Override
    public Registers clone() throws CloneNotSupportedException {
        return (Registers) super.clone();
    }

    public static class Builder {
        private Registers obj;

        public Builder() {
            this.obj = new Registers();
        }

        public Builder account(String account) {
            obj.setAccount(account);
            return this;
        }

        public Builder password(String password) {
            obj.setPassword(password);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder areaCode(String areaCode) {
            obj.setAreaCode(areaCode);
            return this;
        }

        public Builder invitationCode(String invitationCode) {
            obj.setInvitationCode(invitationCode);
            return this;
        }

        public Builder registerIp(String registerIp) {
            obj.setRegisterIp(registerIp);
            return this;
        }

        public Registers build() {
            return this.obj;
        }
    }

    public enum Column {
        account("account", "account", "CHAR", false),
        password("password", "password", "VARCHAR", false),
        ex("ex", "ex", "VARCHAR", false),
        userId("user_id", "userId", "VARCHAR", false),
        areaCode("area_code", "areaCode", "VARCHAR", false),
        invitationCode("invitation_code", "invitationCode", "VARCHAR", false),
        registerIp("register_ip", "registerIp", "VARCHAR", false);

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