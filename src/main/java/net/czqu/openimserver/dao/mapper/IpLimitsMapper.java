package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.IpLimitsExample;
import net.czqu.openimserver.dao.pojo.IpLimits;
import org.apache.ibatis.annotations.Param;

public interface IpLimitsMapper {
    long countByExample(IpLimitsExample example);

    int deleteByExample(IpLimitsExample example);

    int deleteByPrimaryKey(String ip);

    int insert(IpLimits record);

    int insertSelective(@Param("record") IpLimits record, @Param("selective") IpLimits.Column ... selective);

    IpLimits selectOneByExample(IpLimitsExample example);

    IpLimits selectOneByExampleSelective(@Param("example") IpLimitsExample example, @Param("selective") IpLimits.Column ... selective);

    List<IpLimits> selectByExampleSelective(@Param("example") IpLimitsExample example, @Param("selective") IpLimits.Column ... selective);

    List<IpLimits> selectByExample(IpLimitsExample example);

    IpLimits selectByPrimaryKeySelective(@Param("ip") String ip, @Param("selective") IpLimits.Column ... selective);

    IpLimits selectByPrimaryKey(String ip);

    int updateByExampleSelective(@Param("record") IpLimits record, @Param("example") IpLimitsExample example, @Param("selective") IpLimits.Column ... selective);

    int updateByExample(@Param("record") IpLimits record, @Param("example") IpLimitsExample example);

    int updateByPrimaryKeySelective(@Param("record") IpLimits record, @Param("selective") IpLimits.Column ... selective);

    int updateByPrimaryKey(IpLimits record);

    int batchInsert(@Param("list") List<IpLimits> list);

    int batchInsertSelective(@Param("list") List<IpLimits> list, @Param("selective") IpLimits.Column ... selective);
}