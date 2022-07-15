package com.sujata.demo;

import java.util.ArrayList;

public class BookClient {

	public static void main(String[] args) {
		
		BookList bookList=new BookList();
//		ArrayList<Book> books=bookList.getAllBooks();
//		System.out.println(books);
//		
//		System.out.println("Books Written By Author M : "+bookList.getBooksWrittenByAuthorM());
//		
//		System.out.println("Expensive Books : "+bookList.getExpensiveBooks());
	
		ArrayList<Book> allBooks=bookList.getBooksByCriteria(new AllBookPredicate());
		System.out.println("All books:");
		for(Book book: allBooks) {
			System.out.println(book);
		}
		
//		ArrayList<Book> expensiveBooks = bookList.getBooksByCriteria(new ExpensiveBookPredicate());
//		System.out.println("Expensive books:");
//		for(Book book: expensiveBooks) {
//			System.out.println(book);
//		}
//		System.out.println("Expensive Books : "+bookList.getBooksByCriteria(new ExpensiveBookPredicate()));
		
		ArrayList<Book> expensiveBooks = bookList.getBooksByCriteria(new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getPrice()>2000;
			}
		});
		System.out.println("Expensive books:");
		for(Book book: expensiveBooks) {
			System.out.println(book);
		}
		
		ArrayList<Book> cheapBooks = bookList.getBooksByCriteria(book -> book.getPrice() <= 2000);
		System.out.println("Cheap books:");
		for(Book book: cheapBooks) {
			System.out.println(book);
		}
	}
}