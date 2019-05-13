package com.sxm.entity;

import java.util.List;

import org.springframework.stereotype.Controller;
@Controller
public class Fenye<T> {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<T> rows;
	private Book book;
	
	private Double startPrice;
	private Double endPrice;
	
	public Double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Fenye(Integer page, Integer pageSize, Integer total, List<T> rows,
			Book book) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.total = total;
		this.rows = rows;
		this.book = book;
	}
	public Fenye() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total="
				+ total + ", rows=" + rows + ", book=" + book + ", startPrice="
				+ startPrice + ", endPrice=" + endPrice + "]";
	}
	


}
