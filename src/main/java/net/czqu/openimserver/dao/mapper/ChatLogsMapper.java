package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.ChatLogsExample;
import net.czqu.openimserver.dao.pojo.ChatLogs;
import org.apache.ibatis.annotations.Param;

public interface ChatLogsMapper {
    long countByExample(ChatLogsExample example);

    int deleteByExample(ChatLogsExample example);

    int deleteByPrimaryKey(String serverMsgId);

    int insert(ChatLogs record);

    int insertSelective(@Param("record") ChatLogs record, @Param("selective") ChatLogs.Column ... selective);

    ChatLogs selectOneByExample(ChatLogsExample example);

    ChatLogs selectOneByExampleSelective(@Param("example") ChatLogsExample example, @Param("selective") ChatLogs.Column ... selective);

    List<ChatLogs> selectByExampleSelective(@Param("example") ChatLogsExample example, @Param("selective") ChatLogs.Column ... selective);

    List<ChatLogs> selectByExample(ChatLogsExample example);

    ChatLogs selectByPrimaryKeySelective(@Param("serverMsgId") String serverMsgId, @Param("selective") ChatLogs.Column ... selective);

    ChatLogs selectByPrimaryKey(String serverMsgId);

    int updateByExampleSelective(@Param("record") ChatLogs record, @Param("example") ChatLogsExample example, @Param("selective") ChatLogs.Column ... selective);

    int updateByExample(@Param("record") ChatLogs record, @Param("example") ChatLogsExample example);

    int updateByPrimaryKeySelective(@Param("record") ChatLogs record, @Param("selective") ChatLogs.Column ... selective);

    int updateByPrimaryKey(ChatLogs record);

    int batchInsert(@Param("list") List<ChatLogs> list);

    int batchInsertSelective(@Param("list") List<ChatLogs> list, @Param("selective") ChatLogs.Column ... selective);
}