package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public ArrayList<BuyItemDTO> getBuyItemInfo() throws SQLException {

		ArrayList<BuyItemDTO> dto = new ArrayList<BuyItemDTO>();
		String sql = "SELECT * FROM item_info_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BuyItemDTO dto2 = new BuyItemDTO();

				dto2.setId(rs.getInt("id"));
				dto2.setItemName(rs.getString("item_name"));
				dto2.setItemPrice(rs.getString("item_price"));
				dto2.setItemStock(rs.getString("item_stock"));
				dto.add(dto2);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}

}
