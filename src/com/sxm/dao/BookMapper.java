package com.sxm.dao;

import java.util.List;

import com.sxm.entity.Book;
import com.sxm.entity.BookType;
import com.sxm.entity.Fenye;

public interface BookMapper {


	/**
	 * ��ѯ������
	 * @param fenye
	 * @return
	 */
	Integer selBookCount(Fenye<Book> fenye);
	
	
	/**
	 * ��ѯ��������
	 * @param fenye
	 * @return
	 */
	List<Book> selBook(Fenye<Book> fenye);
	
	/**
	 * �޸�
	 * @param Book
	 * @return
	 */
	Integer updateBook(Book Book);
	
	
	/**
	 * ���
	 * @param Book
	 * @return
	 */
	Integer addBook(Book Book);
	
	
	
	
	/**
	 * ɾ��
	 * @param id
	 * @return
	 */
	Integer delBook(Integer bId);
	
	
	
	List<BookType> getBookType();
}
