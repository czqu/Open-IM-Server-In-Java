package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Departments implements Cloneable {
    private String departmentId;

    private String faceUrl;

    private String name;

    private String parentId;

    private Integer order;

    private Integer departmentType;

    private String relatedGroupId;

    private Date createTime;

    private String ex;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }

    public String getRelatedGroupId() {
        return relatedGroupId;
    }

    public void setRelatedGroupId(String relatedGroupId) {
        this.relatedGroupId = relatedGroupId == null ? null : relatedGroupId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static Departments.Builder builder() {
        return new Departments.Builder();
    }

    @Override
    public Departments clone() throws CloneNotSupportedException {
        return (Departments) super.clone();
    }

    public static class Builder {
        private Departments obj;

        public Builder() {
            this.obj = new Departments();
        }

        public Builder departmentId(String departmentId) {
            obj.setDepartmentId(departmentId);
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            obj.setFaceUrl(faceUrl);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder parentId(String parentId) {
            obj.setParentId(parentId);
            return this;
        }

        public Builder order(Integer order) {
            obj.setOrder(order);
            return this;
        }

        public Builder departmentType(Integer departmentType) {
            obj.setDepartmentType(departmentType);
            return this;
        }

        public Builder relatedGroupId(String relatedGroupId) {
            obj.setRelatedGroupId(relatedGroupId);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Departments build() {
            return this.obj;
        }
    }

    public enum Column {
        departmentId("department_id", "departmentId", "VARCHAR", false),
        faceUrl("face_url", "faceUrl", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        parentId("parent_id", "parentId", "VARCHAR", false),
        order("order", "order", "INTEGER", false),
        departmentType("department_type", "departmentType", "INTEGER", false),
        relatedGroupId("related_group_id", "relatedGroupId", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
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