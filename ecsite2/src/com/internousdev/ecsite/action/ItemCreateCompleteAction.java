package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware {

	private String iname;
	private String iprice;
	private String istock;
	public Map<String, Object> session;

	public String execute() throws SQLException {

		ItemCreateCompleteDAO iDAO = new ItemCreateCompleteDAO();
		iDAO.createItem(session.get("iname").toString(), session.get("iprice").toString(),
				session.get("istock").toString());

		String result = SUCCESS;
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
}
