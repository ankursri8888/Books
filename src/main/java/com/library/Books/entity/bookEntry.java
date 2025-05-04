package com.library.Books.entity;

public class bookEntry {
    public int id;
    public String authorName;
    public String bookName;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
}
