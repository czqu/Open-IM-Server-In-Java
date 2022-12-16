package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.OrganizationUsersExample;
import net.czqu.openimserver.dao.pojo.OrganizationUsers;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUsersMapper {
    long countByExample(OrganizationUsersExample example);

    int deleteByExample(OrganizationUsersExample example);

    int deleteByPrimaryKey(String userId);

    int insert(OrganizationUsers record);

    int insertSelective(@Param("record") OrganizationUsers record, @Param("selective") OrganizationUsers.Column ... selective);

    OrganizationUsers selectOneByExample(OrganizationUsersExample example);

    OrganizationUsers selectOneByExampleSelective(@Param("example") OrganizationUsersExample example, @Param("selective") OrganizationUsers.Column ... selective);

    List<OrganizationUsers> selectByExampleSelective(@Param("example") OrganizationUsersExample example, @Param("selective") OrganizationUsers.Column ... selective);

    List<OrganizationUsers> selectByExample(OrganizationUsersExample example);

    OrganizationUsers selectByPrimaryKeySelective(@Param("userId") String userId, @Param("selective") OrganizationUsers.Column ... selective);

    OrganizationUsers selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") OrganizationUsers record, @Param("example") OrganizationUsersExample example, @Param("selective") OrganizationUsers.Column ... selective);

    int updateByExample(@Param("record") OrganizationUsers record, @Param("example") OrganizationUsersExample example);

    int updateByPrimaryKeySelective(@Param("record") OrganizationUsers record, @Param("selective") OrganizationUsers.Column ... selective);

    int updateByPrimaryKey(OrganizationUsers record);

    int batchInsert(@Param("list") List<OrganizationUsers> list);

    int batchInsertSelective(@Param("list") List<OrganizationUsers> list, @Param("selective") OrganizationUsers.Column ... selective);
}