package net.yozo.services.common;import net.yozo.core.dao.page.PagerModel;import java.io.Serializable;public class SystemSetting extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	/**	 * 基础设置	 */	private String id;	private String systemCode;	private String name;	private String www;	private String manageHttp;	private String log;	private String title;	private String description;	private String keywords;	private String shortcuticon;	private String address;	private String tel;	private String email;	private String emailFormat;	private String forgetPasswordEmail;	private String changeEmail;	private String activeAccountEmail;	private String qqHelpHtml;	private String icp;	private String isopen;	private String closeMsg;	private String qq;	private String statisticsCode;	private String version;		/**	 * 显示设置	 */	private String openResponsive;	private String imageRootPath;	private String defaultProductImg;	private String images;//图集	private String manageLeftTreeLeafIcon;	private String webStorePath;		/**	 * 门户样式设置	 */	private String style;		public void clear() {		super.clear();		id = null;		systemCode = null;		name = null;		www = null;		manageHttp = null;		log = null;		title = null;		description = null;		keywords = null;		shortcuticon = null;		address = null;		tel = null;		email = null;		emailFormat = null;		forgetPasswordEmail = null;		changeEmail = null;		activeAccountEmail = null;		qqHelpHtml = null;		icp = null;		isopen = null;		closeMsg = null;		qq = null;		statisticsCode = null;		version = null;		openResponsive = null;		imageRootPath = null;		defaultProductImg = null;		manageLeftTreeLeafIcon = null;		style = null;		images = null;		webStorePath=null;	}	public String getImageRootPath() {		return imageRootPath;	}	public void setImageRootPath(String imageRootPath) {		this.imageRootPath = imageRootPath;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getWww() {		return www;	}	public void setWww(String www) {		this.www = www;	}	public String getLog() {		return log;	}	public void setLog(String log) {		this.log = log;	}	public String getTitle() {		return title;	}	public void setTitle(String title) {		this.title = title;	}	public String getDescription() {		return description;	}	public void setDescription(String description) {		this.description = description;	}	public String getKeywords() {		return keywords;	}	public void setKeywords(String keywords) {		this.keywords = keywords;	}	public String getShortcuticon() {		return shortcuticon;	}	public void setShortcuticon(String shortcuticon) {		this.shortcuticon = shortcuticon;	}	public String getAddress() {		return address;	}	public void setAddress(String address) {		this.address = address;	}	public String getTel() {		return tel;	}	public void setTel(String tel) {		this.tel = tel;	}	public String getEmail() {		return email;	}	public void setEmail(String email) {		this.email = email;	}	public String getIcp() {		return icp;	}	public void setIcp(String icp) {		this.icp = icp;	}	public String getIsopen() {		return isopen;	}	public void setIsopen(String isopen) {		this.isopen = isopen;	}	public String getCloseMsg() {		return closeMsg;	}	public void setCloseMsg(String closeMsg) {		this.closeMsg = closeMsg;	}	public String getQq() {		return qq;	}	public void setQq(String qq) {		this.qq = qq;	}	/**	 * 合并为一个项目后，前后台基地址一样。	 * @return	 */	public String getManageHttp() {//		return manageHttp;		return this.www;	}	public void setManageHttp(String manageHttp) {		this.manageHttp = manageHttp;	}	public String getDefaultProductImg() {		return defaultProductImg;	}	public void setDefaultProductImg(String defaultProductImg) {		this.defaultProductImg = defaultProductImg;	}	public String getStyle() {		return style;	}	public void setStyle(String style) {		this.style = style;	}	public String getEmailFormat() {		return emailFormat;	}	public void setEmailFormat(String emailFormat) {		this.emailFormat = emailFormat;	}	public String getQqHelpHtml() {		return qqHelpHtml;	}	public void setQqHelpHtml(String qqHelpHtml) {		this.qqHelpHtml = qqHelpHtml;	}	public String getImages() {		return images;	}	public void setImages(String images) {		this.images = images;	}	public String getForgetPasswordEmail() {		return forgetPasswordEmail;	}	public void setForgetPasswordEmail(String forgetPasswordEmail) {		this.forgetPasswordEmail = forgetPasswordEmail;	}	public String getChangeEmail() {		return changeEmail;	}	public void setChangeEmail(String changeEmail) {		this.changeEmail = changeEmail;	}	public String getActiveAccountEmail() {		return activeAccountEmail;	}	public void setActiveAccountEmail(String activeAccountEmail) {		this.activeAccountEmail = activeAccountEmail;	}	public String getManageLeftTreeLeafIcon() {		return manageLeftTreeLeafIcon;	}	public void setManageLeftTreeLeafIcon(String manageLeftTreeLeafIcon) {		this.manageLeftTreeLeafIcon = manageLeftTreeLeafIcon;	}	public String getStatisticsCode() {		return statisticsCode;	}	public void setStatisticsCode(String statisticsCode) {		this.statisticsCode = statisticsCode;	}	public String getVersion() {		return version;	}	public void setVersion(String version) {		this.version = version;	}	public String getSystemCode() {		return systemCode;	}	public void setSystemCode(String systemCode) {		this.systemCode = systemCode;	}	public String getOpenResponsive() {		return openResponsive;	}	public void setOpenResponsive(String openResponsive) {		this.openResponsive = openResponsive;	}	public String getWebStorePath() {		return webStorePath;	}	public void setWebStorePath(String webStorePath) {		this.webStorePath = webStorePath;	}}