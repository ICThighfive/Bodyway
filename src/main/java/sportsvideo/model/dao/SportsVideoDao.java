package sportsvideo.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import sportsvideo.model.vo.SportsVideo;

public class SportsVideoDao {

	public ArrayList<SportsVideo> selectList(Connection conn) {
		ArrayList<SportsVideo> list = new ArrayList<SportsVideo>();
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select * from tb_sports_video order by sv_board_no desc";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			while(rset.next()) {
				SportsVideo sportsvideo = new SportsVideo();//½ºÆ÷Ã÷ºñµð¿À °´Ã¼ Ãß°¡
				
				sportsvideo.setSvBoardNo(rset.getInt("sv_board_no"));
				sportsvideo.setProductId(rset.getString("product_id"));
				sportsvideo.setSvTitle(rset.getString("sv_title"));
				sportsvideo.setSvUrl(rset.getString("sv_url"));
				sportsvideo.setSvOriginalImage(rset.getString("sv_original_image"));
				sportsvideo.setSvRenameImage(rset.getString("sv_rename_image"));
				sportsvideo.setSvUploadDate(rset.getDate("sv_upload_date"));
				sportsvideo.setSvModifyDate(rset.getDate("sv_modify_date"));
				sportsvideo.setSvSubCategory(rset.getString("sv_sub_category"));
				sportsvideo.setSvHeart(rset.getString("sv_heart"));
				
				list.add(sportsvideo);
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
