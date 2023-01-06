package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.IpLimits;

public class IpLimitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public IpLimitsExample() {
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

    public IpLimitsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public IpLimitsExample orderBy(String ... orderByClauses) {
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

    public IpLimitsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public IpLimitsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public IpLimitsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        IpLimitsExample example = new IpLimitsExample();
        return example.createCriteria();
    }

    public IpLimitsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public IpLimitsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public IpLimitsExample distinct(boolean distinct) {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("ip <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterIsNull() {
            addCriterion("limit_register is null");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterIsNotNull() {
            addCriterion("limit_register is not null");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterEqualTo(Byte value) {
            addCriterion("limit_register =", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterNotEqualTo(Byte value) {
            addCriterion("limit_register <>", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterNotEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterGreaterThan(Byte value) {
            addCriterion("limit_register >", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterGreaterThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterGreaterThanOrEqualTo(Byte value) {
            addCriterion("limit_register >=", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterGreaterThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterLessThan(Byte value) {
            addCriterion("limit_register <", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterLessThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterLessThanOrEqualTo(Byte value) {
            addCriterion("limit_register <=", value, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterLessThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_register <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitRegisterIn(List<Byte> values) {
            addCriterion("limit_register in", values, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterNotIn(List<Byte> values) {
            addCriterion("limit_register not in", values, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterBetween(Byte value1, Byte value2) {
            addCriterion("limit_register between", value1, value2, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitRegisterNotBetween(Byte value1, Byte value2) {
            addCriterion("limit_register not between", value1, value2, "limitRegister");
            return (Criteria) this;
        }

        public Criteria andLimitLoginIsNull() {
            addCriterion("limit_login is null");
            return (Criteria) this;
        }

        public Criteria andLimitLoginIsNotNull() {
            addCriterion("limit_login is not null");
            return (Criteria) this;
        }

        public Criteria andLimitLoginEqualTo(Byte value) {
            addCriterion("limit_login =", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginNotEqualTo(Byte value) {
            addCriterion("limit_login <>", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginNotEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginGreaterThan(Byte value) {
            addCriterion("limit_login >", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginGreaterThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginGreaterThanOrEqualTo(Byte value) {
            addCriterion("limit_login >=", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginGreaterThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginLessThan(Byte value) {
            addCriterion("limit_login <", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginLessThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginLessThanOrEqualTo(Byte value) {
            addCriterion("limit_login <=", value, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginLessThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_login <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitLoginIn(List<Byte> values) {
            addCriterion("limit_login in", values, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginNotIn(List<Byte> values) {
            addCriterion("limit_login not in", values, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginBetween(Byte value1, Byte value2) {
            addCriterion("limit_login between", value1, value2, "limitLogin");
            return (Criteria) this;
        }

        public Criteria andLimitLoginNotBetween(Byte value1, Byte value2) {
            addCriterion("limit_login not between", value1, value2, "limitLogin");
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

        public Criteria andCreateTimeEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(IpLimits.Column column) {
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

        public Criteria andLimitTimeIsNull() {
            addCriterion("limit_time is null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNotNull() {
            addCriterion("limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualTo(Date value) {
            addCriterion("limit_time =", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualTo(Date value) {
            addCriterion("limit_time <>", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThan(Date value) {
            addCriterion("limit_time >", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_time >=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThan(Date value) {
            addCriterion("limit_time <", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualTo(Date value) {
            addCriterion("limit_time <=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualToColumn(IpLimits.Column column) {
            addCriterion(new StringBuilder("limit_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLimitTimeIn(List<Date> values) {
            addCriterion("limit_time in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotIn(List<Date> values) {
            addCriterion("limit_time not in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeBetween(Date value1, Date value2) {
            addCriterion("limit_time between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotBetween(Date value1, Date value2) {
            addCriterion("limit_time not between", value1, value2, "limitTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private IpLimitsExample example;

        protected Criteria(IpLimitsExample example) {
            super();
            this.example = example;
        }

        public IpLimitsExample example() {
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
        void example(net.czqu.openimserver.dao.example.IpLimitsExample example);
    }
}