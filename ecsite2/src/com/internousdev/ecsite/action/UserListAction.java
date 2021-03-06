package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport implements SessionAware {
	private List<UserListDTO> createUser = new ArrayList<UserListDTO>();
	private Map<String, Object> session;

	public String execute() {
		String ret = ERROR;
		UserListDAO dao = new UserListDAO();

		createUser = dao.select();

		if (createUser.size() > 0) {
			session.put("createUser", createUser);
			ret = SUCCESS;

		}
		return ret;

	}

	public List<UserListDTO> getCreateUser() {
		return createUser;
	}

	public void setCreateUser(List<UserListDTO> createUser) {
		this.createUser = createUser;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
