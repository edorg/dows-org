package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgAddressEntity;
import org.dows.org.mapper.OrgAddressMapper;

@Component
public class OrgAddressDao extends CrudDaoImpl<OrgAddressMapper,OrgAddressEntity>{

}