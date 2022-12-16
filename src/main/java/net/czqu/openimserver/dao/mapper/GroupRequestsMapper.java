package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.GroupRequestsExample;
import net.czqu.openimserver.dao.pojo.GroupRequests;
import net.czqu.openimserver.dao.pojo.GroupRequestsKey;
import org.apache.ibatis.annotations.Param;

public interface GroupRequestsMapper {
    long countByExample(GroupRequestsExample example);

    int deleteByExample(GroupRequestsExample example);

    int deleteByPrimaryKey(GroupRequestsKey key);

    int insert(GroupRequests record);

    int insertSelective(@Param("record") GroupRequests record, @Param("selective") GroupRequests.Column ... selective);

    GroupRequests selectOneByExample(GroupRequestsExample example);

    GroupRequests selectOneByExampleSelective(@Param("example") GroupRequestsExample example, @Param("selective") GroupRequests.Column ... selective);

    List<GroupRequests> selectByExampleSelective(@Param("example") GroupRequestsExample example, @Param("selective") GroupRequests.Column ... selective);

    List<GroupRequests> selectByExample(GroupRequestsExample example);

    GroupRequests selectByPrimaryKeySelective(@Param("record") GroupRequestsKey key, @Param("selective") GroupRequests.Column ... selective);

    GroupRequests selectByPrimaryKey(GroupRequestsKey key);

    int updateByExampleSelective(@Param("record") GroupRequests record, @Param("example") GroupRequestsExample example, @Param("selective") GroupRequests.Column ... selective);

    int updateByExample(@Param("record") GroupRequests record, @Param("example") GroupRequestsExample example);

    int updateByPrimaryKeySelective(@Param("record") GroupRequests record, @Param("selective") GroupRequests.Column ... selective);

    int updateByPrimaryKey(GroupRequests record);

    int batchInsert(@Param("list") List<GroupRequests> list);

    int batchInsertSelective(@Param("list") List<GroupRequests> list, @Param("selective") GroupRequests.Column ... selective);
}