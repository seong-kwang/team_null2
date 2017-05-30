package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Member;
import util.DBUtil;

public class MemberDAO {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private MemberDAO() {

	}

	private static MemberDAO instance = null;

	public synchronized static MemberDAO getInstance() {
		if (instance == null) {
			instance = new MemberDAO();
		}
		return instance;
	}
	
	public Member selectMember(String id){
		Member member = new Member();
		String sql = "select * from member where m_id=?";
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			if(rs.next()){
				member.setM_num(rs.getInt("m_num"));
				member.setM_id(rs.getString("m_id"));
				member.setM_pass(rs.getString("m_pass"));
				member.setM_name(rs.getString("m_name"));
				member.setM_gender(rs.getInt("m_gender"));
				member.setM_zipcode(rs.getString("m_zipcode"));
				member.setM_addr(rs.getString("m_addr"));
				member.setM_phone(rs.getString("m_phone"));
				member.setM_email(rs.getString("m_email"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
	
	public String getHashPassword(String pass){
        String sql = "select password(?) as hashPw from dual";
        String hashPw=null;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pass);
            rs = ps.executeQuery();
            if(rs.next()){
                 hashPw = rs.getString("hashPw");
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
          DBUtil.close(con, ps, rs);
        }
        
        return hashPw; //pw를 해쉬로 변환해서 반환
   }


}///////////////////////////////////////////
