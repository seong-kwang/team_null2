package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	private static String URL = "jdbc:mysql://localhost:3306/rent";
	private static String USERNAME = "root";
	private static String PASSWORD = "abcd1234";
	
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
	
	public static void close(Connection con, Statement ps, ResultSet rs){
		try{
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void close(Connection con, Statement ps){
		try{
			ps.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection connection){
		if(connection !=null){
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}	
}
