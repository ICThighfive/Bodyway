package sportsitem.model.vo;

import java.sql.Date;

public class SportsItem implements java.io.Serializable {
	private static final long serialVersionUID = 111L;
	
	private int siBoardNo;	// 글번호
	private String productId;	// 품목 id
	private String siSubCategory;	// 운동용품 소분류
	private String siTitle;	// 상품명
	private String siDetail;	// 상세정보 글
	private String siUrl;	// 연결링크
	private String siOriginalImage;	// 기존 첨부파일명
	private String siRenameImage;	// 변경 첨부파일명
	private java.sql.Date siUploadDate;	// 게시일
	private java.sql.Date siModifyDate;	// 마지막 수정일
	private String siHeart;	// 하트
	
	public SportsItem() {}

	public SportsItem(int siBoardNo, String productId, String siSubCategory, String siTitle, String siDetail,
			String siUrl, String siOriginalImage, String siRenameImage, Date siUploadDate, Date siModifyDate,
			String siHeart) {
		super();
		this.siBoardNo = siBoardNo;
		this.productId = productId;
		this.siSubCategory = siSubCategory;
		this.siTitle = siTitle;
		this.siDetail = siDetail;
		this.siUrl = siUrl;
		this.siOriginalImage = siOriginalImage;
		this.siRenameImage = siRenameImage;
		this.siUploadDate = siUploadDate;
		this.siModifyDate = siModifyDate;
		this.siHeart = siHeart;
	}

	public int getSiBoardNo() {
		return siBoardNo;
	}

	public void setSiBoardNo(int siBoardNo) {
		this.siBoardNo = siBoardNo;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSiSubCategory() {
		return siSubCategory;
	}

	public void setSiSubCategory(String siSubCategory) {
		this.siSubCategory = siSubCategory;
	}

	public String getSiTitle() {
		return siTitle;
	}

	public void setSiTitle(String siTitle) {
		this.siTitle = siTitle;
	}

	public String getSiDetail() {
		return siDetail;
	}

	public void setSiDetail(String siDetail) {
		this.siDetail = siDetail;
	}

	public String getSiUrl() {
		return siUrl;
	}

	public void setSiUrl(String siUrl) {
		this.siUrl = siUrl;
	}

	public String getSiOriginalImage() {
		return siOriginalImage;
	}

	public void setSiOriginalImage(String siOriginalImage) {
		this.siOriginalImage = siOriginalImage;
	}

	public String getSiRenameImage() {
		return siRenameImage;
	}

	public void setSiRenameImage(String siRenameImage) {
		this.siRenameImage = siRenameImage;
	}

	public java.sql.Date getSiUploadDate() {
		return siUploadDate;
	}

	public void setSiUploadDate(java.sql.Date siUploadDate) {
		this.siUploadDate = siUploadDate;
	}

	public java.sql.Date getSiModifyDate() {
		return siModifyDate;
	}

	public void setSiModifyDate(java.sql.Date siModifyDate) {
		this.siModifyDate = siModifyDate;
	}

	public String getSiHeart() {
		return siHeart;
	}

	public void setSiHeart(String siHeart) {
		this.siHeart = siHeart;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SportsItem [siBoardNo=" + siBoardNo + ", productId=" + productId + ", siSubCategory=" + siSubCategory
				+ ", siTitle=" + siTitle + ", siDetail=" + siDetail + ", siUrl=" + siUrl + ", siOriginalImage="
				+ siOriginalImage + ", siRenameImage=" + siRenameImage + ", siUploadDate=" + siUploadDate
				+ ", siModifyDate=" + siModifyDate + ", siHeart=" + siHeart + "]";
	}
	
	
	
}

	