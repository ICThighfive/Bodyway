package community.model.vo;

import java.sql.Date;

public class CommunityMember implements java.io.Serializable{

	private static final long serialVersionUID = 11113L;
	
	//모임별 회원관리 vo
	private int cUserNo;			//모임내 회원 번호
	private String communityId;		//모임ID
	private String userId;			//회원ID
	private int cTotalMember;		//모임총인원
	private Date cJoinDate;			//모임가입일
	private String cDrop;			//탈퇴여부
	private Date cDropDate;			//모임탈퇴일
	
	public CommunityMember() {}

	public CommunityMember(int cUserNo, String communityId, String userId, int cTotalMember, Date cJoinDate,
			String cDrop, Date cDropDate) {
		super();
		this.cUserNo = cUserNo;
		this.communityId = communityId;
		this.userId = userId;
		this.cTotalMember = cTotalMember;
		this.cJoinDate = cJoinDate;
		this.cDrop = cDrop;
		this.cDropDate = cDropDate;
	}

	public int getcUserNo() {
		return cUserNo;
	}

	public void setcUserNo(int cUserNo) {
		this.cUserNo = cUserNo;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getcTotalMember() {
		return cTotalMember;
	}

	public void setcTotalMember(int cTotalMember) {
		this.cTotalMember = cTotalMember;
	}

	public Date getcJoinDate() {
		return cJoinDate;
	}

	public void setcJoinDate(Date cJoinDate) {
		this.cJoinDate = cJoinDate;
	}

	public String getcDrop() {
		return cDrop;
	}

	public void setcDrop(String cDrop) {
		this.cDrop = cDrop;
	}

	public Date getcDropDate() {
		return cDropDate;
	}

	public void setcDropDate(Date cDropDate) {
		this.cDropDate = cDropDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CommunityMember [cUserNo=" + cUserNo + ", communityId=" + communityId + ", userId=" + userId
				+ ", cTotalMember=" + cTotalMember + ", cJoinDate=" + cJoinDate + ", cDrop=" + cDrop + ", cDropDate="
				+ cDropDate + "]";
	}

}
