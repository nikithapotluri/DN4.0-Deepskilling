package com.library.repository;

public class BookRepository {
    public void saveBook(String bookName) {
        System.out.println("The book '" + bookName + "' saved to the repository.");
    }
}