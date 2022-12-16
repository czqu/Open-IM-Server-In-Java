package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ChatLogs implements Cloneable {
    private String serverMsgId;

    private String clientMsgId;

    private String sendId;

    private String recvId;

    private Integer senderPlatformId;

    private String senderNickName;

    private String senderFaceUrl;

    private Integer sessionType;

    private Integer msgFrom;

    private Integer contentType;

    private String content;

    private Integer status;

    private Date sendTime;

    private Date createTime;

    private String ex;

    public String getServerMsgId() {
        return serverMsgId;
    }

    public void setServerMsgId(String serverMsgId) {
        this.serverMsgId = serverMsgId == null ? null : serverMsgId.trim();
    }

    public String getClientMsgId() {
        return clientMsgId;
    }

    public void setClientMsgId(String clientMsgId) {
        this.clientMsgId = clientMsgId == null ? null : clientMsgId.trim();
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId == null ? null : sendId.trim();
    }

    public String getRecvId() {
        return recvId;
    }

    public void setRecvId(String recvId) {
        this.recvId = recvId == null ? null : recvId.trim();
    }

    public Integer getSenderPlatformId() {
        return senderPlatformId;
    }

    public void setSenderPlatformId(Integer senderPlatformId) {
        this.senderPlatformId = senderPlatformId;
    }

    public String getSenderNickName() {
        return senderNickName;
    }

    public void setSenderNickName(String senderNickName) {
        this.senderNickName = senderNickName == null ? null : senderNickName.trim();
    }

    public String getSenderFaceUrl() {
        return senderFaceUrl;
    }

    public void setSenderFaceUrl(String senderFaceUrl) {
        this.senderFaceUrl = senderFaceUrl == null ? null : senderFaceUrl.trim();
    }

    public Integer getSessionType() {
        return sessionType;
    }

    public void setSessionType(Integer sessionType) {
        this.sessionType = sessionType;
    }

    public Integer getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(Integer msgFrom) {
        this.msgFrom = msgFrom;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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

    public static ChatLogs.Builder builder() {
        return new ChatLogs.Builder();
    }

    @Override
    public ChatLogs clone() throws CloneNotSupportedException {
        return (ChatLogs) super.clone();
    }

    public static class Builder {
        private ChatLogs obj;

        public Builder() {
            this.obj = new ChatLogs();
        }

        public Builder serverMsgId(String serverMsgId) {
            obj.setServerMsgId(serverMsgId);
            return this;
        }

        public Builder clientMsgId(String clientMsgId) {
            obj.setClientMsgId(clientMsgId);
            return this;
        }

        public Builder sendId(String sendId) {
            obj.setSendId(sendId);
            return this;
        }

        public Builder recvId(String recvId) {
            obj.setRecvId(recvId);
            return this;
        }

        public Builder senderPlatformId(Integer senderPlatformId) {
            obj.setSenderPlatformId(senderPlatformId);
            return this;
        }

        public Builder senderNickName(String senderNickName) {
            obj.setSenderNickName(senderNickName);
            return this;
        }

        public Builder senderFaceUrl(String senderFaceUrl) {
            obj.setSenderFaceUrl(senderFaceUrl);
            return this;
        }

        public Builder sessionType(Integer sessionType) {
            obj.setSessionType(sessionType);
            return this;
        }

        public Builder msgFrom(Integer msgFrom) {
            obj.setMsgFrom(msgFrom);
            return this;
        }

        public Builder content(String content) {
            obj.setContent(content);
            return this;
        }

        public Builder contentType(Integer contentType) {
            obj.setContentType(contentType);
            return this;
        }

        public Builder status(Integer status) {
            obj.setStatus(status);
            return this;
        }

        public Builder sendTime(Date sendTime) {
            obj.setSendTime(sendTime);
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

        public ChatLogs build() {
            return this.obj;
        }
    }

    public enum Column {
        serverMsgId("server_msg_id", "serverMsgId", "CHAR", false),
        clientMsgId("client_msg_id", "clientMsgId", "CHAR", false),
        sendId("send_id", "sendId", "CHAR", false),
        recvId("recv_id", "recvId", "CHAR", false),
        senderPlatformId("sender_platform_id", "senderPlatformId", "INTEGER", false),
        senderNickName("sender_nick_name", "senderNickName", "VARCHAR", false),
        senderFaceUrl("sender_face_url", "senderFaceUrl", "VARCHAR", false),
        sessionType("session_type", "sessionType", "INTEGER", false),
        msgFrom("msg_from", "msgFrom", "INTEGER", false),
        contentType("content_type", "contentType", "INTEGER", false),
        content("content", "content", "VARCHAR", false),
        status("status", "status", "INTEGER", false),
        sendTime("send_time", "sendTime", "TIMESTAMP", false),
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