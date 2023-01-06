package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Users implements Cloneable {
    private String userId;

    private String name;

    private String faceUrl;

    private Integer gender;

    private String phoneNumber;

    private Date birth;

    private String email;

    private String ex;

    private Date createTime;

    private Integer appMangerLevel;

    private Integer globalRecvMsgOpt;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl == null ? null : faceUrl.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAppMangerLevel() {
        return appMangerLevel;
    }

    public void setAppMangerLevel(Integer appMangerLevel) {
        this.appMangerLevel = appMangerLevel;
    }

    public Integer getGlobalRecvMsgOpt() {
        return globalRecvMsgOpt;
    }

    public void setGlobalRecvMsgOpt(Integer globalRecvMsgOpt) {
        this.globalRecvMsgOpt = globalRecvMsgOpt;
    }

    public static Users.Builder builder() {
        return new Users.Builder();
    }

    @Override
    public Users clone() throws CloneNotSupportedException {
        return (Users) super.clone();
    }

    public static class Builder {
        private Users obj;

        public Builder() {
            this.obj = new Users();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder name(String name) {
            obj.setName(name);
            return this;
        }

        public Builder faceUrl(String faceUrl) {
            obj.setFaceUrl(faceUrl);
            return this;
        }

        public Builder gender(Integer gender) {
            obj.setGender(gender);
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            obj.setPhoneNumber(phoneNumber);
            return this;
        }

        public Builder birth(Date birth) {
            obj.setBirth(birth);
            return this;
        }

        public Builder email(String email) {
            obj.setEmail(email);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder appMangerLevel(Integer appMangerLevel) {
            obj.setAppMangerLevel(appMangerLevel);
            return this;
        }

        public Builder globalRecvMsgOpt(Integer globalRecvMsgOpt) {
            obj.setGlobalRecvMsgOpt(globalRecvMsgOpt);
            return this;
        }

        public Users build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        name("name", "name", "VARCHAR", false),
        faceUrl("face_url", "faceUrl", "VARCHAR", false),
        gender("gender", "gender", "INTEGER", false),
        phoneNumber("phone_number", "phoneNumber", "VARCHAR", false),
        birth("birth", "birth", "TIMESTAMP", false),
        email("email", "email", "VARCHAR", false),
        ex("ex", "ex", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        appMangerLevel("app_manger_level", "appMangerLevel", "INTEGER", false),
        globalRecvMsgOpt("global_recv_msg_opt", "globalRecvMsgOpt", "INTEGER", false);

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