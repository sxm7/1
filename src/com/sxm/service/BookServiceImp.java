package com.sxm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxm.dao.BookMapper;
import com.sxm.entity.Book;
import com.sxm.entity.BookType;
import com.sxm.entity.Fenye;
@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	
	@Override
	public Fenye<Book> selBook(Fenye<Book> fenye) {
		Integer count=bookMapper.selBookCount(fenye);
		List<Book> selBook=bookMapper.selBook(fenye);
		
		fenye.setRows(selBook);
		fenye.setTotal(count);
		
		return fenye ;
	}

	@Override
	public Integer updateBook(Book Book) {
		// TODO Auto-generated method stub
		return bookMapper.updateBook(Book);
	}

	@Override
	public Integer addBook(Book Book) {
		// TODO Auto-generated method stub
		return bookMapper.addBook(Book);
	}

	@Override
	public Integer delBook(Integer bId) {
		// TODO Auto-generated method stub
		return bookMapper.delBook(bId);
	}

	@Override
	public List<BookType> getBookType() {
		// TODO Auto-generated method stub
		return bookMapper.getBookType();
	}

}
