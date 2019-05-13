package com.sxm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sxm.entity.Book;
import com.sxm.entity.BookType;
import com.sxm.entity.Fenye;
import com.sxm.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@Autowired
	private Fenye<Book> fenye;
	
	@RequestMapping(value="/showBook",method=RequestMethod.POST)
	@ResponseBody
	public Fenye<Book> showBook(Book book,BookType bookType, Integer page,Integer rows,Double startPrice,Double endPrice ){
		book.setBookType(bookType);
		fenye.setBook(book);
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye.setStartPrice(startPrice);
		fenye.setEndPrice(endPrice);
		
		if (!"".equals(startPrice)) {
			fenye.setStartPrice(startPrice);
		}
		if (!"".equals(endPrice)) {
			fenye.setEndPrice(endPrice);
		}

		if (!"".equals(startPrice)) {
			System.out.println(startPrice);
			fenye.setStartPrice(startPrice);
		}
		if (!"".equals(endPrice)) {
			fenye.setEndPrice(endPrice);
		}
		
		fenye=bookService.selBook(fenye);		
		return fenye;		
	}
//	查询所有的分类返回前台为json
	@RequestMapping(value="/getBookType",method=RequestMethod.POST)
	@ResponseBody
	public List<BookType> getBookType(){
		
		return bookService.getBookType();
		
	}
	
	
	//修改
	@RequestMapping(value="/updateBook",method=RequestMethod.POST)
	@ResponseBody
	public Integer updateBook(BookType bookType,Book book){
		book.setBookType(bookType);
		
		return bookService.updateBook(book);
	}
	
	
	
	//添加
	@RequestMapping(value="/addBook",method=RequestMethod.POST)
	@ResponseBody
	public Integer addBook(BookType bookType,Book book){
		book.setBookType(bookType);
		
		return bookService.addBook(book);
	}
	
	//删除
	@RequestMapping(value="/delBook",method=RequestMethod.POST)
	@ResponseBody
	public Integer delBook( Integer bId){
		System.out.println(bId);
		return bookService.delBook(bId);
	}
	
	
	
	
}
