package com.j2.w9.undo;

public class DVDplayer{
  public int level;
  public DVDplayer(){}

  public void play(){
    
    System.out.println("DVD plays.");
  }
  public void stop(){
 
    System.out.println("DVD stops.");
  }
  
  public void playing(int level){
    this.level=level;
    if(level==0){
      stop();
    }
    else{
      System.out.println("DVD plays "+level + "'");
    }
  }
  public int getLevel(){
    return level;
  }
}
