package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgInstanceEntity;
import org.dows.org.dao.OrgInstanceDao;

@Component
public class OrgInstanceRepository  extends CrudRepository<OrgInstanceDao,OrgInstanceEntity> {

}