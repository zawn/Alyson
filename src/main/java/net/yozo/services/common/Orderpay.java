package net.yozo.services.common;import net.yozo.core.dao.page.PagerModel;import java.io.Serializable;public class Orderpay extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String orderid;	private String paystatus;	private double payamount;	private String createtime;	private String paymethod;	private String confirmdate;	private String confirmuser;	private String remark;	private String tradeNo;		public static final String orderpay_paystatus_y = "y";//支付成功	public static final String orderpay_paystatus_n = "n";//未支付成功		public static final String orderpay_paymethod_alipayescow = "alipayescow";//支付宝纯担保交易接口	public void clear() {		super.clear();		id = null;		orderid = null;		paystatus = null;		payamount = 0;		createtime = null;		paymethod = null;		confirmdate = null;		confirmuser = null;		remark = null;		tradeNo = null;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getOrderid() {		return orderid;	}	public void setOrderid(String orderid) {		this.orderid = orderid;	}	public String getPaystatus() {		return paystatus;	}	public void setPaystatus(String paystatus) {		this.paystatus = paystatus;	}	public double getPayamount() {		return payamount;	}	public void setPayamount(double payamount) {		this.payamount = payamount;	}	public String getCreatetime() {		return createtime;	}	public void setCreatetime(String createtime) {		this.createtime = createtime;	}	public String getPaymethod() {		return paymethod;	}	public void setPaymethod(String paymethod) {		this.paymethod = paymethod;	}	public String getConfirmdate() {		return confirmdate;	}	public void setConfirmdate(String confirmdate) {		this.confirmdate = confirmdate;	}	public String getConfirmuser() {		return confirmuser;	}	public void setConfirmuser(String confirmuser) {		this.confirmuser = confirmuser;	}	public String getRemark() {		return remark;	}	public void setRemark(String remark) {		this.remark = remark;	}	public String getTradeNo() {		return tradeNo;	}	public void setTradeNo(String tradeNo) {		this.tradeNo = tradeNo;	}}