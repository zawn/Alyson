package net.yozo.services.front.gift.impl;import net.yozo.core.ServersManager;import net.yozo.services.front.gift.GiftService;import net.yozo.services.front.gift.bean.Gift;import net.yozo.services.front.gift.dao.GiftDao;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Service("giftServiceManage")public class GiftServiceImpl extends ServersManager<Gift, GiftDao> implements		GiftService {    @Resource(name = "giftDaoManage")    @Override    public void setDao(GiftDao giftDao) {        this.dao = giftDao;    }}