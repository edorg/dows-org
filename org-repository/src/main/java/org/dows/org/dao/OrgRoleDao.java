package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgRoleEntity;
import org.dows.org.mapper.OrgRoleMapper;

@Component
public class OrgRoleDao extends CrudDaoImpl<OrgRoleMapper,OrgRoleEntity>{

}