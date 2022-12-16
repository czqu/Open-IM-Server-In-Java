package net.czqu.openimserver.dao.pojo;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversations extends ConversationsKey implements Cloneable {
    private Integer conversationType;

    private String userId;

    private String groupId;

    private Integer recvMsgOpt;

    private Integer unreadCount;

    private Long draftTextTime;

    private Boolean isPinned;

    private Boolean isPrivateChat;

    private Integer burnDuration;

    private Integer groupAtType;

    private Boolean isNotInGroup;

    private Long updateUnreadCountTime;

    private String attachedInfo;

    private String ex;

    public Integer getConversationType() {
        return conversationType;
    }

    public void setConversationType(Integer conversationType) {
        this.conversationType = conversationType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public Integer getRecvMsgOpt() {
        return recvMsgOpt;
    }

    public void setRecvMsgOpt(Integer recvMsgOpt) {
        this.recvMsgOpt = recvMsgOpt;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public Long getDraftTextTime() {
        return draftTextTime;
    }

    public void setDraftTextTime(Long draftTextTime) {
        this.draftTextTime = draftTextTime;
    }

    public Boolean getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public Boolean getIsPrivateChat() {
        return isPrivateChat;
    }

    public void setIsPrivateChat(Boolean isPrivateChat) {
        this.isPrivateChat = isPrivateChat;
    }

    public Integer getBurnDuration() {
        return burnDuration;
    }

    public void setBurnDuration(Integer burnDuration) {
        this.burnDuration = burnDuration;
    }

    public Integer getGroupAtType() {
        return groupAtType;
    }

    public void setGroupAtType(Integer groupAtType) {
        this.groupAtType = groupAtType;
    }

    public Boolean getIsNotInGroup() {
        return isNotInGroup;
    }

    public void setIsNotInGroup(Boolean isNotInGroup) {
        this.isNotInGroup = isNotInGroup;
    }

    public Long getUpdateUnreadCountTime() {
        return updateUnreadCountTime;
    }

    public void setUpdateUnreadCountTime(Long updateUnreadCountTime) {
        this.updateUnreadCountTime = updateUnreadCountTime;
    }

    public String getAttachedInfo() {
        return attachedInfo;
    }

    public void setAttachedInfo(String attachedInfo) {
        this.attachedInfo = attachedInfo == null ? null : attachedInfo.trim();
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex == null ? null : ex.trim();
    }

    public static Conversations.Builder builder() {
        return new Conversations.Builder();
    }

    @Override
    public Conversations clone() throws CloneNotSupportedException {
        return (Conversations) super.clone();
    }

    public static class Builder extends ConversationsKey.Builder {
        private Conversations obj;

        public Builder() {
            this.obj = new Conversations();
        }

        public Builder ownerUserId(String ownerUserId) {
            obj.setOwnerUserId(ownerUserId);
            return this;
        }

        public Builder conversationId(String conversationId) {
            obj.setConversationId(conversationId);
            return this;
        }

        public Builder conversationType(Integer conversationType) {
            obj.setConversationType(conversationType);
            return this;
        }

        public Builder userId(String userId) {
            obj.setUserId(userId);
            return this;
        }

        public Builder groupId(String groupId) {
            obj.setGroupId(groupId);
            return this;
        }

        public Builder recvMsgOpt(Integer recvMsgOpt) {
            obj.setRecvMsgOpt(recvMsgOpt);
            return this;
        }

        public Builder unreadCount(Integer unreadCount) {
            obj.setUnreadCount(unreadCount);
            return this;
        }

        public Builder draftTextTime(Long draftTextTime) {
            obj.setDraftTextTime(draftTextTime);
            return this;
        }

        public Builder isPinned(Boolean isPinned) {
            obj.setIsPinned(isPinned);
            return this;
        }

        public Builder isPrivateChat(Boolean isPrivateChat) {
            obj.setIsPrivateChat(isPrivateChat);
            return this;
        }

        public Builder burnDuration(Integer burnDuration) {
            obj.setBurnDuration(burnDuration);
            return this;
        }

        public Builder groupAtType(Integer groupAtType) {
            obj.setGroupAtType(groupAtType);
            return this;
        }

        public Builder isNotInGroup(Boolean isNotInGroup) {
            obj.setIsNotInGroup(isNotInGroup);
            return this;
        }

        public Builder updateUnreadCountTime(Long updateUnreadCountTime) {
            obj.setUpdateUnreadCountTime(updateUnreadCountTime);
            return this;
        }

        public Builder attachedInfo(String attachedInfo) {
            obj.setAttachedInfo(attachedInfo);
            return this;
        }

        public Builder ex(String ex) {
            obj.setEx(ex);
            return this;
        }

        public Conversations build() {
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