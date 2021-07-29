package user.model.vo;

import java.sql.Date;

public class User {
	private String user_id;//유저아이디
	private String user_pwd;//유저 비밀번호
	private int user_no;//유저번호
    private String name;//유저이름
	private String gender; //유저성별
    private String user_age; //유저나이
    private String user_phone; //전화번호
    private String user_email; //유저 이메일
    private String user_height; //유저 키
    private String user_interests;//유저 관심
    private String user_original_photo; //기존 사진
    private String user_rename_photo; //변경된 사진
    private java.sql.Date join_date;//가입 날짜
    private String user_drop_yn; // 유저탈퇴
	private java.sql.Date last_login_date; // 로그인날짜
    private int penalty_count; //페널티점수
    private java.sql.Date penalty_date; // 페널티부여날짜
    
    public User() {}//기본 생성자
    
    public User(String user_id, String user_pwd, int user_no, String name, String gender, String user_age,
			String user_phone, String user_email, String user_height, String user_interests, String user_original_photo,
			String user_rename_photo, Date join_date, String user_drop_yn, Date last_login_date, int penalty_count,
			Date penalty_date) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_no = user_no;
		this.name = name;
		this.gender = gender;
		this.user_age = user_age;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_height = user_height;
		this.user_interests = user_interests;
		this.user_original_photo = user_original_photo;
		this.user_rename_photo = user_rename_photo;
		this.join_date = join_date;
		this.user_drop_yn = user_drop_yn;
		this.last_login_date = last_login_date;
		this.penalty_count = penalty_count;
		this.penalty_date = penalty_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUser_age() {
		return user_age;
	}

	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_height() {
		return user_height;
	}

	public void setUser_height(String user_height) {
		this.user_height = user_height;
	}

	public String getUser_interests() {
		return user_interests;
	}

	public void setUser_interests(String user_interests) {
		this.user_interests = user_interests;
	}

	public String getUser_original_photo() {
		return user_original_photo;
	}

	public void setUser_original_photo(String user_original_photo) {
		this.user_original_photo = user_original_photo;
	}

	public String getUser_rename_photo() {
		return user_rename_photo;
	}

	public void setUser_rename_photo(String user_rename_photo) {
		this.user_rename_photo = user_rename_photo;
	}

	public java.sql.Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(java.sql.Date join_date) {
		this.join_date = join_date;
	}

	public String getUser_drop_yn() {
		return user_drop_yn;
	}

	public void setUser_drop_yn(String user_drop_yn) {
		this.user_drop_yn = user_drop_yn;
	}

	public java.sql.Date getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(java.sql.Date last_login_date) {
		this.last_login_date = last_login_date;
	}

	public int getPenalty_count() {
		return penalty_count;
	}

	public void setPenalty_count(int penalty_count) {
		this.penalty_count = penalty_count;
	}

	public java.sql.Date getPenalty_date() {
		return penalty_date;
	}

	public void setPenalty_date(java.sql.Date penalty_date) {
		this.penalty_date = penalty_date;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pwd=" + user_pwd + ", user_no=" + user_no + ", name=" + name
				+ ", gender=" + gender + ", user_age=" + user_age + ", user_phone=" + user_phone + ", user_email="
				+ user_email + ", user_height=" + user_height + ", user_interests=" + user_interests
				+ ", user_original_photo=" + user_original_photo + ", user_rename_photo=" + user_rename_photo
				+ ", join_date=" + join_date + ", user_drop_yn=" + user_drop_yn + ", last_login_date=" + last_login_date
				+ ", penalty_count=" + penalty_count + ", penalty_date=" + penalty_date + "]";
	}
    
	
}
