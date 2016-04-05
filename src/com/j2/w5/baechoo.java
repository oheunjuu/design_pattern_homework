package com.j2.w5;

public class baechoo extends CondimentDecorator_kimchi{
  public baechoo(Kimchi kimchi){
    this.kimchi=kimchi;
  }
  public String getDescription(){
    return kimchi.getDescription()+", baechoo";
  }
  public double spicy(){
    return 0.5 + kimchi.spicy();
  }
}