package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgResourceEntity;
import org.dows.org.mapper.OrgResourceMapper;

@Component
public class OrgResourceDao extends CrudDaoImpl<OrgResourceMapper,OrgResourceEntity>{

}