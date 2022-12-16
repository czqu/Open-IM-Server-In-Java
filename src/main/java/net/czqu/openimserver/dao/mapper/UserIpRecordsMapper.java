package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.UserIpRecordsExample;
import net.czqu.openimserver.dao.pojo.UserIpRecords;
import org.apache.ibatis.annotations.Param;

public interface UserIpRecordsMapper {
    long countByExample(UserIpRecordsExample example);

    int deleteByExample(UserIpRecordsExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserIpRecords record);

    int insertSelective(@Param("record") UserIpRecords record, @Param("selective") UserIpRecords.Column ... selective);

    UserIpRecords selectOneByExample(UserIpRecordsExample example);

    UserIpRecords selectOneByExampleSelective(@Param("example") UserIpRecordsExample example, @Param("selective") UserIpRecords.Column ... selective);

    List<UserIpRecords> selectByExampleSelective(@Param("example") UserIpRecordsExample example, @Param("selective") UserIpRecords.Column ... selective);

    List<UserIpRecords> selectByExample(UserIpRecordsExample example);

    UserIpRecords selectByPrimaryKeySelective(@Param("userId") String userId, @Param("selective") UserIpRecords.Column ... selective);

    UserIpRecords selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserIpRecords record, @Param("example") UserIpRecordsExample example, @Param("selective") UserIpRecords.Column ... selective);

    int updateByExample(@Param("record") UserIpRecords record, @Param("example") UserIpRecordsExample example);

    int updateByPrimaryKeySelective(@Param("record") UserIpRecords record, @Param("selective") UserIpRecords.Column ... selective);

    int updateByPrimaryKey(UserIpRecords record);

    int batchInsert(@Param("list") List<UserIpRecords> list);

    int batchInsertSelective(@Param("list") List<UserIpRecords> list, @Param("selective") UserIpRecords.Column ... selective);
}