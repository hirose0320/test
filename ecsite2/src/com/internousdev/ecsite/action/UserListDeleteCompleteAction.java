package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.UserListDeleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport {

	private UserListDeleteDAO DAO = new UserListDeleteDAO();
	private String message;

	public String execute() throws SQLException {
		String result = ERROR;

		int res = DAO.userDelete();

		if (res > 0) {

			setMessage("商品情報を正しく削除しました。");
		} else if (res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
		result = SUCCESS;
		return result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}