package net.yozo.services.front.label_link.impl;import net.yozo.core.ServersManager;import net.yozo.services.front.label_link.Label_linkService;import net.yozo.services.front.label_link.bean.Label_link;import net.yozo.services.front.label_link.dao.Label_linkDao;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Service("label_linkServiceManage")public class Label_linkServiceImpl extends ServersManager<Label_link, Label_linkDao>		implements Label_linkService {    @Resource(name = "label_linkDaoManage")    @Override    public void setDao(Label_linkDao label_linkDao) {        this.dao = label_linkDao;    }    @Override	public int deleteByCondition(Label_link e) {		return dao.deleteByCondition(e);	}}