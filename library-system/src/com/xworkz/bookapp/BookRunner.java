package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.details.BookInfo;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Book book = new Book();
        book.setBookName("Think Like a monk");
        book.setBookId("JA127");
        book.setLanguage("English");
        book.setGenre("self help");
        book.setTitle("think like a monk");
        book.setAuthor("Jai shetty");
        book.setPublisher("Simon & Schuster");

        BookInfo bookDetails = new BookInfo();
        bookDetails.createBookInfo(book);
        bookDetails.fetchBookDetails();


        System.out.println("main ended");
    }
}
