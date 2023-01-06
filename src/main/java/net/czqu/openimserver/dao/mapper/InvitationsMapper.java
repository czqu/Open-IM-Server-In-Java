package net.czqu.openimserver.dao.mapper;

import java.util.List;
import net.czqu.openimserver.dao.example.InvitationsExample;
import net.czqu.openimserver.dao.pojo.Invitations;
import org.apache.ibatis.annotations.Param;

public interface InvitationsMapper {
    long countByExample(InvitationsExample example);

    int deleteByExample(InvitationsExample example);

    int deleteByPrimaryKey(String invitationCode);

    int insert(Invitations record);

    int insertSelective(@Param("record") Invitations record, @Param("selective") Invitations.Column ... selective);

    Invitations selectOneByExample(InvitationsExample example);

    Invitations selectOneByExampleSelective(@Param("example") InvitationsExample example, @Param("selective") Invitations.Column ... selective);

    List<Invitations> selectByExampleSelective(@Param("example") InvitationsExample example, @Param("selective") Invitations.Column ... selective);

    List<Invitations> selectByExample(InvitationsExample example);

    Invitations selectByPrimaryKeySelective(@Param("invitationCode") String invitationCode, @Param("selective") Invitations.Column ... selective);

    Invitations selectByPrimaryKey(String invitationCode);

    int updateByExampleSelective(@Param("record") Invitations record, @Param("example") InvitationsExample example, @Param("selective") Invitations.Column ... selective);

    int updateByExample(@Param("record") Invitations record, @Param("example") InvitationsExample example);

    int updateByPrimaryKeySelective(@Param("record") Invitations record, @Param("selective") Invitations.Column ... selective);

    int updateByPrimaryKey(Invitations record);

    int batchInsert(@Param("list") List<Invitations> list);

    int batchInsertSelective(@Param("list") List<Invitations> list, @Param("selective") Invitations.Column ... selective);
}