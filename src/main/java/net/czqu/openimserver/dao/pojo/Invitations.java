package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Invitations implements Cloneable {
    private String invitationCode;

    private Date createTime;

    private String userId;

    private Date lastTime;

    private Integer status;

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public static Invitations.Builder builder() {
        return new Invitations.Builder();
    }

    @Override
    public Invitations clone() throws CloneNotSupportedException {
        return (Invitations) super.clone();
    }

    public static class Builder {
        private Invitations obj;

        public Builder() {
            this.obj = new Invitations();
        }

        public Builder invitationCode(String invitationCode) {
            obj.setInvitationCode(invitationCode);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder lastTime(Date lastTime) {
            obj.setLastTime(lastTime);
            return this;
        }

        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        public Invitations build() {
            return this.obj;
        }
    }

    public enum Column {
        invitationCode("invitation_code", "invitationCode", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        userId("user_id", "userId", "VARCHAR", false),
        lastTime("last_time", "lastTime", "TIMESTAMP", false),
        status("status", "status", "INTEGER", false);

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