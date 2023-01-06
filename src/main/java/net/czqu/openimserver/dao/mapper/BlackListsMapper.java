package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.BlackListsExample;
import net.czqu.openimserver.dao.pojo.BlackLists;
import org.apache.ibatis.annotations.Param;

public interface BlackListsMapper {
    long countByExample(BlackListsExample example);

    int deleteByExample(BlackListsExample example);

    int insert(BlackLists record);

    int insertSelective(@Param("record") BlackLists record, @Param("selective") BlackLists.Column ... selective);

    BlackLists selectOneByExample(BlackListsExample example);

    BlackLists selectOneByExampleSelective(@Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    BlackLists selectOneByExampleWithBLOBs(BlackListsExample example);

    List<BlackLists> selectByExampleSelective(@Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    List<BlackLists> selectByExampleWithBLOBs(BlackListsExample example);

    List<BlackLists> selectByExample(BlackListsExample example);

    int updateByExampleSelective(@Param("record") BlackLists record, @Param("example") BlackListsExample example, @Param("selective") BlackLists.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") BlackLists record, @Param("example") BlackListsExample example);

    int updateByExample(@Param("record") BlackLists record, @Param("example") BlackListsExample example);

    int batchInsert(@Param("list") List<BlackLists> list);

    int batchInsertSelective(@Param("list") List<BlackLists> list, @Param("selective") BlackLists.Column ... selective);
}