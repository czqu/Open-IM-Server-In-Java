package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class OrganizationUsers implements Cloneable {
    private String userId;

    private String nickname;

    private String englishName;

    private String faceUrl;

    private Integer gender;

    private String mobile;

    private String telephone;

    private Date birth;

    private String email;

    private Date createTime;

    private String ex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
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

    public static OrganizationUsers.Builder builder() {
        return new OrganizationUsers.Builder();
    }

    @Override
    public OrganizationUsers clone() throws CloneNotSupportedException {
        return (OrganizationUsers) super.clone();
    }

    public static class Builder {
        private OrganizationUsers obj;

        public Builder() {
            this.obj = new OrganizationUsers();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder nickname(String nickname) {
            obj.setNickname(nickname);
            return this;
        }

        public Builder englishName(String englishName) {
            obj.setEnglishName(englishName);
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

        public Builder mobile(String mobile) {
            obj.setMobile(mobile);
            return this;
        }

        public Builder telephone(String telephone) {
            obj.setTelephone(telephone);
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

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public OrganizationUsers build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        nickname("nickname", "nickname", "VARCHAR", false),
        englishName("english_name", "englishName", "VARCHAR", false),
        faceUrl("face_url", "faceUrl", "VARCHAR", false),
        gender("gender", "gender", "INTEGER", false),
        mobile("mobile", "mobile", "VARCHAR", false),
        telephone("telephone", "telephone", "VARCHAR", false),
        birth("birth", "birth", "TIMESTAMP", false),
        email("email", "email", "VARCHAR", false),
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