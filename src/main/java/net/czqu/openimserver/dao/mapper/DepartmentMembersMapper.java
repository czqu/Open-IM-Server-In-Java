package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.DepartmentMembersExample;
import net.czqu.openimserver.dao.pojo.DepartmentMembers;
import net.czqu.openimserver.dao.pojo.DepartmentMembersKey;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMembersMapper {
    long countByExample(DepartmentMembersExample example);

    int deleteByExample(DepartmentMembersExample example);

    int deleteByPrimaryKey(DepartmentMembersKey key);

    int insert(DepartmentMembers record);

    int insertSelective(@Param("record") DepartmentMembers record, @Param("selective") DepartmentMembers.Column ... selective);

    DepartmentMembers selectOneByExample(DepartmentMembersExample example);

    DepartmentMembers selectOneByExampleSelective(@Param("example") DepartmentMembersExample example, @Param("selective") DepartmentMembers.Column ... selective);

    List<DepartmentMembers> selectByExampleSelective(@Param("example") DepartmentMembersExample example, @Param("selective") DepartmentMembers.Column ... selective);

    List<DepartmentMembers> selectByExample(DepartmentMembersExample example);

    DepartmentMembers selectByPrimaryKeySelective(@Param("record") DepartmentMembersKey key, @Param("selective") DepartmentMembers.Column ... selective);

    DepartmentMembers selectByPrimaryKey(DepartmentMembersKey key);

    int updateByExampleSelective(@Param("record") DepartmentMembers record, @Param("example") DepartmentMembersExample example, @Param("selective") DepartmentMembers.Column ... selective);

    int updateByExample(@Param("record") DepartmentMembers record, @Param("example") DepartmentMembersExample example);

    int updateByPrimaryKeySelective(@Param("record") DepartmentMembers record, @Param("selective") DepartmentMembers.Column ... selective);

    int updateByPrimaryKey(DepartmentMembers record);

    int batchInsert(@Param("list") List<DepartmentMembers> list);

    int batchInsertSelective(@Param("list") List<DepartmentMembers> list, @Param("selective") DepartmentMembers.Column ... selective);
}