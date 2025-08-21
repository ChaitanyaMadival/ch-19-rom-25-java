package com.xworkz.bookapp.bookvalidation;

import com.xworkz.bookapp.book.Book;

public class BookValidation {
    public  boolean validateBook(Book book){
        boolean isBookValidated = false;

        boolean bookNameValid = false;
        boolean bookIdValid = false;
        boolean languageValid = false;
        boolean genreValid = false;
        boolean titleValid  = false;
        boolean authorValid = false;
        boolean publisherValid =  false;

        if(book.getBookName() != null && !book.getBookName().isEmpty()){
            bookNameValid = true;
        }else {
            System.out.println("Book Name is not valid/empty");
        }

        if(book.getBookId() != null && !book.getBookId().isEmpty()){
            bookIdValid = true;
        }else {
            System.out.println("book id is not valid/empty");
        }
        if(book.getLanguage() != null && !book.getLanguage().isEmpty()){
            languageValid  = true;
        }else {
            System.out.println("language is not valid/empty");
        }
        if(book.getGenre() != null && !book.getGenre().isEmpty()){
            genreValid = true;
        }else {
            System.out.println("genre is not valid/empty");
        }
        if(book.getTitle() != null && !book.getTitle().isEmpty()){
            titleValid = true;
        }else {
            System.out.println("title is not valid/empty");
        }
        if(book.getAuthor() != null && !book.getAuthor().isEmpty()){
            authorValid = true;
        }else {
            System.out.println("author is not valid/empty");
        }
        if(book.getPublisher() != null && !book.getPublisher().isEmpty()){
            publisherValid = true;
        }else {
            System.out.println("publisher is not valid/empty");
        }

        if(bookNameValid && bookIdValid && languageValid && genreValid && titleValid && authorValid && publisherValid){
            isBookValidated = true;
        }
        return  isBookValidated;

    }
}
