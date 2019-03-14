package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	public Map<String, Object> session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyDAO = new BuyItemDAO();
	private String adminFlg;

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		if (((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			if (((LoginDTO) session.get("loginUser")).getAdminFlg() != null) {
				result = "admin";

				session.put("admin", loginDTO.getAdminFlg());
				System.out.println(((LoginDTO) session.get("loginUser")).getAdminFlg());
			} else {
				result = SUCCESS;
				BuyItemDTO bDTO = buyDAO.getBuyItemInfo();

				session.put("login_user_id", loginDTO.getLoginId());
				session.put("userName", loginDTO.getUserName());
				session.put("id", bDTO.getId());
				session.put("buyItem_name", bDTO.getItemName());
				session.put("buyItem_price", bDTO.getItemPrice());
			}
		}
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(String adminFlg) {
		this.adminFlg = adminFlg;
	}

}
