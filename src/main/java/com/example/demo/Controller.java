package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Book;

@RestController
public class Controller {

	@Autowired
	BookSerInt bs;

	@GetMapping(value = "/getProds")
	public List<Book> getProd() {

		return bs.get();
	}

}
