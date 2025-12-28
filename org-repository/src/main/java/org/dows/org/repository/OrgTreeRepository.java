package org.dows.org.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.org.entity.OrgTreeEntity;
import org.dows.org.dao.OrgTreeDao;

@Component
public class OrgTreeRepository  extends CrudRepository<OrgTreeDao,OrgTreeEntity> {

}