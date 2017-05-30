package hello.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Hello;
import util.DBUtil;

public class HelloDAO {
	private String changmok = "안녕";
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	private HelloDAO(){
		
	}
	
	private static HelloDAO instance = null;
	
	public synchronized static HelloDAO getInstance(){
		if(instance == null){
			instance = new HelloDAO();
		}
		return instance;
	}
	
	public int insert(Hello hello){
		int result = -1;
		String sql = "insert into hello values(0,?)";
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, hello.getGreeting());
			
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ArrayList<Hello> selectAll(){
		ArrayList<Hello> result = new ArrayList<Hello>();
		Hello hello = null;
		String sql = "select * from hello";
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				hello = new Hello();
				hello.setNum(rs.getInt("num"));
				hello.setGreeting(rs.getString("greeting"));
				result.add(hello);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(con, ps, rs);
		}
		return result;
	}
	
	
}///////////////////////////////////////////






















