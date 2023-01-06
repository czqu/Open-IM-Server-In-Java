package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.FriendRequestsExample;
import net.czqu.openimserver.dao.pojo.FriendRequests;
import net.czqu.openimserver.dao.pojo.FriendRequestsKey;
import org.apache.ibatis.annotations.Param;

public interface FriendRequestsMapper {
    long countByExample(FriendRequestsExample example);

    int deleteByExample(FriendRequestsExample example);

    int deleteByPrimaryKey(FriendRequestsKey key);

    int insert(FriendRequests record);

    int insertSelective(@Param("record") FriendRequests record, @Param("selective") FriendRequests.Column ... selective);

    FriendRequests selectOneByExample(FriendRequestsExample example);

    FriendRequests selectOneByExampleSelective(@Param("example") FriendRequestsExample example, @Param("selective") FriendRequests.Column ... selective);

    List<FriendRequests> selectByExampleSelective(@Param("example") FriendRequestsExample example, @Param("selective") FriendRequests.Column ... selective);

    List<FriendRequests> selectByExample(FriendRequestsExample example);

    FriendRequests selectByPrimaryKeySelective(@Param("record") FriendRequestsKey key, @Param("selective") FriendRequests.Column ... selective);

    FriendRequests selectByPrimaryKey(FriendRequestsKey key);

    int updateByExampleSelective(@Param("record") FriendRequests record, @Param("example") FriendRequestsExample example, @Param("selective") FriendRequests.Column ... selective);

    int updateByExample(@Param("record") FriendRequests record, @Param("example") FriendRequestsExample example);

    int updateByPrimaryKeySelective(@Param("record") FriendRequests record, @Param("selective") FriendRequests.Column ... selective);

    int updateByPrimaryKey(FriendRequests record);

    int batchInsert(@Param("list") List<FriendRequests> list);

    int batchInsertSelective(@Param("list") List<FriendRequests> list, @Param("selective") FriendRequests.Column ... selective);
}