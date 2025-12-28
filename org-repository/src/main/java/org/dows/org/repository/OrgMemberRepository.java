package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgMemberEntity;
import org.dows.org.dao.OrgMemberDao;

@Component
public class OrgMemberRepository  extends CrudRepository<OrgMemberDao,OrgMemberEntity> {

}