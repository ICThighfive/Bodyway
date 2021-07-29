package user.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.commit;
import static common.JDBCTemp.getConnection;
import static common.JDBCTemp.rollback;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;

import user.model.dao.UserDao;
import user.model.vo.User;



public class UserService {
	private UserDao udao = new UserDao();	
	
	//로그인 하는 부분
	public User selectLogin(String user_id, String user_pwd) {
		Connection conn = getConnection();
		User user = udao.selectLogin(conn, user_id, user_pwd);
		close(conn);
		return user;
	}
	
	public int insertUser(User user) {
		Connection conn = getConnection();
		int result = udao.insertUser(conn, user);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateUser(User user) {
		Connection conn = getConnection();
		int result = udao.updateUser(conn, user);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int deleteUser(String userid) {
		Connection conn = getConnection();
		int result = udao.deleteUser(conn, userid);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public User selectMember(String userid) {
		Connection conn = getConnection();
		User user = udao.selectUser(conn, userid);
		close(conn);
		return user;
	}
	
	public ArrayList<User> selectList() {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectList(conn);
		close(conn);
		return list;
	}

	public int updateLoginOK(String userid, String loginok) {
		Connection conn = getConnection();
		int result = udao.updateLoginOK(conn, userid, loginok);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public ArrayList<User> selectSearchUserId(String keyword) {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectSearchUserId(conn, keyword);
		close(conn);
		return list;
	}

	public ArrayList<User> selectSearchGender(String keyword) {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectSearchGender(conn, keyword);
		close(conn);
		return list;
	}

	public ArrayList<User> selectSearchAge(int keyword) {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectSearchAge(conn, keyword);
		close(conn);
		return list;
	}

	public ArrayList<User> selectSearchEnrollDate(Date begin, Date end) {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectSearchEnrollDate(conn, begin, end);
		close(conn);
		return list;
	}

	public ArrayList<User> selectSearchLoginOK(String keyword) {
		Connection conn = getConnection();
		ArrayList<User> list = udao.selectSearchLoginOK(conn, keyword);
		close(conn);
		return list;
	}
	
	public int selectCheckId(String userid) {
		Connection conn = getConnection();
		int count = udao.selectCheckId(conn, userid);
		close(conn);
		return count;
	}
}






