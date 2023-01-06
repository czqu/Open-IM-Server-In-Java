package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.BlackLists;

public class BlackListsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public BlackListsExample() {
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

    public BlackListsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public BlackListsExample orderBy(String ... orderByClauses) {
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

    public BlackListsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public BlackListsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public BlackListsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        BlackListsExample example = new BlackListsExample();
        return example.createCriteria();
    }

    public BlackListsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public BlackListsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public BlackListsExample distinct(boolean distinct) {
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

        public Criteria andBeginDisableTimeIsNull() {
            addCriterion("begin_disable_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeIsNotNull() {
            addCriterion("begin_disable_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeEqualTo(Date value) {
            addCriterion("begin_disable_time =", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeNotEqualTo(Date value) {
            addCriterion("begin_disable_time <>", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeNotEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeGreaterThan(Date value) {
            addCriterion("begin_disable_time >", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeGreaterThanColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_disable_time >=", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeGreaterThanOrEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeLessThan(Date value) {
            addCriterion("begin_disable_time <", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeLessThanColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_disable_time <=", value, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeLessThanOrEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("begin_disable_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeIn(List<Date> values) {
            addCriterion("begin_disable_time in", values, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeNotIn(List<Date> values) {
            addCriterion("begin_disable_time not in", values, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeBetween(Date value1, Date value2) {
            addCriterion("begin_disable_time between", value1, value2, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andBeginDisableTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_disable_time not between", value1, value2, "beginDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeIsNull() {
            addCriterion("end_disable_time is null");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeIsNotNull() {
            addCriterion("end_disable_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeEqualTo(Date value) {
            addCriterion("end_disable_time =", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeNotEqualTo(Date value) {
            addCriterion("end_disable_time <>", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeNotEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeGreaterThan(Date value) {
            addCriterion("end_disable_time >", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeGreaterThanColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_disable_time >=", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeGreaterThanOrEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeLessThan(Date value) {
            addCriterion("end_disable_time <", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeLessThanColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_disable_time <=", value, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeLessThanOrEqualToColumn(BlackLists.Column column) {
            addCriterion(new StringBuilder("end_disable_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeIn(List<Date> values) {
            addCriterion("end_disable_time in", values, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeNotIn(List<Date> values) {
            addCriterion("end_disable_time not in", values, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeBetween(Date value1, Date value2) {
            addCriterion("end_disable_time between", value1, value2, "endDisableTime");
            return (Criteria) this;
        }

        public Criteria andEndDisableTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_disable_time not between", value1, value2, "endDisableTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private BlackListsExample example;

        protected Criteria(BlackListsExample example) {
            super();
            this.example = example;
        }

        public BlackListsExample example() {
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
        void example(net.czqu.openimserver.dao.example.BlackListsExample example);
    }
}