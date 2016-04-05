package com.j2.w5;

public class water extends CondimentDecorator_kimchi{
  public water(Kimchi kimchi){
    this.kimchi=kimchi;
  }
  public String getDescription(){
    return kimchi.getDescription()+", water";
  }
  public double spicy(){
    return 1.0 + kimchi.spicy();
  }
}