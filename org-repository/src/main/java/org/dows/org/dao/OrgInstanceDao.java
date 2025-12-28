package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgInstanceEntity;
import org.dows.org.mapper.OrgInstanceMapper;

@Component
public class OrgInstanceDao extends CrudDaoImpl<OrgInstanceMapper,OrgInstanceEntity>{

}