package sportsvideo.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import sportsvideo.model.dao.SportsVideoDao;
import sportsvideo.model.vo.SportsVideo;

public class SportsVideoService {
	private SportsVideoDao svdao = new SportsVideoDao();
	
	public ArrayList<SportsVideo> selectList(){
		Connection conn = getConnection();
		ArrayList<SportsVideo> list = svdao.selectList(conn);
		close(conn);
		return list;
	}
}
