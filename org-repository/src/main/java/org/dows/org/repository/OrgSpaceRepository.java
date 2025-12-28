package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgSpaceEntity;
import org.dows.org.dao.OrgSpaceDao;

@Component
public class OrgSpaceRepository  extends CrudRepository<OrgSpaceDao,OrgSpaceEntity> {

}