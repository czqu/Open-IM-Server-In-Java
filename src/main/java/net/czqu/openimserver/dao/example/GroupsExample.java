package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.Groups;

public class GroupsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public GroupsExample() {
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

    public GroupsExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GroupsExample orderBy(String ... orderByClauses) {
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

    public GroupsExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public GroupsExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public GroupsExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        GroupsExample example = new GroupsExample();
        return example.createCriteria();
    }

    public GroupsExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GroupsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public GroupsExample distinct(boolean distinct) {
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

        public Criteria andGroupIdEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualToColumn(Groups.Column column) {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNotificationIsNull() {
            addCriterion("notification is null");
            return (Criteria) this;
        }

        public Criteria andNotificationIsNotNull() {
            addCriterion("notification is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationEqualTo(String value) {
            addCriterion("notification =", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationNotEqualTo(String value) {
            addCriterion("notification <>", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationGreaterThan(String value) {
            addCriterion("notification >", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationGreaterThanOrEqualTo(String value) {
            addCriterion("notification >=", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationLessThan(String value) {
            addCriterion("notification <", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationLessThanOrEqualTo(String value) {
            addCriterion("notification <=", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationLike(String value) {
            addCriterion("notification like", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationNotLike(String value) {
            addCriterion("notification not like", value, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationIn(List<String> values) {
            addCriterion("notification in", values, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationNotIn(List<String> values) {
            addCriterion("notification not in", values, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationBetween(String value1, String value2) {
            addCriterion("notification between", value1, value2, "notification");
            return (Criteria) this;
        }

        public Criteria andNotificationNotBetween(String value1, String value2) {
            addCriterion("notification not between", value1, value2, "notification");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("introduction <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNull() {
            addCriterion("face_url is null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIsNotNull() {
            addCriterion("face_url is not null");
            return (Criteria) this;
        }

        public Criteria andFaceUrlEqualTo(String value) {
            addCriterion("face_url =", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotEqualTo(String value) {
            addCriterion("face_url <>", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThan(String value) {
            addCriterion("face_url >", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("face_url >=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThan(String value) {
            addCriterion("face_url <", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("face_url <=", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("face_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFaceUrlLike(String value) {
            addCriterion("face_url like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotLike(String value) {
            addCriterion("face_url not like", value, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlIn(List<String> values) {
            addCriterion("face_url in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotIn(List<String> values) {
            addCriterion("face_url not in", values, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlBetween(String value1, String value2) {
            addCriterion("face_url between", value1, value2, "faceUrl");
            return (Criteria) this;
        }

        public Criteria andFaceUrlNotBetween(String value1, String value2) {
            addCriterion("face_url not between", value1, value2, "faceUrl");
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

        public Criteria andCreateTimeEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(Groups.Column column) {
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

        public Criteria andStatusEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(Groups.Column column) {
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

        public Criteria andCreatorUserIdIsNull() {
            addCriterion("creator_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIsNotNull() {
            addCriterion("creator_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualTo(String value) {
            addCriterion("creator_user_id =", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualTo(String value) {
            addCriterion("creator_user_id <>", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThan(String value) {
            addCriterion("creator_user_id >", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_user_id >=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThan(String value) {
            addCriterion("creator_user_id <", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("creator_user_id <=", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("creator_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdLike(String value) {
            addCriterion("creator_user_id like", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotLike(String value) {
            addCriterion("creator_user_id not like", value, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdIn(List<String> values) {
            addCriterion("creator_user_id in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotIn(List<String> values) {
            addCriterion("creator_user_id not in", values, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdBetween(String value1, String value2) {
            addCriterion("creator_user_id between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andCreatorUserIdNotBetween(String value1, String value2) {
            addCriterion("creator_user_id not between", value1, value2, "creatorUserId");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(Integer value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(Integer value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(Integer value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(Integer value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(Integer value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("group_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<Integer> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<Integer> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(Integer value1, Integer value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationIsNull() {
            addCriterion("need_verification is null");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationIsNotNull() {
            addCriterion("need_verification is not null");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationEqualTo(Integer value) {
            addCriterion("need_verification =", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationNotEqualTo(Integer value) {
            addCriterion("need_verification <>", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationGreaterThan(Integer value) {
            addCriterion("need_verification >", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_verification >=", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationLessThan(Integer value) {
            addCriterion("need_verification <", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationLessThanOrEqualTo(Integer value) {
            addCriterion("need_verification <=", value, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("need_verification <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNeedVerificationIn(List<Integer> values) {
            addCriterion("need_verification in", values, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationNotIn(List<Integer> values) {
            addCriterion("need_verification not in", values, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationBetween(Integer value1, Integer value2) {
            addCriterion("need_verification between", value1, value2, "needVerification");
            return (Criteria) this;
        }

        public Criteria andNeedVerificationNotBetween(Integer value1, Integer value2) {
            addCriterion("need_verification not between", value1, value2, "needVerification");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoIsNull() {
            addCriterion("look_member_info is null");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoIsNotNull() {
            addCriterion("look_member_info is not null");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoEqualTo(Integer value) {
            addCriterion("look_member_info =", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoNotEqualTo(Integer value) {
            addCriterion("look_member_info <>", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoGreaterThan(Integer value) {
            addCriterion("look_member_info >", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_member_info >=", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoLessThan(Integer value) {
            addCriterion("look_member_info <", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoLessThanOrEqualTo(Integer value) {
            addCriterion("look_member_info <=", value, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("look_member_info <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoIn(List<Integer> values) {
            addCriterion("look_member_info in", values, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoNotIn(List<Integer> values) {
            addCriterion("look_member_info not in", values, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoBetween(Integer value1, Integer value2) {
            addCriterion("look_member_info between", value1, value2, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andLookMemberInfoNotBetween(Integer value1, Integer value2) {
            addCriterion("look_member_info not between", value1, value2, "lookMemberInfo");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendIsNull() {
            addCriterion("apply_member_friend is null");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendIsNotNull() {
            addCriterion("apply_member_friend is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendEqualTo(Integer value) {
            addCriterion("apply_member_friend =", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendNotEqualTo(Integer value) {
            addCriterion("apply_member_friend <>", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendGreaterThan(Integer value) {
            addCriterion("apply_member_friend >", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_member_friend >=", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendLessThan(Integer value) {
            addCriterion("apply_member_friend <", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendLessThanOrEqualTo(Integer value) {
            addCriterion("apply_member_friend <=", value, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("apply_member_friend <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendIn(List<Integer> values) {
            addCriterion("apply_member_friend in", values, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendNotIn(List<Integer> values) {
            addCriterion("apply_member_friend not in", values, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendBetween(Integer value1, Integer value2) {
            addCriterion("apply_member_friend between", value1, value2, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andApplyMemberFriendNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_member_friend not between", value1, value2, "applyMemberFriend");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeIsNull() {
            addCriterion("notification_update_time is null");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeIsNotNull() {
            addCriterion("notification_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeEqualTo(Date value) {
            addCriterion("notification_update_time =", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeNotEqualTo(Date value) {
            addCriterion("notification_update_time <>", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeGreaterThan(Date value) {
            addCriterion("notification_update_time >", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notification_update_time >=", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeLessThan(Date value) {
            addCriterion("notification_update_time <", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("notification_update_time <=", value, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeIn(List<Date> values) {
            addCriterion("notification_update_time in", values, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeNotIn(List<Date> values) {
            addCriterion("notification_update_time not in", values, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("notification_update_time between", value1, value2, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("notification_update_time not between", value1, value2, "notificationUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdIsNull() {
            addCriterion("notification_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdIsNotNull() {
            addCriterion("notification_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdEqualTo(String value) {
            addCriterion("notification_user_id =", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdNotEqualTo(String value) {
            addCriterion("notification_user_id <>", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdNotEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdGreaterThan(String value) {
            addCriterion("notification_user_id >", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdGreaterThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("notification_user_id >=", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdGreaterThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdLessThan(String value) {
            addCriterion("notification_user_id <", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdLessThanColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdLessThanOrEqualTo(String value) {
            addCriterion("notification_user_id <=", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdLessThanOrEqualToColumn(Groups.Column column) {
            addCriterion(new StringBuilder("notification_user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdLike(String value) {
            addCriterion("notification_user_id like", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdNotLike(String value) {
            addCriterion("notification_user_id not like", value, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdIn(List<String> values) {
            addCriterion("notification_user_id in", values, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdNotIn(List<String> values) {
            addCriterion("notification_user_id not in", values, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdBetween(String value1, String value2) {
            addCriterion("notification_user_id between", value1, value2, "notificationUserId");
            return (Criteria) this;
        }

        public Criteria andNotificationUserIdNotBetween(String value1, String value2) {
            addCriterion("notification_user_id not between", value1, value2, "notificationUserId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private GroupsExample example;

        protected Criteria(GroupsExample example) {
            super();
            this.example = example;
        }

        public GroupsExample example() {
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
        void example(net.czqu.openimserver.dao.example.GroupsExample example);
    }
}