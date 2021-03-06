package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ItemListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	List<ItemListDTO> itemList = new ArrayList<>();

	public List<ItemListDTO> select() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "Select * from item_info_transaction";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemListDTO dto = new ItemListDTO();
				dto.setIname(rs.getString("item_name"));
				dto.setIprice(rs.getString("item_price"));
				dto.setIstock(rs.getString("item_stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				itemList.add(dto);
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
		return itemList;
	}
}
