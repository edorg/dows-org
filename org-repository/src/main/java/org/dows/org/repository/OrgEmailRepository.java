package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgEmailEntity;
import org.dows.org.dao.OrgEmailDao;

@Component
public class OrgEmailRepository  extends CrudRepository<OrgEmailDao,OrgEmailEntity> {

}