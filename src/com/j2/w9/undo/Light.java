package com.j2.w9.undo;

public class Light{
  public int level;
  public Light(){}
  public void on(){
    level=100;
    System.out.println("Light is on.");
  }
  public void off(){
    level=0;
    System.out.println("Light is off. ");
  }
  public void dim(int level){
    this.level=level;
    if(level==0){
      off();
    }
    else{
      System.out.println("Light is dimmed to"+level);
    }
  }
  public int getLevel(){
    return level;
  }
}
