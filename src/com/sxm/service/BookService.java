package com.sxm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sxm.entity.Book;
import com.sxm.entity.BookType;
import com.sxm.entity.Fenye;

@Service
public interface BookService {

	/**
	 * ��ѯ��������
	 * @param fenye
	 * @return
	 */
	Fenye<Book> selBook(Fenye<Book> fenye);
	
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
