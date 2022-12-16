package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class FriendRequests extends FriendRequestsKey implements Cloneable {
    private Integer handleResult;

    private String reqMsg;

    private Date createTime;

    private String handlerUserId;

    private String handleMsg;

    private Date handleTime;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHandlerUserId() {
        return handlerUserId;
    }

    public void setHandlerUserId(String handlerUserId) {
        this.handlerUserId = handlerUserId == null ? null : handlerUserId.trim();
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg == null ? null : handleMsg.trim();
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static FriendRequests.Builder builder() {
        return new FriendRequests.Builder();
    }

    @Override
    public FriendRequests clone() throws CloneNotSupportedException {
        return (FriendRequests) super.clone();
    }

    public static class Builder extends FriendRequestsKey.Builder {
        private FriendRequests obj;

        public Builder() {
            this.obj = new FriendRequests();
        }

        public Builder fromUserId(String fromUserId) {
            obj.setFromUserId(fromUserId);
            return this;
        }

        public Builder toUserId(String toUserId) {
            obj.setToUserId(toUserId);
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

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder handlerUserId(String handlerUserId) {
            obj.setHandlerUserId(handlerUserId);
            return this;
        }

        public Builder handleMsg(String handleMsg) {
            obj.setHandleMsg(handleMsg);
            return this;
        }

        public Builder handleTime(Date handleTime) {
            obj.setHandleTime(handleTime);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public FriendRequests build() {
            return this.obj;
        }
    }

    public enum Column {
        fromUserId("from_user_id", "fromUserId", "VARCHAR", false),
        toUserId("to_user_id", "toUserId", "VARCHAR", false),
        handleResult("handle_result", "handleResult", "INTEGER", false),
        reqMsg("req_msg", "reqMsg", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        handlerUserId("handler_user_id", "handlerUserId", "VARCHAR", false),
        handleMsg("handle_msg", "handleMsg", "VARCHAR", false),
        handleTime("handle_time", "handleTime", "TIMESTAMP", false),
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