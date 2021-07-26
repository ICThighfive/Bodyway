package diary.model.vo;

import java.sql.Date;

public class Diary implements java.io.Serializable {
	private static final long serialVersionUID = 1111L;
	
	private int diaryNo; //글번호
	private String userId; //작성자
	private String diaryTitle; //글제목
	private String diaryContent; //글내용
	private Date diaryDate; //작성일
	private Date diaryModifyDate; //수정일
	private double userWeight; //몸무게
	private double userBmi; //BMI
	private String diaryOpen; //공개여부
	private String diaryOriginalImage; //기존 파일명
	private String diaryRenameImage; //변경 파일명
	
	public Diary() {}

	public Diary(int diaryNo, String userId, String diaryTitle, String diaryContent, Date diaryDate,
			Date diaryModifyDate, double userWeight, double userBmi, String diaryOpen, String diaryOriginalImage,
			String diaryRenameImage) {
		super();
		this.diaryNo = diaryNo;
		this.userId = userId;
		this.diaryTitle = diaryTitle;
		this.diaryContent = diaryContent;
		this.diaryDate = diaryDate;
		this.diaryModifyDate = diaryModifyDate;
		this.userWeight = userWeight;
		this.userBmi = userBmi;
		this.diaryOpen = diaryOpen;
		this.diaryOriginalImage = diaryOriginalImage;
		this.diaryRenameImage = diaryRenameImage;
	}

	public int getDiaryNo() {
		return diaryNo;
	}

	public void setDiaryNo(int diaryNo) {
		this.diaryNo = diaryNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDiaryTitle() {
		return diaryTitle;
	}

	public void setDiaryTitle(String diaryTitle) {
		this.diaryTitle = diaryTitle;
	}

	public String getDiaryContent() {
		return diaryContent;
	}

	public void setDiaryContent(String diaryContent) {
		this.diaryContent = diaryContent;
	}

	public Date getDiaryDate() {
		return diaryDate;
	}

	public void setDiaryDate(Date diaryDate) {
		this.diaryDate = diaryDate;
	}

	public Date getDiaryModifyDate() {
		return diaryModifyDate;
	}

	public void setDiaryModifyDate(Date diaryModifyDate) {
		this.diaryModifyDate = diaryModifyDate;
	}

	public double getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(double userWeight) {
		this.userWeight = userWeight;
	}

	public double getUserBmi() {
		return userBmi;
	}

	public void setUserBmi(double userBmi) {
		this.userBmi = userBmi;
	}

	public String getDiaryOpen() {
		return diaryOpen;
	}

	public void setDiaryOpen(String diaryOpen) {
		this.diaryOpen = diaryOpen;
	}

	public String getDiaryOriginalImage() {
		return diaryOriginalImage;
	}

	public void setDiaryOriginalImage(String diaryOriginalImage) {
		this.diaryOriginalImage = diaryOriginalImage;
	}

	public String getDiaryRenameImage() {
		return diaryRenameImage;
	}

	public void setDiaryRenameImage(String diaryRenameImage) {
		this.diaryRenameImage = diaryRenameImage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Diary [diaryNo=" + diaryNo + ", userId=" + userId + ", diaryTitle=" + diaryTitle + ", diaryContent="
				+ diaryContent + ", diaryDate=" + diaryDate + ", diaryModifyDate=" + diaryModifyDate + ", userWeight="
				+ userWeight + ", userBmi=" + userBmi + ", diaryOpen=" + diaryOpen + ", diaryOriginalImage="
				+ diaryOriginalImage + ", diaryRenameImage=" + diaryRenameImage + "]";
	}
	
	
}
