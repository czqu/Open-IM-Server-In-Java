package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.BlacksExample;
import net.czqu.openimserver.dao.pojo.Blacks;
import net.czqu.openimserver.dao.pojo.BlacksKey;
import org.apache.ibatis.annotations.Param;

public interface BlacksMapper {
    long countByExample(BlacksExample example);

    int deleteByExample(BlacksExample example);

    int deleteByPrimaryKey(BlacksKey key);

    int insert(Blacks record);

    int insertSelective(@Param("record") Blacks record, @Param("selective") Blacks.Column ... selective);

    Blacks selectOneByExample(BlacksExample example);

    Blacks selectOneByExampleSelective(@Param("example") BlacksExample example, @Param("selective") Blacks.Column ... selective);

    List<Blacks> selectByExampleSelective(@Param("example") BlacksExample example, @Param("selective") Blacks.Column ... selective);

    List<Blacks> selectByExample(BlacksExample example);

    Blacks selectByPrimaryKeySelective(@Param("record") BlacksKey key, @Param("selective") Blacks.Column ... selective);

    Blacks selectByPrimaryKey(BlacksKey key);

    int updateByExampleSelective(@Param("record") Blacks record, @Param("example") BlacksExample example, @Param("selective") Blacks.Column ... selective);

    int updateByExample(@Param("record") Blacks record, @Param("example") BlacksExample example);

    int updateByPrimaryKeySelective(@Param("record") Blacks record, @Param("selective") Blacks.Column ... selective);

    int updateByPrimaryKey(Blacks record);

    int batchInsert(@Param("list") List<Blacks> list);

    int batchInsertSelective(@Param("list") List<Blacks> list, @Param("selective") Blacks.Column ... selective);
}