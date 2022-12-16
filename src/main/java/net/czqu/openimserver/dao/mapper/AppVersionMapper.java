package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.AppVersionExample;
import net.czqu.openimserver.dao.pojo.AppVersion;
import net.czqu.openimserver.dao.pojo.AppVersionWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface AppVersionMapper {
    long countByExample(AppVersionExample example);

    int deleteByExample(AppVersionExample example);

    int deleteByPrimaryKey(Long type);

    int insert(AppVersionWithBLOBs record);

    int insertSelective(@Param("record") AppVersionWithBLOBs record, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    AppVersion selectOneByExample(AppVersionExample example);

    AppVersionWithBLOBs selectOneByExampleSelective(@Param("example") AppVersionExample example, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    AppVersionWithBLOBs selectOneByExampleWithBLOBs(AppVersionExample example);

    List<AppVersionWithBLOBs> selectByExampleSelective(@Param("example") AppVersionExample example, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    List<AppVersionWithBLOBs> selectByExampleWithBLOBs(AppVersionExample example);

    List<AppVersion> selectByExample(AppVersionExample example);

    AppVersionWithBLOBs selectByPrimaryKeySelective(@Param("type") Long type, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    AppVersionWithBLOBs selectByPrimaryKey(Long type);

    int updateByExampleSelective(@Param("record") AppVersionWithBLOBs record, @Param("example") AppVersionExample example, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") AppVersionWithBLOBs record, @Param("example") AppVersionExample example);

    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    int updateByPrimaryKeySelective(@Param("record") AppVersionWithBLOBs record, @Param("selective") AppVersionWithBLOBs.Column ... selective);

    int updateByPrimaryKeyWithBLOBs(AppVersionWithBLOBs record);

    int updateByPrimaryKey(AppVersion record);

    int batchInsert(@Param("list") List<AppVersionWithBLOBs> list);

    int batchInsertSelective(@Param("list") List<AppVersionWithBLOBs> list, @Param("selective") AppVersionWithBLOBs.Column ... selective);
}