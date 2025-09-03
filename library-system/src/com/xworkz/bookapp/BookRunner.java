package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.details.BookInfo;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        Book book9 = new Book();
        Book book10 = new Book();
        Book book11 = new Book();
        Book book12 = new Book();



        book.setBookName("The Great Gatsby");
        book.setBookId("1");
        book.setLanguage("English");
        book.setGenre("Classic");
        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        book.setPublisher("Scribner");

        book1.setBookName("1984");
        book1.setBookId("2");
        book1.setLanguage("English");
        book1.setGenre("Dystopian");
        book1.setTitle("1984");
        book1.setAuthor("George Orwel");
        book1.setPublisher("Secker & Warburg");

        book2.setBookName("To Kill a Mockingbird");
        book2.setBookId("3");
        book2.setLanguage("English");
        book2.setGenre("Fiction");
        book2.setAuthor("Harper Lee");
        book2.setTitle("To Kill a Mockingbird");
        book2.setPublisher("J. B. Lippincott & Co.");

        book3.setBookName("The Catcher in the Rye");
        book3.setBookId("4");
        book3.setLanguage("English");
        book3.setGenre("Fiction");
        book3.setTitle("The Catcher in the Rye");
        book3.setAuthor("J.D. Salinger");
        book3.setPublisher("Little, Brown and Company");

        book4.setBookName("Dune");
        book4.setBookId("5");
        book4.setLanguage("English");
        book4.setGenre("Science Fiction");
        book4.setTitle("Dune");
        book4.setAuthor("Frank Herbert");
        book4.setPublisher("Chilton Books");

        book5.setBookName("Pride and Prejudicek");
        book5.setBookId("6");
        book5.setLanguage("English");
        book5.setGenre("Romance");
        book5.setTitle("Pride and Prejudicek");
        book5.setAuthor("Jane Austen");
        book5.setPublisher("Simon & Schuster");

        book6.setBookName("The Hobbit");
        book6.setBookId("7");
        book6.setLanguage("English");
        book6.setGenre("Fantasy");
        book6.setTitle("The Hobbit");
        book6.setAuthor("J.R.R. Tolkien");
        book6.setPublisher("George Allen & Unwin");

        book7.setBookName("The Alchemist");
        book7.setBookId("8");
        book7.setLanguage("Portuguese");
        book7.setTitle("The Alchemist");
        book7.setGenre("Adventure");
        book7.setAuthor("Paulo Coelho");
        book7.setPublisher("HarperCollins");

        book8.setBookName("One Hundred Years of Solitude");
        book8.setBookId("9");
        book8.setLanguage("Spanish");
        book8.setTitle("One Hundred Years of Solitude");
        book8.setGenre("Magical Realism");
        book8.setAuthor("Gabriel García Márquez");
        book8.setPublisher("Editorial Sudamericana");

        book9.setBookName("A Brief History of Time");
        book9.setBookId("10");
        book9.setLanguage("English");
        book9.setTitle("A Brief History of Time");
        book9.setGenre("Non-Fiction");
        book9.setAuthor("Stephen Hawking");
        book9.setPublisher("Bantam Books");

        book10.setBookName("Sapiens: A Brief History of Humankind");
        book10.setBookId("11");
        book10.setLanguage("Hebrew");
        book10.setTitle("Sapiens: A Brief History of Humankind");
        book10.setAuthor("Yuval Noah Harari");
        book10.setPublisher("Harvill Secker");
        book10.setGenre("Non-Fiction");

        book11.setBookName("The Lord of the Rings");
        book11.setBookId("12");
        book11.setLanguage("English");
        book11.setTitle("The Lord of the Rings");
        book11.setAuthor("J.R.R. Tolkien");
        book11.setGenre("Fantasy");
        book11.setPublisher("George Allen & Unwin");

        book12.setBookName("Frankenstein");
        book12.setBookId("13");
        book12.setLanguage("English");
        book12.setTitle("Frankenstein");
        book12.setAuthor("Mary Shelley");
        book12.setGenre("Gothic Fiction");
        book12.setPublisher("Lackington, Hughes, Harding");


        BookInfo bookDetails = new BookInfo();
//        bookDetails.createBookInfo(book);
        bookDetails.addBooks(book);
        bookDetails.addBooks(book1);
        bookDetails.addBooks(book2);
        bookDetails.addBooks(book3);
        bookDetails.addBooks(book4);
        bookDetails.addBooks(book5);
        bookDetails.addBooks(book6);
        bookDetails.addBooks(book7);
        bookDetails.addBooks(book8);
        bookDetails.addBooks(book9);
        bookDetails.addBooks(book10);
        bookDetails.addBooks(book11);
        bookDetails.addBooks(book12);


        bookDetails.fetchBookDetails();



        System.out.println("main ended");
    }
}
