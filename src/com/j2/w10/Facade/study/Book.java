package com.j2.w10.Facade.study;

public class Book{
  String description;
  String bookname;
  public Book(String description){
    this.description=description;
  }
  public void open(String bookname){
    this.bookname=bookname;
    System.out.println("Open "+bookname);
  }
  public void close(){
    System.out.println("Close "+description);
  }
  public void getPen(){
    System.out.println("get pens.");
  }
  public void dropPen(){
    System.out.println("drop pens.");
  }
  public void write(){
    System.out.println("write words on "+bookname);
  }
  public void check(){
    System.out.println("Checking points that I don't konw.");
  }
}
  