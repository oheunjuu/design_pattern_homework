package com.j2.w10.Facade.study;

public class Laptop{
  String description;
  public Laptop(String description){
    this.description=description;
  }
  public void on(){
    System.out.println(description+" on.");
  }
  public void off(){
    System.out.println(description+" off.");
  }
  public void mouseon(){
    System.out.println(description+" mouse on.");
  }
  public void mouseoff(){
    System.out.println(description+" mouse off.");
  }
  public void search(String Q){
    System.out.println(description+" searching "+Q);
  }
  public void doHW(){
    System.out.println("Do homework.");
  }
  public void submit(){
    System.out.println("Submit homework.");
  }
}
