package com.sxm.entity;

public class BookType {
	private Integer tId;
	private String tName;
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public BookType(Integer tId, String tName) {
		super();
		this.tId = tId;
		this.tName = tName;
	}
	public BookType() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "bookType [tId=" + tId + ", tName=" + tName + "]";
	}

}
