package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.ClientInitConfigExample;
import net.czqu.openimserver.dao.pojo.ClientInitConfig;
import org.apache.ibatis.annotations.Param;

public interface ClientInitConfigMapper {
    long countByExample(ClientInitConfigExample example);

    int deleteByExample(ClientInitConfigExample example);

    int insert(ClientInitConfig record);

    int insertSelective(@Param("record") ClientInitConfig record, @Param("selective") ClientInitConfig.Column ... selective);

    ClientInitConfig selectOneByExample(ClientInitConfigExample example);

    ClientInitConfig selectOneByExampleSelective(@Param("example") ClientInitConfigExample example, @Param("selective") ClientInitConfig.Column ... selective);

    List<ClientInitConfig> selectByExampleSelective(@Param("example") ClientInitConfigExample example, @Param("selective") ClientInitConfig.Column ... selective);

    List<ClientInitConfig> selectByExample(ClientInitConfigExample example);

    int updateByExampleSelective(@Param("record") ClientInitConfig record, @Param("example") ClientInitConfigExample example, @Param("selective") ClientInitConfig.Column ... selective);

    int updateByExample(@Param("record") ClientInitConfig record, @Param("example") ClientInitConfigExample example);

    int batchInsert(@Param("list") List<ClientInitConfig> list);

    int batchInsertSelective(@Param("list") List<ClientInitConfig> list, @Param("selective") ClientInitConfig.Column ... selective);
}