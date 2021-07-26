package sportsvideo.model.vo;

import java.sql.Date;

public class SportsVideo implements java.io.Serializable{
	private static final long serialVersionUID = 112;
	
	private int svBoardNo;	// �۹�ȣ
	private String productId;	// ǰ��id
	private String svSubCategory;	// ���� �Һз�
	private String svTitle;	// �����
	private String svUrl;	// ���ḵũ
	private String svOriginalImage;	// ���� ÷�����ϸ�
	private String svRenameImage;	// ���� ÷�����ϸ�
	private java.sql.Date svUploadDate;	// �Խ���
	private java.sql.Date svModifyDate;	// ������ ������
	private String svHeart;	// ��Ʈ
	
	public SportsVideo() {}

	public SportsVideo(int svBoardNo, String productId, String svSubCategory, String svTitle, String svUrl,
			String svOriginalImage, String svRenameImage, Date svUploadDate, Date svModifyDate, String svHeart) {
		super();
		this.svBoardNo = svBoardNo;
		this.productId = productId;
		this.svSubCategory = svSubCategory;
		this.svTitle = svTitle;
		this.svUrl = svUrl;
		this.svOriginalImage = svOriginalImage;
		this.svRenameImage = svRenameImage;
		this.svUploadDate = svUploadDate;
		this.svModifyDate = svModifyDate;
		this.svHeart = svHeart;
	}

	
	public SportsVideo(int svBoardNo, String productId, String svSubCategory, String svTitle, String svUrl,
			String svOriginalImage, Date svUploadDate, String svHeart) {
		super();
		this.svBoardNo = svBoardNo;
		this.productId = productId;
		this.svSubCategory = svSubCategory;
		this.svTitle = svTitle;
		this.svUrl = svUrl;
		this.svOriginalImage = svOriginalImage;
		this.svUploadDate = svUploadDate;
		this.svHeart = svHeart;
	}

	public int getSvBoardNo() {
		return svBoardNo;
	}

	public void setSvBoardNo(int svBoardNo) {
		this.svBoardNo = svBoardNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSvSubCategory() {
		return svSubCategory;
	}

	public void setSvSubCategory(String svSubCategory) {
		this.svSubCategory = svSubCategory;
	}

	public String getSvTitle() {
		return svTitle;
	}

	public void setSvTitle(String svTitle) {
		this.svTitle = svTitle;
	}

	public String getSvUrl() {
		return svUrl;
	}

	public void setSvUrl(String svUrl) {
		this.svUrl = svUrl;
	}

	public String getSvOriginalImage() {
		return svOriginalImage;
	}

	public void setSvOriginalImage(String svOriginalImage) {
		this.svOriginalImage = svOriginalImage;
	}

	public String getSvRenameImage() {
		return svRenameImage;
	}

	public void setSvRenameImage(String svRenameImage) {
		this.svRenameImage = svRenameImage;
	}

	public java.sql.Date getSvUploadDate() {
		return svUploadDate;
	}

	public void setSvUploadDate(java.sql.Date svUploadDate) {
		this.svUploadDate = svUploadDate;
	}

	public java.sql.Date getSvModifyDate() {
		return svModifyDate;
	}

	public void setSvModifyDate(java.sql.Date svModifyDate) {
		this.svModifyDate = svModifyDate;
	}

	public String getSvHeart() {
		return svHeart;
	}

	public void setSvHeart(String svHeart) {
		this.svHeart = svHeart;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SportsVideo [svBoardNo=" + svBoardNo + ", productId=" + productId + ", svSubCategory=" + svSubCategory
				+ ", svTitle=" + svTitle + ", svUrl=" + svUrl + ", svOriginalImage=" + svOriginalImage
				+ ", svRenameImage=" + svRenameImage + ", svUploadDate=" + svUploadDate + ", svModifyDate="
				+ svModifyDate + ", svHeart=" + svHeart + "]";
	}
	
	

}
