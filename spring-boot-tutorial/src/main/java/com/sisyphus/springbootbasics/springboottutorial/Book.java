package com.sisyphus.springbootbasics.springboottutorial;


public class Book {
    long id ;
    String name;
    String author;

    public Book(long id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
        
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

}