package com.j2.w12.Iterator.KoreanMenu;

public class KMenuItem{
  String name;
  String description;
  boolean vegetarian;
  double price;
  public KMenuItem(String name, String description, boolean vegetarian, double price){
    this.name=name;
    this.description=description;
    this.vegetarian=vegetarian;
    this.price=price;
  }
  public  String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public double getPrice(){
    return price;
  }
  public String toString(){
    return (name+" , $"+price+"\n   "+description);
  }
}