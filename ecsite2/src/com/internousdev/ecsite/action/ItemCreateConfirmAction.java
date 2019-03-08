package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateConfirmAction extends ActionSupport implements SessionAware {

	private String iname;
	private String iprice;
	private String istock;
	public Map<String, Object> session;
	private String errorMessage;

	public String execute() {

		String result = SUCCESS;

		if (!(iname.equals("")) && !(iprice.equals("")) && !(istock.equals(""))) {
			session.put("iname", iname);
			session.put("iprice", iprice);
			session.put("istock", istock);
		} else {
			setErrorMessage("未記入の項目があります。");
			result = ERROR;
		}
		return result;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIprice() {
		return iprice;
	}

	public void setIprice(String iprice) {
		this.iprice = iprice;
	}

	public String getIstock() {
		return istock;
	}

	public void setIstock(String istock) {
		this.istock = istock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
