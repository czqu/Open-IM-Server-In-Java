package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Friends extends FriendsKey implements Cloneable {
    private String remark;

    private Date createTime;

    private Integer addSource;

    private String operatorUserId;

    private String ex;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAddSource() {
        return addSource;
    }

    public void setAddSource(Integer addSource) {
        this.addSource = addSource;
    }

    public String getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId == null ? null : operatorUserId.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static Friends.Builder builder() {
        return new Friends.Builder();
    }

    @Override
    public Friends clone() throws CloneNotSupportedException {
        return (Friends) super.clone();
    }

    public static class Builder extends FriendsKey.Builder {
        private Friends obj;

        public Builder() {
            this.obj = new Friends();
        }

        public Builder ownerUserId(String ownerUserId) {
            obj.setOwnerUserId(ownerUserId);
            return this;
        }

        public Builder friendUserId(String friendUserId) {
            obj.setFriendUserId(friendUserId);
            return this;
        }

        public Builder remark(String remark) {
            obj.setRemark(remark);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder addSource(Integer addSource) {
            obj.setAddSource(addSource);
            return this;
        }

        public Builder operatorUserId(String operatorUserId) {
            obj.setOperatorUserId(operatorUserId);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Friends build() {
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