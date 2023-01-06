package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class AppVersion implements Cloneable {
    private Long type;

    private String version;

    private Long updateTime;

    private Boolean forceUpdate;

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public static AppVersion.Builder builder() {
        return new AppVersion.Builder();
    }

    @Override
    public AppVersion clone() throws CloneNotSupportedException {
        return (AppVersion) super.clone();
    }

    public static class Builder {
        private AppVersion obj;

        public Builder() {
            this.obj = new AppVersion();
        }

        public Builder type(Long type) {
            obj.setType(type);
            return this;
        }

        public Builder version(String version) {
            obj.setVersion(version);
            return this;
        }

        public Builder updateTime(Long updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        public Builder forceUpdate(Boolean forceUpdate) {
            obj.setForceUpdate(forceUpdate);
            return this;
        }

        public AppVersion build() {
            return this.obj;
        }
    }

    public enum Column {
        type("type", "type", "BIGINT", false),
        version("version", "version", "VARCHAR", false),
        updateTime("update_time", "updateTime", "BIGINT", false),
        forceUpdate("force_update", "forceUpdate", "BIT", false),
        fileName("file_name", "fileName", "LONGVARCHAR", false),
        yamlName("yaml_name", "yamlName", "LONGVARCHAR", false),
        updateLog("update_log", "updateLog", "LONGVARCHAR", false);

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