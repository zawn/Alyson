package net.yozo.services.common;import net.yozo.core.dao.page.PagerModel;import java.io.Serializable;public class EmailNotifyProduct extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String account;	private String receiveEmail;	private String productID;	private String productName;	private String createdate;	private String notifydate;	private String status;	private int sendFailureCount;	/**	 * 是否已发送通知	 */	public static final String emailNotifyProduct_status_y = "y";// 已发送	public static final String emailNotifyProduct_status_n = "n";// 未发送	public void clear() {		super.clear();		id = null;		account = null;		receiveEmail = null;		productID = null;		productName = null;		createdate = null;		notifydate = null;		status = null;		sendFailureCount = 0;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getAccount() {		return account;	}	public void setAccount(String account) {		this.account = account;	}	public String getReceiveEmail() {		return receiveEmail;	}	public void setReceiveEmail(String receiveEmail) {		this.receiveEmail = receiveEmail;	}	public String getProductID() {		return productID;	}	public void setProductID(String productID) {		this.productID = productID;	}	public String getProductName() {		return productName;	}	public void setProductName(String productName) {		this.productName = productName;	}	public String getCreatedate() {		return createdate;	}	public void setCreatedate(String createdate) {		this.createdate = createdate;	}	public String getNotifydate() {		return notifydate;	}	public void setNotifydate(String notifydate) {		this.notifydate = notifydate;	}	public String getStatus() {		return status;	}	public void setStatus(String status) {		this.status = status;	}	public int getSendFailureCount() {		return sendFailureCount;	}	public void setSendFailureCount(int sendFailureCount) {		this.sendFailureCount = sendFailureCount;	}}