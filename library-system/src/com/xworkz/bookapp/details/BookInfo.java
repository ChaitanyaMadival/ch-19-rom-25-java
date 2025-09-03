package com.xworkz.bookapp.details;

import com.xworkz.bookapp.book.Book;

public class BookInfo {
//    Book book;
//
//    public  boolean createBookInfo(Book book){
//        boolean isBookCreated = false;
//        boolean isBookInfoValid = false;
//
//        BookValidation bookInfo = new BookValidation();
//        isBookInfoValid = bookInfo.validateBook(book);
//        if(isBookInfoValid){
//            this.book = book;
//            isBookCreated = true;
//        }
//        return  isBookCreated;
//    }


    Book[] books = new Book[13];
    int index;

    public boolean addBooks(Book book){
        boolean isBookAdded = false;

        if(books != null){
            books[index++] = book;
            isBookAdded = true;
        }else {
            System.out.println("Invalid book");
        }
        return isBookAdded;
    }
    public void fetchBookDetails() {

        for (Book book : books) {

            System.out.println("book name : " + book.getBookName());
            System.out.println("book id : " + book.getBookId());
            System.out.println("language : " + book.getLanguage());
            System.out.println("genre : " + book.getGenre());
            System.out.println("title : " + book.getTitle());
            System.out.println("author : " + book.getAuthor());
            System.out.println("publisher : " + book.getPublisher());
            System.out.println("-----------------");
        }
    }
}
