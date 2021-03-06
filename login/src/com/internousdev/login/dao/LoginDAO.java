package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {

	public LoginDTO select(String name,String password) throws SQLException{
		LoginDTO dto=new LoginDTO();
		DBConnector db=new DBConnector();
		//2　dbconnectorのインスタンス化
		Connection con=db.getConnection();
		//3　getConnectionの呼び出し dbと接続

		String sql="select * from user where user_name=? and password=?";
		//4　sql文をかく
		try{
			PreparedStatement ps = con.prepareStatement(sql);
		//5　PreparedStatement（DBまで運ぶやつ）に代入
			ps.setString(1, name);
			ps.setString(2, password);
		//6　?に入れる値をセット
			ResultSet rs=ps.executeQuery();
		//7　executeQuery()で実行

			if(rs.next()){
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		//8　結果の処理
		}catch(SQLException e){
			e.printStackTrace();
		//エラーの時に実行する処理
		}finally{
			con.close();
		//9　con.close()でDBの接続をきる
		}
		return dto;
	}
}
