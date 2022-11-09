package net.czqu.openimserver.dao.mapper;

import net.czqu.openimserver.dao.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String serverMsgId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String serverMsgId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}