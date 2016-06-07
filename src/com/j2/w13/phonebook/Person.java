package com.j2.w13.phonebook;

public class Person{
  private String name;
  public Person(String name, int num){
    super();
    this.name=name;
    this.num=num;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getNum(){
    return num;
  }
  public void setNum(int num){
    this.num=num;
  }
  private int num;
}