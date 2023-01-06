package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.ChatLogs;

public class ChatLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public ChatLogsExample() {
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

    public ChatLogsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ChatLogsExample orderBy(String ... orderByClauses) {
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

    public ChatLogsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public ChatLogsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public ChatLogsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        ChatLogsExample example = new ChatLogsExample();
        return example.createCriteria();
    }

    public ChatLogsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ChatLogsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public ChatLogsExample distinct(boolean distinct) {
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

        public Criteria andServerMsgIdIsNull() {
            addCriterion("server_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdIsNotNull() {
            addCriterion("server_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdEqualTo(String value) {
            addCriterion("server_msg_id =", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdNotEqualTo(String value) {
            addCriterion("server_msg_id <>", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdGreaterThan(String value) {
            addCriterion("server_msg_id >", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("server_msg_id >=", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdLessThan(String value) {
            addCriterion("server_msg_id <", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdLessThanOrEqualTo(String value) {
            addCriterion("server_msg_id <=", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("server_msg_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andServerMsgIdLike(String value) {
            addCriterion("server_msg_id like", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdNotLike(String value) {
            addCriterion("server_msg_id not like", value, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdIn(List<String> values) {
            addCriterion("server_msg_id in", values, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdNotIn(List<String> values) {
            addCriterion("server_msg_id not in", values, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdBetween(String value1, String value2) {
            addCriterion("server_msg_id between", value1, value2, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andServerMsgIdNotBetween(String value1, String value2) {
            addCriterion("server_msg_id not between", value1, value2, "serverMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdIsNull() {
            addCriterion("client_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdIsNotNull() {
            addCriterion("client_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdEqualTo(String value) {
            addCriterion("client_msg_id =", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdNotEqualTo(String value) {
            addCriterion("client_msg_id <>", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdGreaterThan(String value) {
            addCriterion("client_msg_id >", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_msg_id >=", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdLessThan(String value) {
            addCriterion("client_msg_id <", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdLessThanOrEqualTo(String value) {
            addCriterion("client_msg_id <=", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("client_msg_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClientMsgIdLike(String value) {
            addCriterion("client_msg_id like", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdNotLike(String value) {
            addCriterion("client_msg_id not like", value, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdIn(List<String> values) {
            addCriterion("client_msg_id in", values, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdNotIn(List<String> values) {
            addCriterion("client_msg_id not in", values, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdBetween(String value1, String value2) {
            addCriterion("client_msg_id between", value1, value2, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andClientMsgIdNotBetween(String value1, String value2) {
            addCriterion("client_msg_id not between", value1, value2, "clientMsgId");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNull() {
            addCriterion("send_id is null");
            return (Criteria) this;
        }

        public Criteria andSendIdIsNotNull() {
            addCriterion("send_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendIdEqualTo(String value) {
            addCriterion("send_id =", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdNotEqualTo(String value) {
            addCriterion("send_id <>", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThan(String value) {
            addCriterion("send_id >", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_id >=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdLessThan(String value) {
            addCriterion("send_id <", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanOrEqualTo(String value) {
            addCriterion("send_id <=", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendIdLike(String value) {
            addCriterion("send_id like", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotLike(String value) {
            addCriterion("send_id not like", value, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdIn(List<String> values) {
            addCriterion("send_id in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotIn(List<String> values) {
            addCriterion("send_id not in", values, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdBetween(String value1, String value2) {
            addCriterion("send_id between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andSendIdNotBetween(String value1, String value2) {
            addCriterion("send_id not between", value1, value2, "sendId");
            return (Criteria) this;
        }

        public Criteria andRecvIdIsNull() {
            addCriterion("recv_id is null");
            return (Criteria) this;
        }

        public Criteria andRecvIdIsNotNull() {
            addCriterion("recv_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecvIdEqualTo(String value) {
            addCriterion("recv_id =", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdNotEqualTo(String value) {
            addCriterion("recv_id <>", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdGreaterThan(String value) {
            addCriterion("recv_id >", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdGreaterThanOrEqualTo(String value) {
            addCriterion("recv_id >=", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdLessThan(String value) {
            addCriterion("recv_id <", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdLessThanOrEqualTo(String value) {
            addCriterion("recv_id <=", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("recv_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRecvIdLike(String value) {
            addCriterion("recv_id like", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdNotLike(String value) {
            addCriterion("recv_id not like", value, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdIn(List<String> values) {
            addCriterion("recv_id in", values, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdNotIn(List<String> values) {
            addCriterion("recv_id not in", values, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdBetween(String value1, String value2) {
            addCriterion("recv_id between", value1, value2, "recvId");
            return (Criteria) this;
        }

        public Criteria andRecvIdNotBetween(String value1, String value2) {
            addCriterion("recv_id not between", value1, value2, "recvId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdIsNull() {
            addCriterion("sender_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdIsNotNull() {
            addCriterion("sender_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdEqualTo(Integer value) {
            addCriterion("sender_platform_id =", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdNotEqualTo(Integer value) {
            addCriterion("sender_platform_id <>", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdGreaterThan(Integer value) {
            addCriterion("sender_platform_id >", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_platform_id >=", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdLessThan(Integer value) {
            addCriterion("sender_platform_id <", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("sender_platform_id <=", value, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_platform_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdIn(List<Integer> values) {
            addCriterion("sender_platform_id in", values, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdNotIn(List<Integer> values) {
            addCriterion("sender_platform_id not in", values, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("sender_platform_id between", value1, value2, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_platform_id not between", value1, value2, "senderPlatformId");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameIsNull() {
            addCriterion("sender_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameIsNotNull() {
            addCriterion("sender_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameEqualTo(String value) {
            addCriterion("sender_nick_name =", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameNotEqualTo(String value) {
            addCriterion("sender_nick_name <>", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameGreaterThan(String value) {
            addCriterion("sender_nick_name >", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_nick_name >=", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameLessThan(String value) {
            addCriterion("sender_nick_name <", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameLessThanOrEqualTo(String value) {
            addCriterion("sender_nick_name <=", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_nick_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderNickNameLike(String value) {
            addCriterion("sender_nick_name like", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameNotLike(String value) {
            addCriterion("sender_nick_name not like", value, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameIn(List<String> values) {
            addCriterion("sender_nick_name in", values, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameNotIn(List<String> values) {
            addCriterion("sender_nick_name not in", values, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameBetween(String value1, String value2) {
            addCriterion("sender_nick_name between", value1, value2, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderNickNameNotBetween(String value1, String value2) {
            addCriterion("sender_nick_name not between", value1, value2, "senderNickName");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlIsNull() {
            addCriterion("sender_face_url is null");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlIsNotNull() {
            addCriterion("sender_face_url is not null");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlEqualTo(String value) {
            addCriterion("sender_face_url =", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlNotEqualTo(String value) {
            addCriterion("sender_face_url <>", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlGreaterThan(String value) {
            addCriterion("sender_face_url >", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sender_face_url >=", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlLessThan(String value) {
            addCriterion("sender_face_url <", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("sender_face_url <=", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("sender_face_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlLike(String value) {
            addCriterion("sender_face_url like", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlNotLike(String value) {
            addCriterion("sender_face_url not like", value, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlIn(List<String> values) {
            addCriterion("sender_face_url in", values, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlNotIn(List<String> values) {
            addCriterion("sender_face_url not in", values, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlBetween(String value1, String value2) {
            addCriterion("sender_face_url between", value1, value2, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSenderFaceUrlNotBetween(String value1, String value2) {
            addCriterion("sender_face_url not between", value1, value2, "senderFaceUrl");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNull() {
            addCriterion("session_type is null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNotNull() {
            addCriterion("session_type is not null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeEqualTo(Integer value) {
            addCriterion("session_type =", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotEqualTo(Integer value) {
            addCriterion("session_type <>", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThan(Integer value) {
            addCriterion("session_type >", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_type >=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThan(Integer value) {
            addCriterion("session_type <", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("session_type <=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("session_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSessionTypeIn(List<Integer> values) {
            addCriterion("session_type in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotIn(List<Integer> values) {
            addCriterion("session_type not in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeBetween(Integer value1, Integer value2) {
            addCriterion("session_type between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("session_type not between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andMsgFromIsNull() {
            addCriterion("msg_from is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromIsNotNull() {
            addCriterion("msg_from is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromEqualTo(Integer value) {
            addCriterion("msg_from =", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromNotEqualTo(Integer value) {
            addCriterion("msg_from <>", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThan(Integer value) {
            addCriterion("msg_from >", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_from >=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThan(Integer value) {
            addCriterion("msg_from <", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThanOrEqualTo(Integer value) {
            addCriterion("msg_from <=", value, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("msg_from <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMsgFromIn(List<Integer> values) {
            addCriterion("msg_from in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotIn(List<Integer> values) {
            addCriterion("msg_from not in", values, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromBetween(Integer value1, Integer value2) {
            addCriterion("msg_from between", value1, value2, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andMsgFromNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_from not between", value1, value2, "msgFrom");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContentTypeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualTo(Integer value) {
            addCriterion("content_type =", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualTo(Integer value) {
            addCriterion("content_type <>", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThan(Integer value) {
            addCriterion("content_type >", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_type >=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThan(Integer value) {
            addCriterion("content_type <", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("content_type <=", value, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentTypeIn(List<Integer> values) {
            addCriterion("content_type in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotIn(List<Integer> values) {
            addCriterion("content_type not in", values, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeBetween(Integer value1, Integer value2) {
            addCriterion("content_type between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("content_type not between", value1, value2, "contentType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("content <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("send_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andExEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(ChatLogs.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(ChatLogs.Column column) {
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
        private ChatLogsExample example;

        protected Criteria(ChatLogsExample example) {
            super();
            this.example = example;
        }

        public ChatLogsExample example() {
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
        void example(net.czqu.openimserver.dao.example.ChatLogsExample example);
    }
}