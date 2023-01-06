package net.czqu.openimserver.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.czqu.openimserver.dao.pojo.GroupMembers;

public class GroupMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer offset;

    protected Integer rows;

    public GroupMembersExample() {
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

    public GroupMembersExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public GroupMembersExample orderBy(String ... orderByClauses) {
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

    public GroupMembersExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public GroupMembersExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public GroupMembersExample page(Integer page, Integer pageSize) {
        this.offset = page * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        GroupMembersExample example = new GroupMembersExample();
        return example.createCriteria();
    }

    public GroupMembersExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public GroupMembersExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    public GroupMembersExample distinct(boolean distinct) {
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

        public Criteria andGroupIdEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("group_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("group_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("group_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("group_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("group_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualToColumn(GroupMembers.Column column) {
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

        public Criteria andUserIdEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(GroupMembers.Column column) {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("nickname <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlIsNull() {
            addCriterion("user_group_face_url is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlIsNotNull() {
            addCriterion("user_group_face_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlEqualTo(String value) {
            addCriterion("user_group_face_url =", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlNotEqualTo(String value) {
            addCriterion("user_group_face_url <>", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlGreaterThan(String value) {
            addCriterion("user_group_face_url >", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_face_url >=", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlLessThan(String value) {
            addCriterion("user_group_face_url <", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlLessThanOrEqualTo(String value) {
            addCriterion("user_group_face_url <=", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlLessThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("user_group_face_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlLike(String value) {
            addCriterion("user_group_face_url like", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlNotLike(String value) {
            addCriterion("user_group_face_url not like", value, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlIn(List<String> values) {
            addCriterion("user_group_face_url in", values, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlNotIn(List<String> values) {
            addCriterion("user_group_face_url not in", values, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlBetween(String value1, String value2) {
            addCriterion("user_group_face_url between", value1, value2, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andUserGroupFaceUrlNotBetween(String value1, String value2) {
            addCriterion("user_group_face_url not between", value1, value2, "userGroupFaceUrl");
            return (Criteria) this;
        }

        public Criteria andRoleLevelIsNull() {
            addCriterion("role_level is null");
            return (Criteria) this;
        }

        public Criteria andRoleLevelIsNotNull() {
            addCriterion("role_level is not null");
            return (Criteria) this;
        }

        public Criteria andRoleLevelEqualTo(Integer value) {
            addCriterion("role_level =", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelNotEqualTo(Integer value) {
            addCriterion("role_level <>", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelGreaterThan(Integer value) {
            addCriterion("role_level >", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_level >=", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelLessThan(Integer value) {
            addCriterion("role_level <", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelLessThanOrEqualTo(Integer value) {
            addCriterion("role_level <=", value, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelLessThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("role_level <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleLevelIn(List<Integer> values) {
            addCriterion("role_level in", values, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelNotIn(List<Integer> values) {
            addCriterion("role_level not in", values, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelBetween(Integer value1, Integer value2) {
            addCriterion("role_level between", value1, value2, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andRoleLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("role_level not between", value1, value2, "roleLevel");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("join_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("join_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Date value) {
            addCriterion("join_time =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Date value) {
            addCriterion("join_time <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Date value) {
            addCriterion("join_time >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("join_time >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Date value) {
            addCriterion("join_time <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Date value) {
            addCriterion("join_time <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Date> values) {
            addCriterion("join_time in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Date> values) {
            addCriterion("join_time not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Date value1, Date value2) {
            addCriterion("join_time between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Date value1, Date value2) {
            addCriterion("join_time not between", value1, value2, "joinTime");
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

        public Criteria andJoinSourceEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_source = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotEqualTo(Integer value) {
            addCriterion("join_source <>", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_source <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThan(Integer value) {
            addCriterion("join_source >", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_source > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_source >=", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_source >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThan(Integer value) {
            addCriterion("join_source <", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("join_source < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanOrEqualTo(Integer value) {
            addCriterion("join_source <=", value, "joinSource");
            return (Criteria) this;
        }

        public Criteria andJoinSourceLessThanOrEqualToColumn(GroupMembers.Column column) {
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

        public Criteria andInviterUserIdEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("inviter_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotEqualTo(String value) {
            addCriterion("inviter_user_id <>", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("inviter_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThan(String value) {
            addCriterion("inviter_user_id >", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("inviter_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("inviter_user_id >=", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("inviter_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThan(String value) {
            addCriterion("inviter_user_id <", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("inviter_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanOrEqualTo(String value) {
            addCriterion("inviter_user_id <=", value, "inviterUserId");
            return (Criteria) this;
        }

        public Criteria andInviterUserIdLessThanOrEqualToColumn(GroupMembers.Column column) {
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

        public Criteria andOperatorUserIdEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("operator_user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualTo(String value) {
            addCriterion("operator_user_id <>", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("operator_user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThan(String value) {
            addCriterion("operator_user_id >", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("operator_user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_user_id >=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("operator_user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThan(String value) {
            addCriterion("operator_user_id <", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("operator_user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("operator_user_id <=", value, "operatorUserId");
            return (Criteria) this;
        }

        public Criteria andOperatorUserIdLessThanOrEqualToColumn(GroupMembers.Column column) {
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

        public Criteria andMuteEndTimeIsNull() {
            addCriterion("mute_end_time is null");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeIsNotNull() {
            addCriterion("mute_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeEqualTo(Date value) {
            addCriterion("mute_end_time =", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeNotEqualTo(Date value) {
            addCriterion("mute_end_time <>", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeGreaterThan(Date value) {
            addCriterion("mute_end_time >", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mute_end_time >=", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeLessThan(Date value) {
            addCriterion("mute_end_time <", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("mute_end_time <=", value, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeLessThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("mute_end_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeIn(List<Date> values) {
            addCriterion("mute_end_time in", values, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeNotIn(List<Date> values) {
            addCriterion("mute_end_time not in", values, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeBetween(Date value1, Date value2) {
            addCriterion("mute_end_time between", value1, value2, "muteEndTime");
            return (Criteria) this;
        }

        public Criteria andMuteEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("mute_end_time not between", value1, value2, "muteEndTime");
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

        public Criteria andExEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("ex = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExNotEqualTo(String value) {
            addCriterion("ex <>", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExNotEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("ex <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThan(String value) {
            addCriterion("ex >", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("ex > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualTo(String value) {
            addCriterion("ex >=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExGreaterThanOrEqualToColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("ex >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThan(String value) {
            addCriterion("ex <", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanColumn(GroupMembers.Column column) {
            addCriterion(new StringBuilder("ex < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualTo(String value) {
            addCriterion("ex <=", value, "ex");
            return (Criteria) this;
        }

        public Criteria andExLessThanOrEqualToColumn(GroupMembers.Column column) {
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
        private GroupMembersExample example;

        protected Criteria(GroupMembersExample example) {
            super();
            this.example = example;
        }

        public GroupMembersExample example() {
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
        void example(net.czqu.openimserver.dao.example.GroupMembersExample example);
    }
}