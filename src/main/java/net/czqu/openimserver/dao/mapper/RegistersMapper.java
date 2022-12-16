package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.RegistersExample;
import net.czqu.openimserver.dao.pojo.Registers;
import org.apache.ibatis.annotations.Param;

public interface RegistersMapper {
    long countByExample(RegistersExample example);

    int deleteByExample(RegistersExample example);

    int deleteByPrimaryKey(String account);

    int insert(Registers record);

    int insertSelective(@Param("record") Registers record, @Param("selective") Registers.Column ... selective);

    Registers selectOneByExample(RegistersExample example);

    Registers selectOneByExampleSelective(@Param("example") RegistersExample example, @Param("selective") Registers.Column ... selective);

    List<Registers> selectByExampleSelective(@Param("example") RegistersExample example, @Param("selective") Registers.Column ... selective);

    List<Registers> selectByExample(RegistersExample example);

    Registers selectByPrimaryKeySelective(@Param("account") String account, @Param("selective") Registers.Column ... selective);

    Registers selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") Registers record, @Param("example") RegistersExample example, @Param("selective") Registers.Column ... selective);

    int updateByExample(@Param("record") Registers record, @Param("example") RegistersExample example);

    int updateByPrimaryKeySelective(@Param("record") Registers record, @Param("selective") Registers.Column ... selective);

    int updateByPrimaryKey(Registers record);

    int batchInsert(@Param("list") List<Registers> list);

    int batchInsertSelective(@Param("list") List<Registers> list, @Param("selective") Registers.Column ... selective);
}