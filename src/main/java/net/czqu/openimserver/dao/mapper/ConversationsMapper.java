package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.ConversationsExample;
import net.czqu.openimserver.dao.pojo.Conversations;
import net.czqu.openimserver.dao.pojo.ConversationsKey;
import org.apache.ibatis.annotations.Param;

public interface ConversationsMapper {
    long countByExample(ConversationsExample example);

    int deleteByExample(ConversationsExample example);

    int deleteByPrimaryKey(ConversationsKey key);

    int insert(Conversations record);

    int insertSelective(@Param("record") Conversations record, @Param("selective") Conversations.Column ... selective);

    Conversations selectOneByExample(ConversationsExample example);

    Conversations selectOneByExampleSelective(@Param("example") ConversationsExample example, @Param("selective") Conversations.Column ... selective);

    List<Conversations> selectByExampleSelective(@Param("example") ConversationsExample example, @Param("selective") Conversations.Column ... selective);

    List<Conversations> selectByExample(ConversationsExample example);

    Conversations selectByPrimaryKeySelective(@Param("record") ConversationsKey key, @Param("selective") Conversations.Column ... selective);

    Conversations selectByPrimaryKey(ConversationsKey key);

    int updateByExampleSelective(@Param("record") Conversations record, @Param("example") ConversationsExample example, @Param("selective") Conversations.Column ... selective);

    int updateByExample(@Param("record") Conversations record, @Param("example") ConversationsExample example);

    int updateByPrimaryKeySelective(@Param("record") Conversations record, @Param("selective") Conversations.Column ... selective);

    int updateByPrimaryKey(Conversations record);

    int batchInsert(@Param("list") List<Conversations> list);

    int batchInsertSelective(@Param("list") List<Conversations> list, @Param("selective") Conversations.Column ... selective);
}