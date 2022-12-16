package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.GroupsExample;
import net.czqu.openimserver.dao.pojo.Groups;
import org.apache.ibatis.annotations.Param;

public interface GroupsMapper {
    long countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int deleteByPrimaryKey(String groupId);

    int insert(Groups record);

    int insertSelective(@Param("record") Groups record, @Param("selective") Groups.Column ... selective);

    Groups selectOneByExample(GroupsExample example);

    Groups selectOneByExampleSelective(@Param("example") GroupsExample example, @Param("selective") Groups.Column ... selective);

    Groups selectOneByExampleWithBLOBs(GroupsExample example);

    List<Groups> selectByExampleSelective(@Param("example") GroupsExample example, @Param("selective") Groups.Column ... selective);

    List<Groups> selectByExampleWithBLOBs(GroupsExample example);

    List<Groups> selectByExample(GroupsExample example);

    Groups selectByPrimaryKeySelective(@Param("groupId") String groupId, @Param("selective") Groups.Column ... selective);

    Groups selectByPrimaryKey(String groupId);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example, @Param("selective") Groups.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByPrimaryKeySelective(@Param("record") Groups record, @Param("selective") Groups.Column ... selective);

    int updateByPrimaryKeyWithBLOBs(Groups record);

    int updateByPrimaryKey(Groups record);

    int batchInsert(@Param("list") List<Groups> list);

    int batchInsertSelective(@Param("list") List<Groups> list, @Param("selective") Groups.Column ... selective);
}