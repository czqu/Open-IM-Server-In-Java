package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class GroupRequests extends GroupRequestsKey implements Cloneable {
    private Integer handleResult;

    private String reqMsg;

    private String handleMsg;

    private Date reqTime;

    private String handleUserId;

    private Date handleTime;

    private Integer joinSource;

    private String inviterUserId;

    private String ex;

    public Integer getHandleResult() {
        return handleResult;
    }

    public void setHandleResult(Integer handleResult) {
        this.handleResult = handleResult;
    }

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg == null ? null : reqMsg.trim();
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg == null ? null : handleMsg.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public String getHandleUserId() {
        return handleUserId;
    }

    public void setHandleUserId(String handleUserId) {
        this.handleUserId = handleUserId == null ? null : handleUserId.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(Integer joinSource) {
        this.joinSource = joinSource;
    }

    public String getInviterUserId() {
        return inviterUserId;
    }

    public void setInviterUserId(String inviterUserId) {
        this.inviterUserId = inviterUserId == null ? null : inviterUserId.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static GroupRequests.Builder builder() {
        return new GroupRequests.Builder();
    }

    @Override
    public GroupRequests clone() throws CloneNotSupportedException {
        return (GroupRequests) super.clone();
    }

    public static class Builder extends GroupRequestsKey.Builder {
        private GroupRequests obj;

        public Builder() {
            this.obj = new GroupRequests();
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public Builder handleResult(Integer handleResult) {
            obj.setHandleResult(handleResult);
            return this;
        }

        public Builder reqMsg(String reqMsg) {
            obj.setReqMsg(reqMsg);
            return this;
        }

        public Builder handleMsg(String handleMsg) {
            obj.setHandleMsg(handleMsg);
            return this;
        }

        public Builder reqTime(Date reqTime) {
            obj.setReqTime(reqTime);
            return this;
        }

        public Builder handleUserId(String handleUserId) {
            obj.setHandleUserId(handleUserId);
            return this;
        }

        public Builder handleTime(Date handleTime) {
            obj.setHandleTime(handleTime);
            return this;
        }

        public Builder joinSource(Integer joinSource) {
            obj.setJoinSource(joinSource);
            return this;
        }

        public Builder inviterUserId(String inviterUserId) {
            obj.setInviterUserId(inviterUserId);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public GroupRequests build() {
            return this.obj;
        }
    }

    public enum Column {
        userId("user_id", "userId", "VARCHAR", false),
        groupId("group_id", "groupId", "VARCHAR", false),
        handleResult("handle_result", "handleResult", "INTEGER", false),
        reqMsg("req_msg", "reqMsg", "VARCHAR", false),
        handleMsg("handle_msg", "handleMsg", "VARCHAR", false),
        reqTime("req_time", "reqTime", "TIMESTAMP", false),
        handleUserId("handle_user_id", "handleUserId", "VARCHAR", false),
        handleTime("handle_time", "handleTime", "TIMESTAMP", false),
        joinSource("join_source", "joinSource", "INTEGER", false),
        inviterUserId("inviter_user_id", "inviterUserId", "VARCHAR", false),
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