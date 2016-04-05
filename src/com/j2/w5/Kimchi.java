package com.j2.w5;

public abstract class Kimchi{
  String description = "Unknown Kimchi";
  public String getDescription(){
    return description;
  }
  public abstract double spicy();
}