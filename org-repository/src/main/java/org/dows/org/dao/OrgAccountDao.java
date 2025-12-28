package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgAccountEntity;
import org.dows.org.mapper.OrgAccountMapper;

@Component
public class OrgAccountDao extends CrudDaoImpl<OrgAccountMapper,OrgAccountEntity>{

}