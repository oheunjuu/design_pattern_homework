package com.j2.w10.Facade.study;

public class StudyFacade{
  private Laptop laptop;
  private Book book;
  private Messenger talk;
  public StudyFacade(Laptop laptop, Book book, Messenger talk){
    this.laptop=laptop;
    this.book=book;
    this.talk=talk;
  }
  public void StudyStart(String subject){
    System.out.println("Get ready to study "+subject+"!");
    laptop.on();
    laptop.mouseon();
    talk.login();
    talk.checkHW();
    laptop.search("question");
    book.open("'Programming Start Book'.");
    laptop.doHW();
    book.getPen(); 
    book.write();
    book.check();
  }
  public void StudyEnd(){
    System.out.println();
    System.out.println("Now stop studying.");
    laptop.submit();
    book.close();
    book.dropPen();
    talk.logout();
    laptop.mouseoff();
    laptop.off();
  }
}

    
    
    
  