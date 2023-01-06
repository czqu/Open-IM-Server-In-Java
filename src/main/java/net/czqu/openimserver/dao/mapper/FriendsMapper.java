package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.FriendsExample;
import net.czqu.openimserver.dao.pojo.Friends;
import net.czqu.openimserver.dao.pojo.FriendsKey;
import org.apache.ibatis.annotations.Param;

public interface FriendsMapper {
    long countByExample(FriendsExample example);

    int deleteByExample(FriendsExample example);

    int deleteByPrimaryKey(FriendsKey key);

    int insert(Friends record);

    int insertSelective(@Param("record") Friends record, @Param("selective") Friends.Column ... selective);

    Friends selectOneByExample(FriendsExample example);

    Friends selectOneByExampleSelective(@Param("example") FriendsExample example, @Param("selective") Friends.Column ... selective);

    List<Friends> selectByExampleSelective(@Param("example") FriendsExample example, @Param("selective") Friends.Column ... selective);

    List<Friends> selectByExample(FriendsExample example);

    Friends selectByPrimaryKeySelective(@Param("record") FriendsKey key, @Param("selective") Friends.Column ... selective);

    Friends selectByPrimaryKey(FriendsKey key);

    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example, @Param("selective") Friends.Column ... selective);

    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByPrimaryKeySelective(@Param("record") Friends record, @Param("selective") Friends.Column ... selective);

    int updateByPrimaryKey(Friends record);

    int batchInsert(@Param("list") List<Friends> list);

    int batchInsertSelective(@Param("list") List<Friends> list, @Param("selective") Friends.Column ... selective);
}