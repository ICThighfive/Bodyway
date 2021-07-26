package community.model.vo;

import java.sql.Date;

public class CommunityInfo implements java.io.Serializable{
	
	private static final long serialVersionUID = 11112L;
	
	//모임활동정보 vo
	private int cInfoNo;			//글번호
	private String communityId;		//모임ID
	private Date cMeetingDate;		//모임날짜	
	private String cMeetingPlace;	//모임장소
	private String cMeetingFeeYn;	//모임회비여부
	private int cMeetingFee;		//모임회비
	private String memberList;		//참여자 명단
	private String cHeart;			//하트
	
	public CommunityInfo() {}

	public CommunityInfo(int cInfoNo, String communityId, Date cMeetingDate, String cMeetingPlace, String cMeetingFeeYn,
			int cMeetingFee, String memberList, String cHeart) {
		super();
		this.cInfoNo = cInfoNo;
		this.communityId = communityId;
		this.cMeetingDate = cMeetingDate;
		this.cMeetingPlace = cMeetingPlace;
		this.cMeetingFeeYn = cMeetingFeeYn;
		this.cMeetingFee = cMeetingFee;
		this.memberList = memberList;
		this.cHeart = cHeart;
	}

	public int getcInfoNo() {
		return cInfoNo;
	}

	public void setcInfoNo(int cInfoNo) {
		this.cInfoNo = cInfoNo;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Date getcMeetingDate() {
		return cMeetingDate;
	}

	public void setcMeetingDate(Date cMeetingDate) {
		this.cMeetingDate = cMeetingDate;
	}

	public String getcMeetingPlace() {
		return cMeetingPlace;
	}

	public void setcMeetingPlace(String cMeetingPlace) {
		this.cMeetingPlace = cMeetingPlace;
	}

	public String getcMeetingFeeYn() {
		return cMeetingFeeYn;
	}

	public void setcMeetingFeeYn(String cMeetingFeeYn) {
		this.cMeetingFeeYn = cMeetingFeeYn;
	}

	public int getcMeetingFee() {
		return cMeetingFee;
	}

	public void setcMeetingFee(int cMeetingFee) {
		this.cMeetingFee = cMeetingFee;
	}

	public String getMemberList() {
		return memberList;
	}

	public void setMemberList(String memberList) {
		this.memberList = memberList;
	}

	public String getcHeart() {
		return cHeart;
	}

	public void setcHeart(String cHeart) {
		this.cHeart = cHeart;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CommunityInfo [cInfoNo=" + cInfoNo + ", communityId=" + communityId + ", cMeetingDate=" + cMeetingDate
				+ ", cMeetingPlace=" + cMeetingPlace + ", cMeetingFeeYn=" + cMeetingFeeYn + ", cMeetingFee="
				+ cMeetingFee + ", memberList=" + memberList + ", cHeart=" + cHeart + "]";
	}
	
}
