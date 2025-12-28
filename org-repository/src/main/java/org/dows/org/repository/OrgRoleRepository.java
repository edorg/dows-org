package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgRoleEntity;
import org.dows.org.dao.OrgRoleDao;

@Component
public class OrgRoleRepository  extends CrudRepository<OrgRoleDao,OrgRoleEntity> {

}