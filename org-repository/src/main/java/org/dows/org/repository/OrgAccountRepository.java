package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgAccountEntity;
import org.dows.org.dao.OrgAccountDao;

@Component
public class OrgAccountRepository  extends CrudRepository<OrgAccountDao,OrgAccountEntity> {

}