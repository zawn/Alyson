package net.yozo.services.front.favorite.bean;import net.yozo.services.front.template.bean.Template;import java.io.Serializable;public class Favorite extends net.yozo.services.common.Favorite implements Serializable {	private static final long serialVersionUID = 1L;	private Template template;	public void clear() {		super.clear();		if(template!=null){			template.clear();		}	}	public Template getTemplate() {		return template;	}	public void setTemplate(Template template) {		this.template = template;	}}