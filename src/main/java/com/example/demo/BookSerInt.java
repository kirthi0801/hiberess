package com.example.demo;

import java.util.List;

import com.example.demo.models.Book;

public interface BookSerInt {
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}
