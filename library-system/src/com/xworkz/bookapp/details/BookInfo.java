package com.xworkz.bookapp.details;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.bookvalidation.BookValidation;

public class BookInfo {
    Book book;

    public  boolean createBookInfo(Book book){
        boolean isBookCreated = false;
        boolean isBookInfoValid = false;

        BookValidation bookInfo = new BookValidation();
        isBookInfoValid = bookInfo.validateBook(book);
        if(isBookInfoValid){
            this.book = book;
            isBookCreated = true;
        }
        return  isBookCreated;
    }

    public void fetchBookDetails() {
        System.out.println("book name : "+book.getBookName());
        System.out.println("book id : "+book.getBookId());
        System.out.println("language : "+book.getLanguage());
        System.out.println("genre : "+book.getGenre());
        System.out.println("title : "+book.getTitle());
        System.out.println("author : "+book.getAuthor());
        System.out.println("publisher : "+book.getPublisher());
    }
}
