package community.model.vo;

import java.sql.Date;

public class Community implements java.io.Serializable{
	
	private static final long serialVersionUID = 11111L;
	
	//모임신청서 vo
	private String communityId;	 	//모임ID
	private String userId;			//신청자ID
	private Date applicationDate;	//신청일
	private String communityName;	//모임이름
	private String communityIntro;	//모임소개글
	private int capacityMin;		//모임최소인원
	private int capacityMax;		//모임최대인원
	private String interests;		//관심사
	private String cOriginalImage;	//기존대표이미지명
	private String cRenameImage;	//변경대표이미지명
	private String approvalYn;		//승인여부
	private String adminId;			//승인자ID(관리자ID)
	private int communityIndex;		//모임인덱스
	
	public Community() {}
	
	public Community(String communityId, String userId, Date applicationDate, String communityName,
			String communityIntro, int capacityMin, int capacityMax, String interests, String cOriginalImage,
			String cRenameImage, String approvalYn, String adminId, int communityIndex) {
		super();
		this.communityId = communityId;
		this.userId = userId;
		this.applicationDate = applicationDate;
		this.communityName = communityName;
		this.communityIntro = communityIntro;
		this.capacityMin = capacityMin;
		this.capacityMax = capacityMax;
		this.interests = interests;
		this.cOriginalImage = cOriginalImage;
		this.cRenameImage = cRenameImage;
		this.approvalYn = approvalYn;
		this.adminId = adminId;
		this.communityIndex = communityIndex;
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

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityIntro() {
		return communityIntro;
	}

	public void setCommunityIntro(String communityIntro) {
		this.communityIntro = communityIntro;
	}

	public int getCapacityMin() {
		return capacityMin;
	}

	public void setCapacityMin(int capacityMin) {
		this.capacityMin = capacityMin;
	}

	public int getCapacityMax() {
		return capacityMax;
	}

	public void setCapacityMax(int capacityMax) {
		this.capacityMax = capacityMax;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public String getcOriginalImage() {
		return cOriginalImage;
	}

	public void setcOriginalImage(String cOriginalImage) {
		this.cOriginalImage = cOriginalImage;
	}

	public String getcRenameImage() {
		return cRenameImage;
	}

	public void setcRenameImage(String cRenameImage) {
		this.cRenameImage = cRenameImage;
	}

	public String getApprovalYn() {
		return approvalYn;
	}

	public void setApprovalYn(String approvalYn) {
		this.approvalYn = approvalYn;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public int getCommunityIndex() {
		return communityIndex;
	}

	public void setCommunityIndex(int communityIndex) {
		this.communityIndex = communityIndex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Community [communityId=" + communityId + ", userId=" + userId + ", applicationDate=" + applicationDate
				+ ", communityName=" + communityName + ", communityIntro=" + communityIntro + ", capacityMin="
				+ capacityMin + ", capacityMax=" + capacityMax + ", interests=" + interests + ", cOriginalImage="
				+ cOriginalImage + ", cRenameImage=" + cRenameImage + ", approvalYn=" + approvalYn + ", adminId="
				+ adminId + ", communityIndex=" + communityIndex + "]";
	}
	

}
