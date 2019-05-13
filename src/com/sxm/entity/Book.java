package com.sxm.entity;

public class Book {
	private Integer bId;
	private String bName;
	private Integer tId;
	private double bPrice;
	private String bAuthor;
	private String bJieshao;
	private BookType bookType;
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbJieshao() {
		return bJieshao;
	}
	public void setbJieshao(String bJieshao) {
		this.bJieshao = bJieshao;
	}
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public Book(Integer bId, String bName, Integer tId, double bPrice,
			String bAuthor, String bJieshao, com.sxm.entity.BookType bookType) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.tId = tId;
		this.bPrice = bPrice;
		this.bAuthor = bAuthor;
		this.bJieshao = bJieshao;
		this.bookType = bookType;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", tId=" + tId
				+ ", bPrice=" + bPrice + ", bAuthor=" + bAuthor + ", bJieshao="
				+ bJieshao + ", bookType=" + bookType + "]";
	}
	
	

}
