package qna.model.vo;

import java.sql.Date;

public class Qna implements java.io.Serializable {
	private static final long serialVersionUID = 1113L;
	
	private int qnaNo; //글번호
	// Question
	private String userId; //작성자
	private String qnaType; //질문유형
	private String qqTitle; //글제목
	private String qqContent; //글내용
	private Date qqDate; //작성일
	private String qqOriginalImage; //기존 파일명
	private String qqRenameImage; //변경 파일명
	private String qqOpen; //공개여부
	private int qqPwd; //글 비밀번호
	private int qqReadCount; //조회수
	// Answer
	private int qaNo; //답변 번호
	private String adminId; //답변자
	private String qaTitle; //답변제목
	private String qaContent; //답변내욜
	private Date qaDate; //작성일
	private String qaOriginalImage; //기존 파일명
	private String qaRenameImage; //변경 파일명
	
	public Qna() {}
	
	//Question
	public Qna(int qnaNo, String userId, String qnaType, String qqTitle, String qqContent, Date qqDate,
			String qqOriginalImage, String qqRenameImage, String qqOpen, int qqPwd, int qqReadCount) {
		super();
		this.qnaNo = qnaNo;
		this.userId = userId;
		this.qnaType = qnaType;
		this.qqTitle = qqTitle;
		this.qqContent = qqContent;
		this.qqDate = qqDate;
		this.qqOriginalImage = qqOriginalImage;
		this.qqRenameImage = qqRenameImage;
		this.qqOpen = qqOpen;
		this.qqPwd = qqPwd;
		this.qqReadCount = qqReadCount;
	}

	//Answer
	public Qna(int qnaNo, int qaNo, String adminId, String qaTitle, String qaContent, Date qaDate,
			String qaOriginalImage, String qaRenameImage) {
		super();
		this.qnaNo = qnaNo;
		this.qaNo = qaNo;
		this.adminId = adminId;
		this.qaTitle = qaTitle;
		this.qaContent = qaContent;
		this.qaDate = qaDate;
		this.qaOriginalImage = qaOriginalImage;
		this.qaRenameImage = qaRenameImage;
	}

	public Qna(int qnaNo, String userId, String qnaType, String qqTitle, String qqContent, Date qqDate,
			String qqOriginalImage, String qqRenameImage, String qqOpen, int qqPwd, int qqReadCount, int qaNo,
			String adminId, String qaTitle, String qaContent, Date qaDate, String qaOriginalImage,
			String qaRenameImage) {
		super();
		this.qnaNo = qnaNo;
		this.userId = userId;
		this.qnaType = qnaType;
		this.qqTitle = qqTitle;
		this.qqContent = qqContent;
		this.qqDate = qqDate;
		this.qqOriginalImage = qqOriginalImage;
		this.qqRenameImage = qqRenameImage;
		this.qqOpen = qqOpen;
		this.qqPwd = qqPwd;
		this.qqReadCount = qqReadCount;
		this.qaNo = qaNo;
		this.adminId = adminId;
		this.qaTitle = qaTitle;
		this.qaContent = qaContent;
		this.qaDate = qaDate;
		this.qaOriginalImage = qaOriginalImage;
		this.qaRenameImage = qaRenameImage;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getQnaType() {
		return qnaType;
	}

	public void setQnaType(String qnaType) {
		this.qnaType = qnaType;
	}

	public String getQqTitle() {
		return qqTitle;
	}

	public void setQqTitle(String qqTitle) {
		this.qqTitle = qqTitle;
	}

	public String getQqContent() {
		return qqContent;
	}

	public void setQqContent(String qqContent) {
		this.qqContent = qqContent;
	}

	public Date getQqDate() {
		return qqDate;
	}

	public void setQqDate(Date qqDate) {
		this.qqDate = qqDate;
	}

	public String getQqOriginalImage() {
		return qqOriginalImage;
	}

	public void setQqOriginalImage(String qqOriginalImage) {
		this.qqOriginalImage = qqOriginalImage;
	}

	public String getQqRenameImage() {
		return qqRenameImage;
	}

	public void setQqRenameImage(String qqRenameImage) {
		this.qqRenameImage = qqRenameImage;
	}

	public String getQqOpen() {
		return qqOpen;
	}

	public void setQqOpen(String qqOpen) {
		this.qqOpen = qqOpen;
	}

	public int getQqPwd() {
		return qqPwd;
	}

	public void setQqPwd(int qqPwd) {
		this.qqPwd = qqPwd;
	}

	public int getQqReadCount() {
		return qqReadCount;
	}

	public void setQqReadCount(int qqReadCount) {
		this.qqReadCount = qqReadCount;
	}

	public int getQaNo() {
		return qaNo;
	}

	public void setQaNo(int qaNo) {
		this.qaNo = qaNo;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getQaTitle() {
		return qaTitle;
	}

	public void setQaTitle(String qaTitle) {
		this.qaTitle = qaTitle;
	}

	public String getQaContent() {
		return qaContent;
	}

	public void setQaContent(String qaContent) {
		this.qaContent = qaContent;
	}

	public Date getQaDate() {
		return qaDate;
	}

	public void setQaDate(Date qaDate) {
		this.qaDate = qaDate;
	}

	public String getQaOriginalImage() {
		return qaOriginalImage;
	}

	public void setQaOriginalImage(String qaOriginalImage) {
		this.qaOriginalImage = qaOriginalImage;
	}

	public String getQaRenameImage() {
		return qaRenameImage;
	}

	public void setQaRenameImage(String qaRenameImage) {
		this.qaRenameImage = qaRenameImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Qna [qnaNo=" + qnaNo + ", userId=" + userId + ", qnaType=" + qnaType + ", qqTitle=" + qqTitle
				+ ", qqContent=" + qqContent + ", qqDate=" + qqDate + ", qqOriginalImage=" + qqOriginalImage
				+ ", qqRenameImage=" + qqRenameImage + ", qqOpen=" + qqOpen + ", qqPwd=" + qqPwd + ", qqReadCount="
				+ qqReadCount + ", qaNo=" + qaNo + ", adminId=" + adminId + ", qaTitle=" + qaTitle + ", qaContent="
				+ qaContent + ", qaDate=" + qaDate + ", qaOriginalImage=" + qaOriginalImage + ", qaRenameImage="
				+ qaRenameImage + "]";
	}
	
	
}
