package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgInfoEntity;
import org.dows.org.mapper.OrgInfoMapper;

@Component
public class OrgInfoDao extends CrudDaoImpl<OrgInfoMapper,OrgInfoEntity>{

}