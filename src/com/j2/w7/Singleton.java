package com.j2.w7;

public class Singleton {
  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  static int numCalled=0;
  private Singleton(){}
  public static synchronized Singleton getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new Singleton();
    }
    numCalled++;
    System.out.println("numCalled: "+ numCalled++);
    return uniqueInstance;
  }
}