package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	// 基本的にActionSupportを継承する

	private String name;
	private String password;
	// JSPの定義と同じにする

	public String execute() throws SQLException {
		String ret = ERROR;
		// 2 excecute()メソッドを定義
		// 初期値としてERRORを代入しておく

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(name, password);
		if (name.equals(dto.getName())) {
			if (password.equals(dto.getPassword())) {
				ret = SUCCESS;
				// 3 条件分岐でSUCCESSかERRORか決める
				// 条件と一致するかどうか
			}
		}
		return ret;
	}
	// 4 execute()メソッドの結果、SUCCESSかERRORを返す

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	// 1 setterを定義することで、
	// JSPでユーザーが決めた値がフィールドに格納される
	// Getterは使わないが、後の不具合のために両方書く
}
