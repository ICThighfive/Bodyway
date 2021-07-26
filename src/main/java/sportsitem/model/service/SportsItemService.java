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
}
