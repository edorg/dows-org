package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgSpaceEntity;
import org.dows.org.mapper.OrgSpaceMapper;

@Component
public class OrgSpaceDao extends CrudDaoImpl<OrgSpaceMapper,OrgSpaceEntity>{

}