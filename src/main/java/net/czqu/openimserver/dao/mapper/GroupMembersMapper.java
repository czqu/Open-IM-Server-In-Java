package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.GroupMembersExample;
import net.czqu.openimserver.dao.pojo.GroupMembers;
import net.czqu.openimserver.dao.pojo.GroupMembersKey;
import org.apache.ibatis.annotations.Param;

public interface GroupMembersMapper {
    long countByExample(GroupMembersExample example);

    int deleteByExample(GroupMembersExample example);

    int deleteByPrimaryKey(GroupMembersKey key);

    int insert(GroupMembers record);

    int insertSelective(@Param("record") GroupMembers record, @Param("selective") GroupMembers.Column ... selective);

    GroupMembers selectOneByExample(GroupMembersExample example);

    GroupMembers selectOneByExampleSelective(@Param("example") GroupMembersExample example, @Param("selective") GroupMembers.Column ... selective);

    List<GroupMembers> selectByExampleSelective(@Param("example") GroupMembersExample example, @Param("selective") GroupMembers.Column ... selective);

    List<GroupMembers> selectByExample(GroupMembersExample example);

    GroupMembers selectByPrimaryKeySelective(@Param("record") GroupMembersKey key, @Param("selective") GroupMembers.Column ... selective);

    GroupMembers selectByPrimaryKey(GroupMembersKey key);

    int updateByExampleSelective(@Param("record") GroupMembers record, @Param("example") GroupMembersExample example, @Param("selective") GroupMembers.Column ... selective);

    int updateByExample(@Param("record") GroupMembers record, @Param("example") GroupMembersExample example);

    int updateByPrimaryKeySelective(@Param("record") GroupMembers record, @Param("selective") GroupMembers.Column ... selective);

    int updateByPrimaryKey(GroupMembers record);

    int batchInsert(@Param("list") List<GroupMembers> list);

    int batchInsertSelective(@Param("list") List<GroupMembers> list, @Param("selective") GroupMembers.Column ... selective);
}