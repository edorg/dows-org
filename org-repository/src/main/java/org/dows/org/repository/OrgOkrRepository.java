package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgOkrEntity;
import org.dows.org.dao.OrgOkrDao;

@Component
public class OrgOkrRepository  extends CrudRepository<OrgOkrDao,OrgOkrEntity> {

}