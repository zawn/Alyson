package net.yozo.services.front.keyvalue.impl;import net.yozo.core.ServersManager;import net.yozo.services.front.keyvalue.KeyvalueService;import net.yozo.services.front.keyvalue.bean.Keyvalue;import net.yozo.services.front.keyvalue.dao.KeyvalueDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;@Servicepublic class KeyvalueServiceImpl extends ServersManager<Keyvalue, KeyvalueDao> implements		KeyvalueService {    @Autowired    @Override    public void setDao(KeyvalueDao keyvalueDao) {        this.dao = keyvalueDao;    }}