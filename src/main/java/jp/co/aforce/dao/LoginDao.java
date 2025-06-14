package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jp.co.aforce.beans.UsersBean;

public class LoginDao { 
	 
	public UsersBean selectByIdAndPassword(String member_Id, String password) {
		UsersBean user = null;
		String sql = "SELECT * FROM users WHERE member_id = ? AND password = ?";
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/ShoppingSite");
			Connection con = ds.getConnection();
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, member_Id);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {
				user = new UsersBean();
				user.setId(rs.getString("member_id"));
				user.setPassword(rs.getString("password"));
				user.setLastName(rs.getString("last_name"));
				user.setFirstName(rs.getString("first_name"));
				user.setAddress(rs.getString("address"));
				user.setMailAddress(rs.getString("mail_address"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
