package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UsersDao {

	public boolean userCheck(String id, String password) {

		String sql = "SELECT * FROM users WHERE member_id = ? AND password = ?";

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/ShoppingSite");
			Connection con = ds.getConnection();

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			return rs.next();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean userAdd(String id, String password, String lastName, String firstName, String address, String email){
		String sql = "INSERT INTO users (member_id, password, last_name, first_name, address, mail_address) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/ShoppingSite");
			Connection con = ds.getConnection();

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, password);
			st.setString(3, lastName);
			st.setString(4, firstName);
			st.setString(5, address);
			st.setString(6, email);
			return st.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean updateUser(String lastName, String firstName, String email, String id, String password) {
	    String sql = "UPDATE users SET last_name = ?, first_name = ?, mail_address = ? WHERE member_id = ? AND password = ?";
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/ShoppingSite");
			Connection con = ds.getConnection();

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, lastName);
			st.setString(2, firstName);
			st.setString(3, email);
			st.setString(4, id);
			st.setString(5, password);
			return st.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteUser(String id) {
		String sql = "delete from users where member_id = ?";
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/ShoppingSite");
			Connection con = ds.getConnection();

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, id);
			return st.executeUpdate() > 0;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
