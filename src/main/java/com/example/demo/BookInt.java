package com.example.demo;

import java.util.List;

import com.example.demo.models.Book;

public interface BookInt {
	
		void save(Book book);
		
		Book get(long id);
		
		List<Book> get();

		void update(long id,Book book);
		
		void delete(long id);
	}

