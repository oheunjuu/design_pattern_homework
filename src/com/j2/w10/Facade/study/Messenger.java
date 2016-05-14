package com.j2.w10.Facade.study;

public class Messenger{
  String description;
  public Messenger(String description){
    this.description=description;
  }
  public void login(){
    System.out.println(description+" login.");
  }
  public void logout(){
    System.out.println(description+" logout.");
  }
  public void checkHW(){
    System.out.println("Check homework on "+description);
  }
}
    