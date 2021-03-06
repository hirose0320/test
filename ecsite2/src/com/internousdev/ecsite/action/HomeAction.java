package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private ArrayList<BuyItemDTO> bList = new ArrayList<BuyItemDTO>();
	private BuyItemDAO buyDAO = new BuyItemDAO();

	public String execute() throws SQLException {
		String result = "login";
		if (session.containsKey("bList")) {

			bList = buyDAO.getBuyItemInfo();

			session.put("bList", bList);

			result = SUCCESS;
		}
		return result;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return this.session;

	}

	public ArrayList<BuyItemDTO> getbList() {
		return bList;
	}

	public void setbList(ArrayList<BuyItemDTO> bList) {
		this.bList = bList;
	}

}
