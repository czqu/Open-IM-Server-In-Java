package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.UserIpLimitsExample;
import net.czqu.openimserver.dao.pojo.UserIpLimits;
import net.czqu.openimserver.dao.pojo.UserIpLimitsKey;
import org.apache.ibatis.annotations.Param;

public interface UserIpLimitsMapper {
    long countByExample(UserIpLimitsExample example);

    int deleteByExample(UserIpLimitsExample example);

    int deleteByPrimaryKey(UserIpLimitsKey key);

    int insert(UserIpLimits record);

    int insertSelective(@Param("record") UserIpLimits record, @Param("selective") UserIpLimits.Column ... selective);

    UserIpLimits selectOneByExample(UserIpLimitsExample example);

    UserIpLimits selectOneByExampleSelective(@Param("example") UserIpLimitsExample example, @Param("selective") UserIpLimits.Column ... selective);

    List<UserIpLimits> selectByExampleSelective(@Param("example") UserIpLimitsExample example, @Param("selective") UserIpLimits.Column ... selective);

    List<UserIpLimits> selectByExample(UserIpLimitsExample example);

    UserIpLimits selectByPrimaryKeySelective(@Param("record") UserIpLimitsKey key, @Param("selective") UserIpLimits.Column ... selective);

    UserIpLimits selectByPrimaryKey(UserIpLimitsKey key);

    int updateByExampleSelective(@Param("record") UserIpLimits record, @Param("example") UserIpLimitsExample example, @Param("selective") UserIpLimits.Column ... selective);

    int updateByExample(@Param("record") UserIpLimits record, @Param("example") UserIpLimitsExample example);

    int updateByPrimaryKeySelective(@Param("record") UserIpLimits record, @Param("selective") UserIpLimits.Column ... selective);

    int updateByPrimaryKey(UserIpLimits record);

    int batchInsert(@Param("list") List<UserIpLimits> list);

    int batchInsertSelective(@Param("list") List<UserIpLimits> list, @Param("selective") UserIpLimits.Column ... selective);
}