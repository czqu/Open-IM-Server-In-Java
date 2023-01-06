package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class AppVersionWithBLOBs extends AppVersion implements Cloneable {
    private String fileName;

    private String yamlName;

    private String updateLog;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getYamlName() {
        return yamlName;
    }

    public void setYamlName(String yamlName) {
        this.yamlName = yamlName == null ? null : yamlName.trim();
    }

    public String getUpdateLog() {
        return updateLog;
    }

    public void setUpdateLog(String updateLog) {
        this.updateLog = updateLog == null ? null : updateLog.trim();
    }

    public static AppVersionWithBLOBs.Builder builder() {
        return new AppVersionWithBLOBs.Builder();
    }

    @Override
    public AppVersionWithBLOBs clone() throws CloneNotSupportedException {
        return (AppVersionWithBLOBs) super.clone();
    }

    public static class Builder extends AppVersion.Builder {
        private AppVersionWithBLOBs obj;

        public Builder() {
            this.obj = new AppVersionWithBLOBs();
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

        public Builder fileName(String fileName) {
            obj.setFileName(fileName);
            return this;
        }

        public Builder yamlName(String yamlName) {
            obj.setYamlName(yamlName);
            return this;
        }

        public Builder updateLog(String updateLog) {
            obj.setUpdateLog(updateLog);
            return this;
        }

        public AppVersionWithBLOBs build() {
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