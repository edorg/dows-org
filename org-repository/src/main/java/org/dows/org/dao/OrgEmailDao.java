package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgEmailEntity;
import org.dows.org.mapper.OrgEmailMapper;

@Component
public class OrgEmailDao extends CrudDaoImpl<OrgEmailMapper,OrgEmailEntity>{

}