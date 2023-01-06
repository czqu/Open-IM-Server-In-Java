package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.Blacks;

public class BlacksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public BlacksExample() {
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

    public BlacksExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public BlacksExample orderBy(String ... orderByClauses) {
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

    public BlacksExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public BlacksExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public BlacksExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        BlacksExample example = new BlacksExample();
        return example.createCriteria();
    }

    public BlacksExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public BlacksExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public BlacksExample distinct(boolean distinct) {
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

        public Criteria andOwnerUserIdEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("owner_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotEqualTo(String value) {
            addCriterion("owner_user_id <>", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("owner_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThan(String value) {
            addCriterion("owner_user_id >", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("owner_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("owner_user_id >=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("owner_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThan(String value) {
            addCriterion("owner_user_id <", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("owner_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanOrEqualTo(String value) {
            addCriterion("owner_user_id <=", value, "ownerUserId");
            return (Criteria) this;
        }

        public Criteria andOwnerUserIdLessThanOrEqualToColumn(Blacks.Column column) {
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

        public Criteria andBlockUserIdIsNull() {
            addCriterion("block_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdIsNotNull() {
            addCriterion("block_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdEqualTo(String value) {
            addCriterion("block_user_id =", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdNotEqualTo(String value) {
            addCriterion("block_user_id <>", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdGreaterThan(String value) {
            addCriterion("block_user_id >", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("block_user_id >=", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdLessThan(String value) {
            addCriterion("block_user_id <", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdLessThanOrEqualTo(String value) {
            addCriterion("block_user_id <=", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdLessThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("block_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBlockUserIdLike(String value) {
            addCriterion("block_user_id like", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdNotLike(String value) {
            addCriterion("block_user_id not like", value, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdIn(List<String> values) {
            addCriterion("block_user_id in", values, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdNotIn(List<String> values) {
            addCriterion("block_user_id not in", values, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdBetween(String value1, String value2) {
            addCriterion("block_user_id between", value1, value2, "blockUserId");
            return (Criteria) this;
        }

        public Criteria andBlockUserIdNotBetween(String value1, String value2) {
            addCriterion("block_user_id not between", value1, value2, "blockUserId");
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

        public Criteria andCreateTimeEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(Blacks.Column column) {
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

        public Criteria andAddSourceIsNull() {
            addCriterion("add_source is null");
            return (Criteria) this;
        }

        public Criteria andAddSourceIsNotNull() {
            addCriterion("add_source is not null");
            return (Criteria) this;
        }

        public Criteria andAddSourceEqualTo(Integer value) {
            addCriterion("add_source =", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceNotEqualTo(Integer value) {
            addCriterion("add_source <>", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceGreaterThan(Integer value) {
            addCriterion("add_source >", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_source >=", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceLessThan(Integer value) {
            addCriterion("add_source <", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceLessThanOrEqualTo(Integer value) {
            addCriterion("add_source <=", value, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceLessThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("add_source <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddSourceIn(List<Integer> values) {
            addCriterion("add_source in", values, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceNotIn(List<Integer> values) {
            addCriterion("add_source not in", values, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceBetween(Integer value1, Integer value2) {
            addCriterion("add_source between", value1, value2, "addSource");
            return (Criteria) this;
        }

        public Criteria andAddSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("add_source not between", value1, value2, "addSource");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNull() {
            addCriterion("operator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIsNotNull() {
            addCriterion("operator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualTo(String value) {
            addCriterion("operator_user_id =", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(String value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(String value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(String value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("operator_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLike(String value) {
            addCriterion("operator_user_id like", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotLike(String value) {
            addCriterion("operator_user_id not like", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdIn(List<String> values) {
            addCriterion("operator_user_id in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotIn(List<String> values) {
            addCriterion("operator_user_id not in", values, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdBetween(String value1, String value2) {
            addCriterion("operator_user_id between", value1, value2, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotBetween(String value1, String value2) {
            addCriterion("operator_user_id not between", value1, value2, "operatorUserId");
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

        public Criteria andExEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(Blacks.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(Blacks.Column column) {
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
        private BlacksExample example;

        protected Criteria(BlacksExample example) {
            super();
            this.example = example;
        }

        public BlacksExample example() {
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
        void example(net.czqu.openimserver.dao.example.BlacksExample example);
    }
}