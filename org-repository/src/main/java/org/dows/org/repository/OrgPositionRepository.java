package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgPositionEntity;
import org.dows.org.dao.OrgPositionDao;

@Component
public class OrgPositionRepository  extends CrudRepository<OrgPositionDao,OrgPositionEntity> {

}