package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.GroupRequests;

public class GroupRequestsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public GroupRequestsExample() {
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

    public GroupRequestsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GroupRequestsExample orderBy(String ... orderByClauses) {
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

    public GroupRequestsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public GroupRequestsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public GroupRequestsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        GroupRequestsExample example = new GroupRequestsExample();
        return example.createCriteria();
    }

    public GroupRequestsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GroupRequestsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public GroupRequestsExample distinct(boolean distinct) {
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

        public Criteria andUserIdEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(GroupRequests.Column column) {
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

        public Criteria andGroupIdEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("group_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("group_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("group_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("group_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("group_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualToColumn(GroupRequests.Column column) {
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

        public Criteria andHandleResultIsNull() {
            addCriterion("handle_result is null");
            return (Criteria) this;
        }

        public Criteria andHandleResultIsNotNull() {
            addCriterion("handle_result is not null");
            return (Criteria) this;
        }

        public Criteria andHandleResultEqualTo(Integer value) {
            addCriterion("handle_result =", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualTo(Integer value) {
            addCriterion("handle_result <>", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThan(Integer value) {
            addCriterion("handle_result >", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("handle_result >=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThan(Integer value) {
            addCriterion("handle_result <", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualTo(Integer value) {
            addCriterion("handle_result <=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_result <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultIn(List<Integer> values) {
            addCriterion("handle_result in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotIn(List<Integer> values) {
            addCriterion("handle_result not in", values, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultBetween(Integer value1, Integer value2) {
            addCriterion("handle_result between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotBetween(Integer value1, Integer value2) {
            addCriterion("handle_result not between", value1, value2, "handleResult");
            return (Criteria) this;
        }

        public Criteria andReqMsgIsNull() {
            addCriterion("req_msg is null");
            return (Criteria) this;
        }

        public Criteria andReqMsgIsNotNull() {
            addCriterion("req_msg is not null");
            return (Criteria) this;
        }

        public Criteria andReqMsgEqualTo(String value) {
            addCriterion("req_msg =", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgNotEqualTo(String value) {
            addCriterion("req_msg <>", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThan(String value) {
            addCriterion("req_msg >", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanOrEqualTo(String value) {
            addCriterion("req_msg >=", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThan(String value) {
            addCriterion("req_msg <", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanOrEqualTo(String value) {
            addCriterion("req_msg <=", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_msg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgLike(String value) {
            addCriterion("req_msg like", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgNotLike(String value) {
            addCriterion("req_msg not like", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgIn(List<String> values) {
            addCriterion("req_msg in", values, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgNotIn(List<String> values) {
            addCriterion("req_msg not in", values, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgBetween(String value1, String value2) {
            addCriterion("req_msg between", value1, value2, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgNotBetween(String value1, String value2) {
            addCriterion("req_msg not between", value1, value2, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIsNull() {
            addCriterion("handle_msg is null");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIsNotNull() {
            addCriterion("handle_msg is not null");
            return (Criteria) this;
        }

        public Criteria andHandleMsgEqualTo(String value) {
            addCriterion("handle_msg =", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotEqualTo(String value) {
            addCriterion("handle_msg <>", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThan(String value) {
            addCriterion("handle_msg >", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanOrEqualTo(String value) {
            addCriterion("handle_msg >=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThan(String value) {
            addCriterion("handle_msg <", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanOrEqualTo(String value) {
            addCriterion("handle_msg <=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgLike(String value) {
            addCriterion("handle_msg like", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotLike(String value) {
            addCriterion("handle_msg not like", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgIn(List<String> values) {
            addCriterion("handle_msg in", values, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotIn(List<String> values) {
            addCriterion("handle_msg not in", values, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgBetween(String value1, String value2) {
            addCriterion("handle_msg between", value1, value2, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotBetween(String value1, String value2) {
            addCriterion("handle_msg not between", value1, value2, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("req_time is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(Date value) {
            addCriterion("req_time =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(Date value) {
            addCriterion("req_time <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(Date value) {
            addCriterion("req_time >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("req_time >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(Date value) {
            addCriterion("req_time <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("req_time <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("req_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<Date> values) {
            addCriterion("req_time in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<Date> values) {
            addCriterion("req_time not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(Date value1, Date value2) {
            addCriterion("req_time between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("req_time not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdIsNull() {
            addCriterion("handle_user_id is null");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdIsNotNull() {
            addCriterion("handle_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdEqualTo(String value) {
            addCriterion("handle_user_id =", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdNotEqualTo(String value) {
            addCriterion("handle_user_id <>", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdGreaterThan(String value) {
            addCriterion("handle_user_id >", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("handle_user_id >=", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdLessThan(String value) {
            addCriterion("handle_user_id <", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdLessThanOrEqualTo(String value) {
            addCriterion("handle_user_id <=", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleUserIdLike(String value) {
            addCriterion("handle_user_id like", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdNotLike(String value) {
            addCriterion("handle_user_id not like", value, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdIn(List<String> values) {
            addCriterion("handle_user_id in", values, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdNotIn(List<String> values) {
            addCriterion("handle_user_id not in", values, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdBetween(String value1, String value2) {
            addCriterion("handle_user_id between", value1, value2, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleUserIdNotBetween(String value1, String value2) {
            addCriterion("handle_user_id not between", value1, value2, "handleUserId");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("handle_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andJoinSourceIsNull() {
            addCriterion("join_source is null");
            return (Criteria) this;
        }

        public Criteria andJoinSourceIsNotNull() {
            addCriterion("join_source is not null");
            return (Criteria) this;
        }

        public Criteria andJoinSourceEqualTo(Integer value) {
            addCriterion("join_source =", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotEqualTo(Integer value) {
            addCriterion("join_source <>", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThan(Integer value) {
            addCriterion("join_source >", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_source >=", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThan(Integer value) {
            addCriterion("join_source <", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanOrEqualTo(Integer value) {
            addCriterion("join_source <=", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("join_source <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceIn(List<Integer> values) {
            addCriterion("join_source in", values, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotIn(List<Integer> values) {
            addCriterion("join_source not in", values, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceBetween(Integer value1, Integer value2) {
            addCriterion("join_source between", value1, value2, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("join_source not between", value1, value2, "joinSource");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdIsNull() {
            addCriterion("inviter_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdIsNotNull() {
            addCriterion("inviter_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdEqualTo(String value) {
            addCriterion("inviter_user_id =", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotEqualTo(String value) {
            addCriterion("inviter_user_id <>", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThan(String value) {
            addCriterion("inviter_user_id >", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("inviter_user_id >=", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThan(String value) {
            addCriterion("inviter_user_id <", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanOrEqualTo(String value) {
            addCriterion("inviter_user_id <=", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("inviter_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLike(String value) {
            addCriterion("inviter_user_id like", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotLike(String value) {
            addCriterion("inviter_user_id not like", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdIn(List<String> values) {
            addCriterion("inviter_user_id in", values, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotIn(List<String> values) {
            addCriterion("inviter_user_id not in", values, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdBetween(String value1, String value2) {
            addCriterion("inviter_user_id between", value1, value2, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotBetween(String value1, String value2) {
            addCriterion("inviter_user_id not between", value1, value2, "inviterUserId");
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

        public Criteria andExEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(GroupRequests.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(GroupRequests.Column column) {
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
        private GroupRequestsExample example;

        protected Criteria(GroupRequestsExample example) {
            super();
            this.example = example;
        }

        public GroupRequestsExample example() {
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
        void example(net.czqu.openimserver.dao.example.GroupRequestsExample example);
    }
}