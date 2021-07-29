package sportsitem.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import sportsitem.model.vo.SportsItem;

public class SportsItemDao {

	// 전체 리스트 조회
	public ArrayList<SportsItem> selectList(Connection conn) {
		ArrayList<SportsItem> list = new ArrayList<SportsItem>();
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select * from tb_sports_item order by si_board_no desc";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			while (rset.next()) {
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
		} finally {
			close(rset);
			close(stmt);
		}

		return list;
	}

	// 서브 카테고리로 리스트 조회
	public ArrayList<SportsItem> selectSubList(Connection conn, String siSubCategory) {
		ArrayList<SportsItem> list = new ArrayList<SportsItem>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from tb_sports_item where si_sub_category like ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, siSubCategory);
			rset = pstmt.executeQuery();

			while (rset.next()) {
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
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	// 전체 리스트 페이징
	public int getListCount(Connection conn) {
		int listCount = 0;

		Statement stmt = null;
		ResultSet rset = null;

		String query = "select count(*) from tb_sports_item";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				listCount = rset.getInt("count(*)");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}

		return listCount;
	}

	public ArrayList<SportsItem> selectList(Connection conn, int startRow, int endRow) {
		ArrayList<SportsItem> list = new ArrayList<SportsItem>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "SELECT * FROM (SELECT ROWNUM RNUM, PRODUCT_ID, SI_BOARD_NO, SI_DETAIL, SI_HEART, SI_MODIFY_DATE, SI_ORIGINAL_IMAGE, SI_RENAME_IMAGE, SI_SUB_CATEGORY, SI_TITLE, SI_UPLOAD_DATE, SI_URL "
				+ "FROM (SELECT * FROM TB_SPORTS_ITEM ORDER BY SI_BOARD_NO))" + " WHERE RNUM >= ? AND RNUM <= ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			while (rset.next()) {
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
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}
	
	// 소분류 항목 페이징 처리
	public ArrayList<SportsItem> selectList(Connection conn, String siSubCategory, int startRow, int endRow) {
		ArrayList<SportsItem> list = new ArrayList<SportsItem>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "SELECT * FROM (SELECT ROWNUM RNUM, PRODUCT_ID, SI_BOARD_NO, SI_DETAIL, SI_HEART, SI_MODIFY_DATE, SI_ORIGINAL_IMAGE, SI_RENAME_IMAGE, SI_SUB_CATEGORY, SI_TITLE, SI_UPLOAD_DATE, SI_URL "
				+ "FROM (SELECT * FROM TB_SPORTS_ITEM ORDER BY SI_BOARD_NO))" + " WHERE RNUM >= ? AND RNUM <= ? AND SI_SUB_CATEGORY LIKE ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, siSubCategory);

			rset = pstmt.executeQuery();

			while (rset.next()) {
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
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	// 이미지로 상세보기 페이지 처리
	public SportsItem selectOne(Connection conn, int siBoardNo) {
		SportsItem sportsitem = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from tb_sports_item where si_board_no = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, siBoardNo);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				sportsitem = new SportsItem();

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

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return sportsitem;
	}
	
	// 관리자용 새 글 등록
	public int insertSportsItem(Connection conn, SportsItem sportsitem) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "insert into tb_sports_item (si_board_no, product_id, si_sub_category, si_title, si_detail, si_url, si_original_image, si_upload_date, si_heart, si_rename_image) "
				+ "values (SIB_NO_SEQ.NEXTVAL, 'SI', ?, ?, ?, ?, ?, DEFAULT, DEFAULT, NULL)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sportsitem.getSiSubCategory());
			pstmt.setString(2, sportsitem.getSiTitle());
			pstmt.setString(3, sportsitem.getSiDetail());
			pstmt.setString(4, sportsitem.getSiUrl());
			pstmt.setString(5, sportsitem.getSiOriginalImage());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	// 관리자용 글 삭제
	public int deleteSportsItem(Connection conn, int siBoardNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from tb_sports_item where si_board_no = ?";
				
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, siBoardNo);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	// 관리자용 글 수정
	public int updateSportsItem(Connection conn, SportsItem sportsitem) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update tb_sports_item set si_title = ?, si_detail = ?, si_modify_date = sysdate, "
				+ "si_rename_image = ?, si_sub_category = ?, si_url = ? WHERE SI_BOARD_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sportsitem.getSiTitle());
			pstmt.setString(2, sportsitem.getSiDetail());
			pstmt.setString(3, sportsitem.getSiRenameImage());
			pstmt.setString(4, sportsitem.getSiSubCategory());
			pstmt.setString(5, sportsitem.getSiUrl());
			pstmt.setInt(6, sportsitem.getSiBoardNo());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
}
