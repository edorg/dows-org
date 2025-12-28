package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgInfoEntity;
import org.dows.org.dao.OrgInfoDao;

@Component
public class OrgInfoRepository  extends CrudRepository<OrgInfoDao,OrgInfoEntity> {

}