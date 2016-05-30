package com.j2.w13.GumballBefore;

public class GumballMachine{
  final static int SOLD_OUT=0;
  final static int NO_QUARTER=1;
  final static int HAS_QUARTER=2;
  final static int SOLD=3;
  
  int state=SOLD_OUT;
  
  int count=0;
  public GumballMachine(int count){
    this.count=count;
    if (count>1){
      state=NO_QUARTER;
    }
  }
  public void insertQuarter(){
    if (state==HAS_QUARTER){
      System.out.println("You cannot insert another quarter.");
    }
    else if (state==NO_QUARTER){
      state=HAS_QUARTER;
      System.out.println("You inserted a quarter.");
    }
    else if (state==SOLD_OUT){
      System.out.println("You cannot insert a quarter.Sold out!!");
    }
    else if (state==SOLD){
      System.out.println("Wait. We have already given a gumball.");
    }
  }
  public void ejectQuarter(){
    if (state==HAS_QUARTER){
      state=NO_QUARTER;
      System.out.println("Quarter returned.");
    }
    else if (state==NO_QUARTER){
      System.out.println("You haven't inserted a quarter.");
    }
    else if (state==SOLD_OUT){
      System.out.println("Sorry, you already turned a crank.");
    }
    else if (state==SOLD){
      System.out.println("You cannot eject. you haven't inserted a quarter yet.");
    }
  }
  public void turnCrank(){
    if (state==SOLD){
      System.out.println("Turning twice doesn't get you another gumball.");
    }
    else if (state==NO_QUARTER){
      System.out.println("You turned but there's no quarter.");
    }
    else if (state==SOLD_OUT){
      System.out.println("You turned, but there are no gumballs.");
    }
    else if (state==SOLD){
      System.out.println("You turned.");
      state=SOLD;
    }
  }    
}
  
  