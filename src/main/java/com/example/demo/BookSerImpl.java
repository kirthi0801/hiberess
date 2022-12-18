package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Book;

@Service
public class BookSerImpl implements BookSerInt{
	@Autowired
	private BookInt bookDAO;
	
	@Transactional
	public void save(Book book) {
		bookDAO.save(book);
	}

	@Transactional
	public Book get(int id) {
		return bookDAO.get(id);
	}

	@Transactional
	public void delete(int id) {
		bookDAO.delete(id);
	}

	@Transactional
	public List<Book> get() {
		System.out.println("BookServiceImpl");
		return bookDAO.get();
	}
	
}
