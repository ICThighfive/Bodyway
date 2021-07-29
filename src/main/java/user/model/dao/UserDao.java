package user.model.dao;

// close, commit, rollback �뿭�븷�쓣 �빐二쇰뒗 common JDBCTemplate
import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import user.model.vo.User;

public class UserDao {
	
	
	//로그인하는 부분
	public User selectLogin(Connection conn, String user_id, String user_pwd) {
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from tb_user where user_id = ? and user_pwd = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pwd);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				user = new User();

				
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("user_no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("user_email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return user;
	}

	public int insertUser(Connection conn, User user) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "insert into user values " + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,? "
				+ "sysdate, sysdate, sysdate, default, default)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getUser_id());
			pstmt.setString(2, user.getUser_pwd());
			pstmt.setInt(3, user.getUser_no());
			pstmt.setString(4, user.getName());
			pstmt.setString(5, user.getGender());
			pstmt.setString(6, user.getUser_age());
			pstmt.setString(7, user.getUser_phone());
			pstmt.setString(8, user.getUser_email());
			pstmt.setString(9, user.getUser_height());
			pstmt.setString(10, user.getUser_interests());
			pstmt.setString(11, user.getUser_original_photo());
			pstmt.setString(12, user.getUser_rename_photo());
			pstmt.setString(13, user.getUser_drop_yn());
			pstmt.setInt(14, user.getPenalty_count());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public int deleteUser(Connection conn, String userid) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "delete from member where userid = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;

	}

	public User selectUser(Connection conn, String userid) {
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member " + "where userid = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				user = new User();

				// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("Penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return user;
	}

	public ArrayList<User> selectList(Connection conn) {
		ArrayList<User> list = new ArrayList<User>();
		Statement stmt = null;
		ResultSet rset = null;

		String query = "select * from tb_user";

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			while (rset.next()) {
				User user = new User();

				// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("Penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));

				list.add(user);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}

	public int updateLoginOK(Connection conn, String userid, String loginok) {
		int result = 0;
		PreparedStatement pstmt = null;

		String query = "update user set login_ok = ? " + "where userid = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, loginok);
			pstmt.setString(2, userid);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public ArrayList<User> selectSearchUserId(
			Connection conn, String keyword) {
		ArrayList<User> list = new ArrayList<User>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from  "
				+ "where userid like ?"; // '%'||?||'%' : 占쎈퓠占쎌쑎
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + keyword + "%");
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				User user = new User();
				
		// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
	    user.setUser_id("user_id");
		user.setUser_pwd("user_pwd");
		user.setUser_no(rset.getInt("no"));
		user.setName(rset.getString("user_name"));
		user.setGender(rset.getString("gender"));
		user.setUser_age(rset.getString("user_age"));
		user.setUser_phone(rset.getString("user_phone"));
		user.setUser_email(rset.getString("email"));
		user.setUser_height(rset.getString("user_height"));
		user.setUser_interests(rset.getString("user_interests"));
		user.setUser_original_photo(rset.getString("user_original_photo"));
		user.setUser_rename_photo(rset.getString("user_rename_photo"));
		user.setJoin_date(rset.getDate("Join_date"));
		user.setUser_drop_yn(rset.getString("user_drop_yn"));
		user.setLast_login_date(rset.getDate("Last_login_date"));
		user.setPenalty_count(rset.getInt("Penalty_count"));
		user.setPenalty_date(rset.getDate("penalty_date"));
			}
		
	    }catch(

	Exception e)
	{
		e.printStackTrace();
	    }finally
	{
		close(rset);
		close(pstmt);
	}

	return list;
	}

	public ArrayList<User> selectSearchGender(Connection conn, String keyword) {
	ArrayList<User> list = new ArrayList<User>();
	PreparedStatement pstmt = null;
	ResultSet rset = null;
	
	String query = "select * from user "
			+ "where gender = ?"; 
	
	try {
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, keyword);
		
		rset = pstmt.executeQuery();
		
		while(rset.next()) {
			User user = new User();

		
	
	
	// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
	user.setUser_id("user_id");
	user.setUser_pwd("user_pwd");
	user.setUser_no(rset.getInt("no"));
	user.setName(rset.getString("user_name"));
	user.setGender(rset.getString("gender"));
	user.setUser_age(rset.getString("user_age"));
	user.setUser_phone(rset.getString("user_phone"));
	user.setUser_email(rset.getString("email"));
	user.setUser_height(rset.getString("user_height"));
	user.setUser_interests(rset.getString("user_interests"));
	user.setUser_original_photo(rset.getString("user_original_photo"));
	user.setUser_rename_photo(rset.getString("user_rename_photo"));
	user.setJoin_date(rset.getDate("Join_date"));
	user.setUser_drop_yn(rset.getString("user_drop_yn"));
	user.setLast_login_date(rset.getDate("Last_login_date"));
	user.setPenalty_count(rset.getInt("Penalty_count"));
	user.setPenalty_date(rset.getDate("penalty_date"));
	
	  list.add(user);
	   }
     } catch (Exception e) {
	    e.printStackTrace();
     }finally {
	  close(rset);
	  close(pstmt);
      }
     
     return list;
     }

	public ArrayList<User> selectSearchAge(Connection conn, int keyword) {
		ArrayList<User> list = new ArrayList<User>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member ";

		if (keyword == 60) {
			query += "where age >= ?";
		} else {
			query += "where age between ? and ?";
		}

		try {
			pstmt = conn.prepareStatement(query);
			if (keyword == 60) {
				pstmt.setInt(1, keyword);
			} else {
				pstmt.setInt(1, keyword);
				pstmt.setInt(2, keyword + 9);
			}

			rset = pstmt.executeQuery();

			while (rset.next()) {
				User user = new User();

				// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("Penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));

				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public ArrayList<User> selectSearchEnrollDate(Connection conn, Date begin, Date end) {
		ArrayList<User> list = new ArrayList<User>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member " + "where enroll_date between ? and ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setDate(1, begin);
			pstmt.setDate(2, end);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				User user = new User();

				// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("Penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));

				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public ArrayList<User> selectSearchLoginOK(Connection conn, String keyword) {
		ArrayList<User> list = new ArrayList<User>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from member " + "where login_ok = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, keyword);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				User user = new User();

				// 而щ읆媛� 爰쇰궡�꽌, �븘�뱶�뿉 �삷寃� 湲곕줉�븯湲� : 寃곌낵留ㅽ븨
				user.setUser_id("user_id");
				user.setUser_pwd("user_pwd");
				user.setUser_no(rset.getInt("no"));
				user.setName(rset.getString("user_name"));
				user.setGender(rset.getString("gender"));
				user.setUser_age(rset.getString("user_age"));
				user.setUser_phone(rset.getString("user_phone"));
				user.setUser_email(rset.getString("email"));
				user.setUser_height(rset.getString("user_height"));
				user.setUser_interests(rset.getString("user_interests"));
				user.setUser_original_photo(rset.getString("user_original_photo"));
				user.setUser_rename_photo(rset.getString("user_rename_photo"));
				user.setJoin_date(rset.getDate("Join_date"));
				user.setUser_drop_yn(rset.getString("user_drop_yn"));
				user.setLast_login_date(rset.getDate("Last_login_date"));
				user.setPenalty_count(rset.getInt("Penalty_count"));
				user.setPenalty_date(rset.getDate("penalty_date"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return list;
	}

	public int selectCheckId(Connection conn, String userid) {
		int idCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select count(userid) from user " + "where user_id = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userid);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				idCount = rset.getInt(1);
				System.out.println("idCount : " + idCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return idCount;
	}

	public int updateUser(Connection conn, User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

	
