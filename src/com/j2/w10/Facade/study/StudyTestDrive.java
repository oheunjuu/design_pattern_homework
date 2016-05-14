package com.j2.w10.Facade.study;

public class StudyTestDrive{
  public static void main(String[] args){
    Laptop laptop=new Laptop("Eunju's laptop");
    Book book=new Book("Eunju's book.");
    Messenger talk=new Messenger("Eunju's messenger");
    
    StudyFacade SF=new StudyFacade(laptop,book,talk);
    SF.StudyStart("Programming");
    SF.StudyEnd();
  }
}