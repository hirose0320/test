package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
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
	private ArrayList<BuyItemDTO> bList = new ArrayList<BuyItemDTO>();
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyDAO = new BuyItemDAO();
	private String adminFlg;

	public String execute() throws SQLException {
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
				bList = buyDAO.getBuyItemInfo();

				session.put("login_user_id", loginDTO.getLoginId());
				session.put("userName", loginDTO.getUserName());
				session.put("bList", bList);

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

	public ArrayList<BuyItemDTO> getbList() {
		return bList;
	}

	public void setbList(ArrayList<BuyItemDTO> bList) {
		this.bList = bList;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

}
