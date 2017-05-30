package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Board;
import util.DBUtil;

public class BoardDAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	private BoardDAO() {

	}

	private static BoardDAO instance = null;
	
	public synchronized static BoardDAO getInstance() {
		if (instance == null) {
			instance = new BoardDAO();
		}
		return instance;
	}

	public List<Board> selectAllBoard(int firstRow, int endRow) {
		String sql = "select * from board order by b_num desc limit ?,?";
		List<Board> result = new ArrayList<Board>();

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setInt(1, firstRow);
			ps.setInt(2, endRow);
			
			rs = ps.executeQuery();

			while (rs.next()) {

				Board board = new Board();
				board.setB_num(rs.getInt("b_num"));
				board.setB_id(rs.getString("b_id"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_readcount(rs.getInt("b_readcount"));
				board.setB_writedate(rs.getTimestamp("b_writedate"));
				result.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ps, rs);
		}
		return result;
	}

	public Board selectOneBoard(String num) {
		String sql = "select * from board where b_num = ?";
		Board board = null;
		try {
			con = DBUtil.getConnection();

			ps = con.prepareStatement(sql);

			ps.setString(1, num);

			rs = ps.executeQuery();

			if (rs.next()) {

				board = new Board();

				board.setB_num(rs.getInt("b_num"));
				board.setB_id(rs.getString("b_id"));
				board.setB_title(rs.getString("b_title"));
				board.setB_content(rs.getString("b_content"));
				board.setB_readcount(rs.getInt("b_readcount"));
				board.setB_writedate(rs.getTimestamp("b_writedate"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ps, rs);
		}
		return board;
	}

	public int insertBoard(Board board) {
		int result = -1;
		String sql = "insert into board values (0,?,?,?,0,now())";

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, board.getB_id());
			ps.setString(2, board.getB_title());
			ps.setString(3, board.getB_content());
			
			result = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ps);
		}
		return result;
	}

	public int updateBoard(Board board) {
		int result = -1;
		String sql = "update board set b_title=?, b_content=?, b_writedate=now()"
				+ " where b_num=?";

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, board.getB_title());
			ps.setString(2, board.getB_content());
			ps.setInt(3, board.getB_num());
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(con, ps);
		}
		return result;
	}

	public int deleteBoard(String num) {
		int result = -1;
		String sql = "delete from board where b_num=?";

		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, num);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con, ps);
		}
		return result;

	}

	public int selectCount(){

		String sql = "select count(*) from board";

		int result = 0;
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			if (rs.next()) {
				result = rs.getInt(1);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
		return result;
	}
	
	public void updateReadCount(String num){
		String sql = "update board set b_readcount=b_readcount+1 where b_num=?";
		
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(num));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(con, ps);
		}
		
	}

}////////////////////////////
