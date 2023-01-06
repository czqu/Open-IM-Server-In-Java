package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.List;
import net.czqu.openimserver.dao.pojo.Conversations;

public class ConversationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public ConversationsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public ConversationsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ConversationsExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getRows() {
        return this.rows;
    }

    public ConversationsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public ConversationsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public ConversationsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        ConversationsExample example = new ConversationsExample();
        return example.createCriteria();
    }

    public ConversationsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ConversationsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public ConversationsExample distinct(boolean distinct) {
        this.setDistinct(distinct);
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOwnerUserIdIsNull() {
            addCriterion("owner_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdIsNotNull() {
            addCriterion("owner_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdEqualTo(String value) {
            addCriterion("owner_user_id =", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotEqualTo(String value) {
            addCriterion("owner_user_id <>", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThan(String value) {
            addCriterion("owner_user_id >", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("owner_user_id >=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThan(String value) {
            addCriterion("owner_user_id <", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanOrEqualTo(String value) {
            addCriterion("owner_user_id <=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("owner_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLike(String value) {
            addCriterion("owner_user_id like", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotLike(String value) {
            addCriterion("owner_user_id not like", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdIn(List<String> values) {
            addCriterion("owner_user_id in", values, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotIn(List<String> values) {
            addCriterion("owner_user_id not in", values, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdBetween(String value1, String value2) {
            addCriterion("owner_user_id between", value1, value2, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotBetween(String value1, String value2) {
            addCriterion("owner_user_id not between", value1, value2, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andConversationIdIsNull() {
            addCriterion("conversation_id is null");
            return (Criteria) this;
        }

        public Criteria andConversationIdIsNotNull() {
            addCriterion("conversation_id is not null");
            return (Criteria) this;
        }

        public Criteria andConversationIdEqualTo(String value) {
            addCriterion("conversation_id =", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdNotEqualTo(String value) {
            addCriterion("conversation_id <>", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdGreaterThan(String value) {
            addCriterion("conversation_id >", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdGreaterThanOrEqualTo(String value) {
            addCriterion("conversation_id >=", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdLessThan(String value) {
            addCriterion("conversation_id <", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdLessThanOrEqualTo(String value) {
            addCriterion("conversation_id <=", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationIdLike(String value) {
            addCriterion("conversation_id like", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdNotLike(String value) {
            addCriterion("conversation_id not like", value, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdIn(List<String> values) {
            addCriterion("conversation_id in", values, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdNotIn(List<String> values) {
            addCriterion("conversation_id not in", values, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdBetween(String value1, String value2) {
            addCriterion("conversation_id between", value1, value2, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationIdNotBetween(String value1, String value2) {
            addCriterion("conversation_id not between", value1, value2, "conversationId");
            return (Criteria) this;
        }

        public Criteria andConversationTypeIsNull() {
            addCriterion("conversation_type is null");
            return (Criteria) this;
        }

        public Criteria andConversationTypeIsNotNull() {
            addCriterion("conversation_type is not null");
            return (Criteria) this;
        }

        public Criteria andConversationTypeEqualTo(Integer value) {
            addCriterion("conversation_type =", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeNotEqualTo(Integer value) {
            addCriterion("conversation_type <>", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeGreaterThan(Integer value) {
            addCriterion("conversation_type >", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("conversation_type >=", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeLessThan(Integer value) {
            addCriterion("conversation_type <", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("conversation_type <=", value, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("conversation_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andConversationTypeIn(List<Integer> values) {
            addCriterion("conversation_type in", values, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeNotIn(List<Integer> values) {
            addCriterion("conversation_type not in", values, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeBetween(Integer value1, Integer value2) {
            addCriterion("conversation_type between", value1, value2, "conversationType");
            return (Criteria) this;
        }

        public Criteria andConversationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("conversation_type not between", value1, value2, "conversationType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptIsNull() {
            addCriterion("recv_msg_opt is null");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptIsNotNull() {
            addCriterion("recv_msg_opt is not null");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptEqualTo(Integer value) {
            addCriterion("recv_msg_opt =", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptNotEqualTo(Integer value) {
            addCriterion("recv_msg_opt <>", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptGreaterThan(Integer value) {
            addCriterion("recv_msg_opt >", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptGreaterThanOrEqualTo(Integer value) {
            addCriterion("recv_msg_opt >=", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptLessThan(Integer value) {
            addCriterion("recv_msg_opt <", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptLessThanOrEqualTo(Integer value) {
            addCriterion("recv_msg_opt <=", value, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("recv_msg_opt <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptIn(List<Integer> values) {
            addCriterion("recv_msg_opt in", values, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptNotIn(List<Integer> values) {
            addCriterion("recv_msg_opt not in", values, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptBetween(Integer value1, Integer value2) {
            addCriterion("recv_msg_opt between", value1, value2, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andRecvMsgOptNotBetween(Integer value1, Integer value2) {
            addCriterion("recv_msg_opt not between", value1, value2, "recvMsgOpt");
            return (Criteria) this;
        }

        public Criteria andUnreadCountIsNull() {
            addCriterion("unread_count is null");
            return (Criteria) this;
        }

        public Criteria andUnreadCountIsNotNull() {
            addCriterion("unread_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnreadCountEqualTo(Integer value) {
            addCriterion("unread_count =", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountNotEqualTo(Integer value) {
            addCriterion("unread_count <>", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountGreaterThan(Integer value) {
            addCriterion("unread_count >", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unread_count >=", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountLessThan(Integer value) {
            addCriterion("unread_count <", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountLessThanOrEqualTo(Integer value) {
            addCriterion("unread_count <=", value, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("unread_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUnreadCountIn(List<Integer> values) {
            addCriterion("unread_count in", values, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountNotIn(List<Integer> values) {
            addCriterion("unread_count not in", values, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountBetween(Integer value1, Integer value2) {
            addCriterion("unread_count between", value1, value2, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andUnreadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unread_count not between", value1, value2, "unreadCount");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeIsNull() {
            addCriterion("draft_text_time is null");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeIsNotNull() {
            addCriterion("draft_text_time is not null");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeEqualTo(Long value) {
            addCriterion("draft_text_time =", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeNotEqualTo(Long value) {
            addCriterion("draft_text_time <>", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeGreaterThan(Long value) {
            addCriterion("draft_text_time >", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("draft_text_time >=", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeLessThan(Long value) {
            addCriterion("draft_text_time <", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeLessThanOrEqualTo(Long value) {
            addCriterion("draft_text_time <=", value, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("draft_text_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeIn(List<Long> values) {
            addCriterion("draft_text_time in", values, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeNotIn(List<Long> values) {
            addCriterion("draft_text_time not in", values, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeBetween(Long value1, Long value2) {
            addCriterion("draft_text_time between", value1, value2, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andDraftTextTimeNotBetween(Long value1, Long value2) {
            addCriterion("draft_text_time not between", value1, value2, "draftTextTime");
            return (Criteria) this;
        }

        public Criteria andIsPinnedIsNull() {
            addCriterion("is_pinned is null");
            return (Criteria) this;
        }

        public Criteria andIsPinnedIsNotNull() {
            addCriterion("is_pinned is not null");
            return (Criteria) this;
        }

        public Criteria andIsPinnedEqualTo(Boolean value) {
            addCriterion("is_pinned =", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedNotEqualTo(Boolean value) {
            addCriterion("is_pinned <>", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedGreaterThan(Boolean value) {
            addCriterion("is_pinned >", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pinned >=", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedLessThan(Boolean value) {
            addCriterion("is_pinned <", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pinned <=", value, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_pinned <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPinnedIn(List<Boolean> values) {
            addCriterion("is_pinned in", values, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedNotIn(List<Boolean> values) {
            addCriterion("is_pinned not in", values, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pinned between", value1, value2, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPinnedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pinned not between", value1, value2, "isPinned");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatIsNull() {
            addCriterion("is_private_chat is null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatIsNotNull() {
            addCriterion("is_private_chat is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatEqualTo(Boolean value) {
            addCriterion("is_private_chat =", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatNotEqualTo(Boolean value) {
            addCriterion("is_private_chat <>", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatGreaterThan(Boolean value) {
            addCriterion("is_private_chat >", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_private_chat >=", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatLessThan(Boolean value) {
            addCriterion("is_private_chat <", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatLessThanOrEqualTo(Boolean value) {
            addCriterion("is_private_chat <=", value, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_private_chat <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatIn(List<Boolean> values) {
            addCriterion("is_private_chat in", values, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatNotIn(List<Boolean> values) {
            addCriterion("is_private_chat not in", values, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatBetween(Boolean value1, Boolean value2) {
            addCriterion("is_private_chat between", value1, value2, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andIsPrivateChatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_private_chat not between", value1, value2, "isPrivateChat");
            return (Criteria) this;
        }

        public Criteria andBurnDurationIsNull() {
            addCriterion("burn_duration is null");
            return (Criteria) this;
        }

        public Criteria andBurnDurationIsNotNull() {
            addCriterion("burn_duration is not null");
            return (Criteria) this;
        }

        public Criteria andBurnDurationEqualTo(Integer value) {
            addCriterion("burn_duration =", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationNotEqualTo(Integer value) {
            addCriterion("burn_duration <>", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationGreaterThan(Integer value) {
            addCriterion("burn_duration >", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("burn_duration >=", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationLessThan(Integer value) {
            addCriterion("burn_duration <", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationLessThanOrEqualTo(Integer value) {
            addCriterion("burn_duration <=", value, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("burn_duration <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBurnDurationIn(List<Integer> values) {
            addCriterion("burn_duration in", values, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationNotIn(List<Integer> values) {
            addCriterion("burn_duration not in", values, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationBetween(Integer value1, Integer value2) {
            addCriterion("burn_duration between", value1, value2, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andBurnDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("burn_duration not between", value1, value2, "burnDuration");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeIsNull() {
            addCriterion("group_at_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeIsNotNull() {
            addCriterion("group_at_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeEqualTo(Integer value) {
            addCriterion("group_at_type =", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeNotEqualTo(Integer value) {
            addCriterion("group_at_type <>", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeGreaterThan(Integer value) {
            addCriterion("group_at_type >", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_at_type >=", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeLessThan(Integer value) {
            addCriterion("group_at_type <", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeLessThanOrEqualTo(Integer value) {
            addCriterion("group_at_type <=", value, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("group_at_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeIn(List<Integer> values) {
            addCriterion("group_at_type in", values, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeNotIn(List<Integer> values) {
            addCriterion("group_at_type not in", values, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeBetween(Integer value1, Integer value2) {
            addCriterion("group_at_type between", value1, value2, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andGroupAtTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("group_at_type not between", value1, value2, "groupAtType");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupIsNull() {
            addCriterion("is_not_in_group is null");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupIsNotNull() {
            addCriterion("is_not_in_group is not null");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupEqualTo(Boolean value) {
            addCriterion("is_not_in_group =", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupNotEqualTo(Boolean value) {
            addCriterion("is_not_in_group <>", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupGreaterThan(Boolean value) {
            addCriterion("is_not_in_group >", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_not_in_group >=", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupLessThan(Boolean value) {
            addCriterion("is_not_in_group <", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupLessThanOrEqualTo(Boolean value) {
            addCriterion("is_not_in_group <=", value, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("is_not_in_group <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupIn(List<Boolean> values) {
            addCriterion("is_not_in_group in", values, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupNotIn(List<Boolean> values) {
            addCriterion("is_not_in_group not in", values, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupBetween(Boolean value1, Boolean value2) {
            addCriterion("is_not_in_group between", value1, value2, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andIsNotInGroupNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_not_in_group not between", value1, value2, "isNotInGroup");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeIsNull() {
            addCriterion("update_unread_count_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeIsNotNull() {
            addCriterion("update_unread_count_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeEqualTo(Long value) {
            addCriterion("update_unread_count_time =", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeNotEqualTo(Long value) {
            addCriterion("update_unread_count_time <>", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeGreaterThan(Long value) {
            addCriterion("update_unread_count_time >", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_unread_count_time >=", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeLessThan(Long value) {
            addCriterion("update_unread_count_time <", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_unread_count_time <=", value, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("update_unread_count_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeIn(List<Long> values) {
            addCriterion("update_unread_count_time in", values, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeNotIn(List<Long> values) {
            addCriterion("update_unread_count_time not in", values, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeBetween(Long value1, Long value2) {
            addCriterion("update_unread_count_time between", value1, value2, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUnreadCountTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_unread_count_time not between", value1, value2, "updateUnreadCountTime");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoIsNull() {
            addCriterion("attached_info is null");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoIsNotNull() {
            addCriterion("attached_info is not null");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoEqualTo(String value) {
            addCriterion("attached_info =", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoNotEqualTo(String value) {
            addCriterion("attached_info <>", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoGreaterThan(String value) {
            addCriterion("attached_info >", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoGreaterThanOrEqualTo(String value) {
            addCriterion("attached_info >=", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoLessThan(String value) {
            addCriterion("attached_info <", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoLessThanOrEqualTo(String value) {
            addCriterion("attached_info <=", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("attached_info <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAttachedInfoLike(String value) {
            addCriterion("attached_info like", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoNotLike(String value) {
            addCriterion("attached_info not like", value, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoIn(List<String> values) {
            addCriterion("attached_info in", values, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoNotIn(List<String> values) {
            addCriterion("attached_info not in", values, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoBetween(String value1, String value2) {
            addCriterion("attached_info between", value1, value2, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andAttachedInfoNotBetween(String value1, String value2) {
            addCriterion("attached_info not between", value1, value2, "attachedInfo");
            return (Criteria) this;
        }

        public Criteria andExIsNull() {
            addCriterion("ex is null");
            return (Criteria) this;
        }

        public Criteria andExIsNotNull() {
            addCriterion("ex is not null");
            return (Criteria) this;
        }

        public Criteria andExEqualTo(String value) {
            addCriterion("ex =", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(Conversations.Column column) {
            addCriterion(new StringBuilder("ex <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLike(String value) {
            addCriterion("ex like", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotLike(String value) {
            addCriterion("ex not like", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExIn(List<String> values) {
            addCriterion("ex in", values, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotIn(List<String> values) {
            addCriterion("ex not in", values, "ex");
            return (Criteria) this;
        }

        public Criteria andExBetween(String value1, String value2) {
            addCriterion("ex between", value1, value2, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotBetween(String value1, String value2) {
            addCriterion("ex not between", value1, value2, "ex");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ConversationsExample example;

        protected Criteria(ConversationsExample example) {
            super();
            this.example = example;
        }

        public ConversationsExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(net.czqu.openimserver.dao.example.ConversationsExample example);
    }
}