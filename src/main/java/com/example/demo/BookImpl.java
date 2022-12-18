package com.example.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Book;
@Repository
public class BookImpl implements BookInt{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public Book get(long id) {
		return sessionFactory.getCurrentSession().get(Book.class, id);
	}

	

	@Override
	public void delete(long id) {
		Session session =  sessionFactory.getCurrentSession();
		Book book = session.get(Book.class, id);
		session.delete(book);
	}

	@Override
	public List<Book> get() {
		System.out.println("BookDaoImpl");
		return sessionFactory.getCurrentSession().createQuery("from Book").list();
		
	}

	@Override
	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}
	
}
