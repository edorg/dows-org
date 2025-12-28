package org.dows.org.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.org.entity.OrgTreeEntity;
import org.dows.org.mapper.OrgTreeMapper;

@Component
public class OrgTreeDao extends CrudDaoImpl<OrgTreeMapper,OrgTreeEntity>{

}