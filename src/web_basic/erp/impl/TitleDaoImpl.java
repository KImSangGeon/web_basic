package web_basic.erp.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import web_basic.erp.dao.TitleDao;
import web_basic.erp.dto.Title;

public class TitleDaoImpl implements TitleDao {

	private static final TitleDaoImpl instance = new TitleDaoImpl();
	private Connection con;

	public static TitleDaoImpl getInstance() {
		return instance;
	}

	public TitleDaoImpl() {
	}


	public void setCon(Connection con) {
		this.con = con;
	}

	@Override
	public List<Title> selectTitleByAll() {
		String sql = "select no,name from title";
		try(	PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				List<Title> list = new ArrayList<>();
				do {
					list.add(getTitle(rs));
				}while(rs.next());
//				System.out.println(list.size());
				return list;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Title getTitle(ResultSet rs) throws SQLException {
		int tNo = rs.getInt("no");
		String tName = rs.getString("name");
		
		return new Title(tNo, tName);
	}

	@Override
	public Title selectTitleByNo(Title title) {
		String sql = "select no, Name from title where no = ?";
		try(	PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, title.getNo());
//			System.out.println(pstmt);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getTitle(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insertTitle(Title title) {
		String sql = "insert into title values(?, ?)";
		try(	PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, title.getNo());
			pstmt.setString(2, title.getName());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int updateTitle(Title title) {
		String sql = "update title set name = ? where no = ?";
		try(	PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, title.getName());
			pstmt.setInt(2, title.getNo());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int deleteTitle(int titleNo) {
		String sql = "delete from title where no = ?";
		try(	PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, titleNo);			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

}
