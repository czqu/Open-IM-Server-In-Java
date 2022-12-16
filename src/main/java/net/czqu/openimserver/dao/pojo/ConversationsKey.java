package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversationsKey implements Cloneable {
    private String ownerUserId;

    private String conversationId;

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId == null ? null : ownerUserId.trim();
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId == null ? null : conversationId.trim();
    }

    public static ConversationsKey.Builder builder() {
        return new ConversationsKey.Builder();
    }

    @Override
    public ConversationsKey clone() throws CloneNotSupportedException {
        return (ConversationsKey) super.clone();
    }

    public static class Builder {
        private ConversationsKey obj;

        public Builder() {
            this.obj = new ConversationsKey();
        }

        public Builder ownerUserId(String ownerUserId) {
            obj.setOwnerUserId(ownerUserId);
            return this;
        }

        public Builder conversationId(String conversationId) {
            obj.setConversationId(conversationId);
            return this;
        }

        public ConversationsKey build() {
            return this.obj;
        }
    }

    public enum Column {
        ownerUserId("owner_user_id", "ownerUserId", "CHAR", false),
        conversationId("conversation_id", "conversationId", "CHAR", false),
        conversationType("conversation_type", "conversationType", "INTEGER", false),
        userId("user_id", "userId", "CHAR", false),
        groupId("group_id", "groupId", "CHAR", false),
        recvMsgOpt("recv_msg_opt", "recvMsgOpt", "INTEGER", false),
        unreadCount("unread_count", "unreadCount", "INTEGER", false),
        draftTextTime("draft_text_time", "draftTextTime", "BIGINT", false),
        isPinned("is_pinned", "isPinned", "BIT", false),
        isPrivateChat("is_private_chat", "isPrivateChat", "BIT", false),
        burnDuration("burn_duration", "burnDuration", "INTEGER", false),
        groupAtType("group_at_type", "groupAtType", "INTEGER", false),
        isNotInGroup("is_not_in_group", "isNotInGroup", "BIT", false),
        updateUnreadCountTime("update_unread_count_time", "updateUnreadCountTime", "BIGINT", false),
        attachedInfo("attached_info", "attachedInfo", "VARCHAR", false),
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