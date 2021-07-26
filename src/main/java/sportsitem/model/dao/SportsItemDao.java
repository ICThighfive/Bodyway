package sportsitem.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import sportsitem.model.vo.SportsItem;

public class SportsItemDao {

	public ArrayList<SportsItem> selectList(Connection conn) {
		ArrayList<SportsItem> list = new ArrayList<SportsItem>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from tb_sports_item order by si_board_no desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				SportsItem sportsitem = new SportsItem();
				
				sportsitem.setSiBoardNo(rset.getInt("si_board_no"));
				sportsitem.setProductId(rset.getString("product_id"));
				sportsitem.setSiSubCategory(rset.getString("si_sub_category"));
				sportsitem.setSiTitle(rset.getString("si_title"));
				sportsitem.setSiDetail(rset.getString("si_detail"));
				sportsitem.setSiUrl(rset.getString("si_url"));
				sportsitem.setSiOriginalImage(rset.getString("si_original_image"));
				sportsitem.setSiRenameImage(rset.getString("si_rename_image"));
				sportsitem.setSiUploadDate(rset.getDate("si_upload_date"));
				sportsitem.setSiModifyDate(rset.getDate("si_modify_date"));
				sportsitem.setSiHeart(rset.getString("si_heart"));
				
				list.add(sportsitem);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}

}
