package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class BlacksKey implements Cloneable {
    private String ownerUserId;

    private String blockUserId;

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId == null ? null : ownerUserId.trim();
    }

    public String getBlockUserId() {
        return blockUserId;
    }

    public void setBlockUserId(String blockUserId) {
        this.blockUserId = blockUserId == null ? null : blockUserId.trim();
    }

    public static BlacksKey.Builder builder() {
        return new BlacksKey.Builder();
    }

    @Override
    public BlacksKey clone() throws CloneNotSupportedException {
        return (BlacksKey) super.clone();
    }

    public static class Builder {
        private BlacksKey obj;

        public Builder() {
            this.obj = new BlacksKey();
        }

        public Builder ownerUserId(String ownerUserId) {
            obj.setOwnerUserId(ownerUserId);
            return this;
        }

        public Builder blockUserId(String blockUserId) {
            obj.setBlockUserId(blockUserId);
            return this;
        }

        public BlacksKey build() {
            return this.obj;
        }
    }

    public enum Column {
        ownerUserId("owner_user_id", "ownerUserId", "VARCHAR", false),
        blockUserId("block_user_id", "blockUserId", "VARCHAR", false),
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