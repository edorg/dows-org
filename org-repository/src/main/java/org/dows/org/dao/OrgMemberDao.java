package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgMemberEntity;
import org.dows.org.mapper.OrgMemberMapper;

@Component
public class OrgMemberDao extends CrudDaoImpl<OrgMemberMapper,OrgMemberEntity>{

}