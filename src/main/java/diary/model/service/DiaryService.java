package diary.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import diary.model.dao.DiaryDao;
import diary.model.vo.Diary;
import static common.JDBCTemp.*;

public class DiaryService {

	private DiaryDao ddao = new DiaryDao();

	public ArrayList<Diary> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<Diary> list = ddao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public Diary selectOne(int diaryNo) {
		Connection conn = getConnection();
		Diary diary = ddao.selectOne(conn, diaryNo);

		close(conn);

		return diary;
	}

	public int updateDiary(Diary diary) {
		Connection conn = getConnection();
		int result = ddao.updateDiary(conn, diary);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public int insertDiary(Diary diary) {
		Connection conn = getConnection();
		int result = ddao.insertDiary(conn, diary);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public int deleteDiary(int diaryNo) {
		Connection conn = getConnection();
		int result = ddao.deleteDiary(conn, diaryNo);

		if (result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = ddao.getListCount(conn);
		close(conn);
		return listCount;
	}

}
