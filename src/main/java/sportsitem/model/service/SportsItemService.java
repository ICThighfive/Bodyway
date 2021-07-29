package sportsitem.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import sportsitem.model.dao.SportsItemDao;
import sportsitem.model.vo.SportsItem;

public class SportsItemService {
	private SportsItemDao sidao = new SportsItemDao();
	
	public ArrayList<SportsItem> selectList(){
		Connection conn = getConnection();
		ArrayList<SportsItem> list = sidao.selectList(conn);
		close(conn);
		return list;
	}
	
	public ArrayList<SportsItem> selectSubList(String siSubCategory) {
		Connection conn = getConnection();
		ArrayList<SportsItem> list = sidao.selectSubList(conn, siSubCategory);
		close(conn);
		return list;
	}
	
	public int getListCount() {
		Connection conn = getConnection();
		int listCount = sidao.getListCount(conn);
		close(conn);
		return listCount;
	}
	
	public ArrayList<SportsItem> selectList(int startRow, int endRow){
		Connection conn = getConnection();
		ArrayList<SportsItem> list = sidao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}
	
	public ArrayList<SportsItem> selectList(String siSubCategory, int startRow, int endRow){
		Connection conn = getConnection();
		ArrayList<SportsItem> list = sidao.selectList(conn, siSubCategory, startRow, endRow);
		close(conn);
		return list;
	}
	
	public SportsItem selectOne(int siBoardNo) {
		Connection conn = getConnection();
		SportsItem sportsitem = sidao.selectOne(conn, siBoardNo);
		close(conn);
		return sportsitem;
	}
	
	public int insertSportsItem(SportsItem sportsitem) {
		Connection conn = getConnection();
		int result = sidao.insertSportsItem(conn, sportsitem);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public int deleteSportsItem(int siBoardNo) {
		Connection conn = getConnection();
		int result = sidao.deleteSportsItem(conn, siBoardNo);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public int updateSportsItem(SportsItem sportsitem) {
		Connection conn = getConnection();
		int result = sidao.updateSportsItem(conn, sportsitem);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
}
