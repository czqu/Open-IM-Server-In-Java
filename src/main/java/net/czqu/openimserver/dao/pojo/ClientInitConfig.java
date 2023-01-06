package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientInitConfig implements Cloneable {
    private String discoverPageUrl;

    public String getDiscoverPageUrl() {
        return discoverPageUrl;
    }

    public void setDiscoverPageUrl(String discoverPageUrl) {
        this.discoverPageUrl = discoverPageUrl == null ? null : discoverPageUrl.trim();
    }

    public static ClientInitConfig.Builder builder() {
        return new ClientInitConfig.Builder();
    }

    @Override
    public ClientInitConfig clone() throws CloneNotSupportedException {
        return (ClientInitConfig) super.clone();
    }

    public static class Builder {
        private ClientInitConfig obj;

        public Builder() {
            this.obj = new ClientInitConfig();
        }

        public Builder discoverPageUrl(String discoverPageUrl) {
            obj.setDiscoverPageUrl(discoverPageUrl);
            return this;
        }

        public ClientInitConfig build() {
            return this.obj;
        }
    }

    public enum Column {
        discoverPageUrl("discover_page_url", "discoverPageUrl", "VARCHAR", false);

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