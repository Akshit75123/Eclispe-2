package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public boolean check(String uname, String pass) {
		//using jdbc for fetching database
		String sql = "select * from login where uname = ? and pass = ?";
		String url = "jdbc:mysql://localhost:3306/new";
		String username = "root";
		String password = "akshit";
		
		try {
			/* load the class */
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection object
			Connection con = DriverManager.getConnection(url,username,password);
			//Prepared Statements
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
			if (rs.next())
				return true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
}
