package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	List<UserListDTO> userCreate = new ArrayList<UserListDTO>();

	public List<UserListDTO> select() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "Select * from item_info_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				UserListDTO dto = new UserListDTO();
				dto.setLoginId(rs.getString("loginUserId"));
				dto.setLoginPassword(rs.getString("loginPassword"));
				dto.setUserName(rs.getString("userName"));
				dto.setInsert_date(rs.getString("insert_date"));
				userCreate.add(dto);
				// dtoに情報をsetし、listにも代入
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userCreate;
	}
}