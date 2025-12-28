package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgResourceEntity;
import org.dows.org.dao.OrgResourceDao;

@Component
public class OrgResourceRepository  extends CrudRepository<OrgResourceDao,OrgResourceEntity> {

}