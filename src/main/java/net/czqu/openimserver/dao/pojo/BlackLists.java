package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class BlackLists implements Cloneable {
    private Date beginDisableTime;

    private Date endDisableTime;

    private String uid;

    public Date getBeginDisableTime() {
        return beginDisableTime;
    }

    public void setBeginDisableTime(Date beginDisableTime) {
        this.beginDisableTime = beginDisableTime;
    }

    public Date getEndDisableTime() {
        return endDisableTime;
    }

    public void setEndDisableTime(Date endDisableTime) {
        this.endDisableTime = endDisableTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public static BlackLists.Builder builder() {
        return new BlackLists.Builder();
    }

    @Override
    public BlackLists clone() throws CloneNotSupportedException {
        return (BlackLists) super.clone();
    }

    public static class Builder {
        private BlackLists obj;

        public Builder() {
            this.obj = new BlackLists();
        }

        public Builder beginDisableTime(Date beginDisableTime) {
            obj.setBeginDisableTime(beginDisableTime);
            return this;
        }

        public Builder endDisableTime(Date endDisableTime) {
            obj.setEndDisableTime(endDisableTime);
            return this;
        }

        public Builder uid(String uid) {
            obj.setUid(uid);
            return this;
        }

        public BlackLists build() {
            return this.obj;
        }
    }

    public enum Column {
        beginDisableTime("begin_disable_time", "beginDisableTime", "TIMESTAMP", false),
        endDisableTime("end_disable_time", "endDisableTime", "TIMESTAMP", false),
        uid("uid", "uid", "LONGVARCHAR", false);

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