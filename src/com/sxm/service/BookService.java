package com.sxm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sxm.entity.Book;
import com.sxm.entity.BookType;
import com.sxm.entity.Fenye;

@Service
public interface BookService {

	/**
	 * 查询所有数据
	 * @param fenye
	 * @return
	 */
	Fenye<Book> selBook(Fenye<Book> fenye);
	
	/**
	 * 修改
	 * @param Book
	 * @return
	 */
	Integer updateBook(Book Book);
	
	
	/**
	 * 添加
	 * @param Book
	 * @return
	 */
	Integer addBook(Book Book);
	
	
	
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	Integer delBook(Integer bId);
	
	
	
	List<BookType> getBookType();

}
