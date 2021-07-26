package notice.model.vo;

import java.sql.Date;

public class Notice implements java.io.Serializable {
	private static final long serialVersionUID = 1112L;
	
	private int noticeNo; //글번호
	private String noticeTitle; //글제목
	private String noticeContent; //글내용
	private String noticeOriginalImage; //기존 파일명
	private String noticeRenameImage; //변경 파일명
	private Date noticeDate; //작성일
	private Date noticeModifyDate; //수정일
	private int noticeReadCount; //조회수
	private String adminId; //관리자 ID
	
	public Notice() {}

	public Notice(int noticeNo, String noticeTitle, String noticeContent, String noticeOriginalImage,
			String noticeRenameImage, Date noticeDate, Date noticeModifyDate, int noticeReadCount, String adminId) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeOriginalImage = noticeOriginalImage;
		this.noticeRenameImage = noticeRenameImage;
		this.noticeDate = noticeDate;
		this.noticeModifyDate = noticeModifyDate;
		this.noticeReadCount = noticeReadCount;
		this.adminId = adminId;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeOriginalImage() {
		return noticeOriginalImage;
	}

	public void setNoticeOriginalImage(String noticeOriginalImage) {
		this.noticeOriginalImage = noticeOriginalImage;
	}

	public String getNoticeRenameImage() {
		return noticeRenameImage;
	}

	public void setNoticeRenameImage(String noticeRenameImage) {
		this.noticeRenameImage = noticeRenameImage;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Date getNoticeModifyDate() {
		return noticeModifyDate;
	}

	public void setNoticeModifyDate(Date noticeModifyDate) {
		this.noticeModifyDate = noticeModifyDate;
	}

	public int getNoticeReadCount() {
		return noticeReadCount;
	}

	public void setNoticeReadCount(int noticeReadCount) {
		this.noticeReadCount = noticeReadCount;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
				+ ", noticeOriginalImage=" + noticeOriginalImage + ", noticeRenameImage=" + noticeRenameImage
				+ ", noticeDate=" + noticeDate + ", noticeModifyDate=" + noticeModifyDate + ", noticeReadCount="
				+ noticeReadCount + ", adminId=" + adminId + "]";
	}
	
	
}
