package net.yozo.services.front.applyEnchashment;import net.yozo.core.Services;import net.yozo.services.front.applyEnchashment.bean.ApplyEnchashment;public interface ApplyEnchashmentService extends Services<ApplyEnchashment> {    //获取最近一次未审核的申请记录    ApplyEnchashment selectRecentApplyByAccId(String accId);}