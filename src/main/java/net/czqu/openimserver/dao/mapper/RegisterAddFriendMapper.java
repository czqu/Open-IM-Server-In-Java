package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.RegisterAddFriendExample;
import net.czqu.openimserver.dao.pojo.RegisterAddFriend;
import org.apache.ibatis.annotations.Param;

public interface RegisterAddFriendMapper {
    long countByExample(RegisterAddFriendExample example);

    int deleteByExample(RegisterAddFriendExample example);

    int deleteByPrimaryKey(String userId);

    int insert(RegisterAddFriend record);

    int insertSelective(@Param("record") RegisterAddFriend record, @Param("selective") RegisterAddFriend.Column ... selective);

    RegisterAddFriend selectOneByExample(RegisterAddFriendExample example);

    RegisterAddFriend selectOneByExampleSelective(@Param("example") RegisterAddFriendExample example, @Param("selective") RegisterAddFriend.Column ... selective);

    List<RegisterAddFriend> selectByExampleSelective(@Param("example") RegisterAddFriendExample example, @Param("selective") RegisterAddFriend.Column ... selective);

    List<RegisterAddFriend> selectByExample(RegisterAddFriendExample example);

    int updateByExampleSelective(@Param("record") RegisterAddFriend record, @Param("example") RegisterAddFriendExample example, @Param("selective") RegisterAddFriend.Column ... selective);

    int updateByExample(@Param("record") RegisterAddFriend record, @Param("example") RegisterAddFriendExample example);

    int batchInsert(@Param("list") List<RegisterAddFriend> list);

    int batchInsertSelective(@Param("list") List<RegisterAddFriend> list, @Param("selective") RegisterAddFriend.Column ... selective);
}