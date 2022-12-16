package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.DepartmentsExample;
import net.czqu.openimserver.dao.pojo.Departments;
import org.apache.ibatis.annotations.Param;

public interface DepartmentsMapper {
    long countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);

    int deleteByPrimaryKey(String departmentId);

    int insert(Departments record);

    int insertSelective(@Param("record") Departments record, @Param("selective") Departments.Column ... selective);

    Departments selectOneByExample(DepartmentsExample example);

    Departments selectOneByExampleSelective(@Param("example") DepartmentsExample example, @Param("selective") Departments.Column ... selective);

    List<Departments> selectByExampleSelective(@Param("example") DepartmentsExample example, @Param("selective") Departments.Column ... selective);

    List<Departments> selectByExample(DepartmentsExample example);

    Departments selectByPrimaryKeySelective(@Param("departmentId") String departmentId, @Param("selective") Departments.Column ... selective);

    Departments selectByPrimaryKey(String departmentId);

    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example, @Param("selective") Departments.Column ... selective);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(@Param("record") Departments record, @Param("selective") Departments.Column ... selective);

    int updateByPrimaryKey(Departments record);

    int batchInsert(@Param("list") List<Departments> list);

    int batchInsertSelective(@Param("list") List<Departments> list, @Param("selective") Departments.Column ... selective);
}