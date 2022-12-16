package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.UsersExample;
import net.czqu.openimserver.dao.pojo.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String userId);

    int insert(Users record);

    int insertSelective(@Param("record") Users record, @Param("selective") Users.Column ... selective);

    Users selectOneByExample(UsersExample example);

    Users selectOneByExampleSelective(@Param("example") UsersExample example, @Param("selective") Users.Column ... selective);

    List<Users> selectByExampleSelective(@Param("example") UsersExample example, @Param("selective") Users.Column ... selective);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKeySelective(@Param("userId") String userId, @Param("selective") Users.Column ... selective);

    Users selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example, @Param("selective") Users.Column ... selective);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(@Param("record") Users record, @Param("selective") Users.Column ... selective);

    int updateByPrimaryKey(Users record);

    int batchInsert(@Param("list") List<Users> list);

    int batchInsertSelective(@Param("list") List<Users> list, @Param("selective") Users.Column ... selective);
}