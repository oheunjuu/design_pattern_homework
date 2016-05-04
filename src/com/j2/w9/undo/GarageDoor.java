package com.j2.w9.undo;

public class GarageDoor{
  public int level;
  public GarageDoor(){}

  public void open(){
    
    System.out.println("Door opens.");
  }
  public void close(){
 
    System.out.println("Door closes.");
  }
  
  public void dim(int level){
    this.level=level;
    if(level==0){
      close();
    }
    else{
      System.out.println("Door opens "+level);
    }
  }
  public int getLevel(){
    return level;
  }
}
