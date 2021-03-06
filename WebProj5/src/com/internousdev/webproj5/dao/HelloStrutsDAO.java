package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj5.dto.ItemListDTO;
import com.internousdev.webproj5.util.DBConnector;

public class HelloStrutsDAO {

	List<ItemListDTO> helloStrutsDTOList=new ArrayList<ItemListDTO>();

	public List<ItemListDTO> select(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql ="Select * from users";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				ItemListDTO dto=new ItemListDTO();
				dto.setUserId(rs.getInt("user_id"));
				dto.setUserName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setResult("MySQLと接続できます。");
				helloStrutsDTOList.add(dto);
				//dtoに情報をsetし、listにも代入
			}
		}catch(SQLException e){
			e.printStackTrace();
		}try{con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}return helloStrutsDTOList;
}}
