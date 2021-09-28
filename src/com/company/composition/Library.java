package com.company.composition;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private Books book;
    public Library(){
        this.book = new Books();
        book.setName("Harry Potter and the Prisoner of Azkaban");
        book.setAuthorName("J. K. Rowling");
        book.setPrice(200);
    }
    public String getName(){
        return book.getName();
    }
    public String getAuthorName(){
        return book.getAuthorName();
    }
    public int getPrice(){
        return book.getPrice();
    }

}
