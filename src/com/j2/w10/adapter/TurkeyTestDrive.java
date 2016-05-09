package com.j2.w10.adapter;

public class TurkeyTestDrive{
  public static void main(String[] args){
    MallardDuck mallard = new MallardDuck();
    DuckAdapter da= new DuckAdapter (mallard);
    //da.quack();
    //da.fly();
    testTurkey(da);
  }
  static void testTurkey(Turkey turkey){
    turkey.gobble();
    turkey.fly();
  }
}