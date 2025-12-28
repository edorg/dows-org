package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgAddressEntity;
import org.dows.org.dao.OrgAddressDao;

@Component
public class OrgAddressRepository  extends CrudRepository<OrgAddressDao,OrgAddressEntity> {

}