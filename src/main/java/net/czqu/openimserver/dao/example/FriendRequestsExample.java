package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.FriendRequests;

public class FriendRequestsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public FriendRequestsExample() {
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

    public FriendRequestsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public FriendRequestsExample orderBy(String ... orderByClauses) {
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

    public FriendRequestsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public FriendRequestsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public FriendRequestsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        FriendRequestsExample example = new FriendRequestsExample();
        return example.createCriteria();
    }

    public FriendRequestsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public FriendRequestsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public FriendRequestsExample distinct(boolean distinct) {
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

        public Criteria andFromUserIdIsNull() {
            addCriterion("from_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIsNotNull() {
            addCriterion("from_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualTo(String value) {
            addCriterion("from_user_id =", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualTo(String value) {
            addCriterion("from_user_id <>", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThan(String value) {
            addCriterion("from_user_id >", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("from_user_id >=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThan(String value) {
            addCriterion("from_user_id <", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualTo(String value) {
            addCriterion("from_user_id <=", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdLessThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("from_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFromUserIdLike(String value) {
            addCriterion("from_user_id like", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotLike(String value) {
            addCriterion("from_user_id not like", value, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdIn(List<String> values) {
            addCriterion("from_user_id in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotIn(List<String> values) {
            addCriterion("from_user_id not in", values, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdBetween(String value1, String value2) {
            addCriterion("from_user_id between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andFromUserIdNotBetween(String value1, String value2) {
            addCriterion("from_user_id not between", value1, value2, "fromUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNull() {
            addCriterion("to_user_id is null");
            return (Criteria) this;
        }

        public Criteria andToUserIdIsNotNull() {
            addCriterion("to_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualTo(String value) {
            addCriterion("to_user_id =", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualTo(String value) {
            addCriterion("to_user_id <>", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThan(String value) {
            addCriterion("to_user_id >", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_id >=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThan(String value) {
            addCriterion("to_user_id <", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualTo(String value) {
            addCriterion("to_user_id <=", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdLessThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("to_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andToUserIdLike(String value) {
            addCriterion("to_user_id like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotLike(String value) {
            addCriterion("to_user_id not like", value, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdIn(List<String> values) {
            addCriterion("to_user_id in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotIn(List<String> values) {
            addCriterion("to_user_id not in", values, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdBetween(String value1, String value2) {
            addCriterion("to_user_id between", value1, value2, "toUserId");
            return (Criteria) this;
        }

        public Criteria andToUserIdNotBetween(String value1, String value2) {
            addCriterion("to_user_id not between", value1, value2, "toUserId");
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

        public Criteria andHandleResultEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_result = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualTo(Integer value) {
            addCriterion("handle_result <>", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_result <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThan(Integer value) {
            addCriterion("handle_result >", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_result > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("handle_result >=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_result >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThan(Integer value) {
            addCriterion("handle_result <", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_result < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualTo(Integer value) {
            addCriterion("handle_result <=", value, "handleResult");
            return (Criteria) this;
        }

        public Criteria andHandleResultLessThanOrEqualToColumn(FriendRequests.Column column) {
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

        public Criteria andReqMsgEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("req_msg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgNotEqualTo(String value) {
            addCriterion("req_msg <>", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("req_msg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThan(String value) {
            addCriterion("req_msg >", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("req_msg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanOrEqualTo(String value) {
            addCriterion("req_msg >=", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("req_msg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThan(String value) {
            addCriterion("req_msg <", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("req_msg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanOrEqualTo(String value) {
            addCriterion("req_msg <=", value, "reqMsg");
            return (Criteria) this;
        }

        public Criteria andReqMsgLessThanOrEqualToColumn(FriendRequests.Column column) {
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

        public Criteria andCreateTimeEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(FriendRequests.Column column) {
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

        public Criteria andHandlerUserIdIsNull() {
            addCriterion("handler_user_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdIsNotNull() {
            addCriterion("handler_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdEqualTo(String value) {
            addCriterion("handler_user_id =", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdNotEqualTo(String value) {
            addCriterion("handler_user_id <>", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdGreaterThan(String value) {
            addCriterion("handler_user_id >", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("handler_user_id >=", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdLessThan(String value) {
            addCriterion("handler_user_id <", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdLessThanOrEqualTo(String value) {
            addCriterion("handler_user_id <=", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdLessThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handler_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdLike(String value) {
            addCriterion("handler_user_id like", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdNotLike(String value) {
            addCriterion("handler_user_id not like", value, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdIn(List<String> values) {
            addCriterion("handler_user_id in", values, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdNotIn(List<String> values) {
            addCriterion("handler_user_id not in", values, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdBetween(String value1, String value2) {
            addCriterion("handler_user_id between", value1, value2, "handlerUserId");
            return (Criteria) this;
        }

        public Criteria andHandlerUserIdNotBetween(String value1, String value2) {
            addCriterion("handler_user_id not between", value1, value2, "handlerUserId");
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

        public Criteria andHandleMsgEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotEqualTo(String value) {
            addCriterion("handle_msg <>", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThan(String value) {
            addCriterion("handle_msg >", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanOrEqualTo(String value) {
            addCriterion("handle_msg >=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThan(String value) {
            addCriterion("handle_msg <", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_msg < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanOrEqualTo(String value) {
            addCriterion("handle_msg <=", value, "handleMsg");
            return (Criteria) this;
        }

        public Criteria andHandleMsgLessThanOrEqualToColumn(FriendRequests.Column column) {
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

        public Criteria andHandleTimeEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("handle_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualToColumn(FriendRequests.Column column) {
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

        public Criteria andExEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(FriendRequests.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(FriendRequests.Column column) {
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
        private FriendRequestsExample example;

        protected Criteria(FriendRequestsExample example) {
            super();
            this.example = example;
        }

        public FriendRequestsExample example() {
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
        void example(net.czqu.openimserver.dao.example.FriendRequestsExample example);
    }
}