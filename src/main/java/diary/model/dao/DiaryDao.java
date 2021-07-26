package diary.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import diary.model.vo.Diary;
import static common.JDBCTemp.*;

public class DiaryDao {

	public ArrayList<Diary> selectList(Connection conn) {
		ArrayList<Diary> list = new ArrayList<Diary>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * " + "from (select diary_no, user_id, diary_title, "
				+ "        diary_content, diary_date, diary_modify_date, user_weight, "
				+ "        user_bmi, diary_open, diary_original_image, diary_rename_image "
				+ "    from (select * from tb_diary " + "    order by diary_no)) ";

		try {
			pstmt = conn.prepareStatement(query);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Diary diary = new Diary();

				diary.setDiaryNo(rset.getInt("diary_no"));
				diary.setUserId(rset.getString("user_id"));
				diary.setDiaryTitle(rset.getString("diary_title"));
				diary.setDiaryContent(rset.getString("diary_content"));
				diary.setDiaryDate(rset.getDate("diary_date"));
				diary.setDiaryModifyDate(rset.getDate("diary_modify_date"));
				diary.setUserWeight(rset.getDouble("user_weight"));
				diary.setUserBmi(rset.getDouble("user_bmi"));
				diary.setDiaryOpen(rset.getString("diary_open"));
				diary.setDiaryOriginalImage(rset.getString("diary_original_image"));
				diary.setDiaryRenameImage(rset.getString("diary_rename_image"));

				list.add(diary);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public Diary selectOne(Connection conn, int diaryNo) {
		Diary diary = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from tb_diary where diary_no = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, diaryNo);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				diary = new Diary();

				diary.setDiaryNo(rset.getInt("diary_no"));
				diary.setUserId(rset.getString("user_id"));
				diary.setDiaryTitle(rset.getString("diary_title"));
				diary.setDiaryContent(rset.getString("diary_content"));
				diary.setDiaryDate(rset.getDate("diary_date"));
				diary.setDiaryModifyDate(rset.getDate("diary_modify_date"));
				diary.setUserWeight(rset.getDouble("user_weight"));
				diary.setUserBmi(rset.getDouble("user_bmi"));
				diary.setDiaryOpen(rset.getString("diary_open"));
				diary.setDiaryOriginalImage(rset.getString("diary_original_image"));
				diary.setDiaryRenameImage(rset.getString("diary_rename_image"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return diary;
	}

	public int updateDiary(Connection conn, Diary diary) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update tb_diary set " + "diary_title = ?, "
				+ "diary_content = ?, diary_date = sysdate, " 
				+ "diary_original_image = ?, diary_rename_image = ? "
				+ "where diary_no = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, diary.getDiaryTitle());
			pstmt.setString(2, diary.getDiaryContent());
			pstmt.setString(3, diary.getDiaryOriginalImage());
			pstmt.setString(4, diary.getDiaryRenameImage());
			pstmt.setInt(5, diary.getDiaryNo());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int insertDiary(Connection conn, Diary diary) {
		int result = 0;
	      PreparedStatement pstmt = null;
	      
	      String query = "insert into tb_diary "
	      		+ "(diary_no, user_id, diary_title, diary_content)"
	      		+ "values "
	      		+ "(diary_no_seq.nextval, 'user01', ?, ?)";
	      // user_id 임시
	      try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, diary.getDiaryTitle());
			pstmt.setString(2, diary.getDiaryContent());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
	      
	      
	      return result;
	}

}
