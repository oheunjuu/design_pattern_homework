package com.j2.w13.State;

public class GumballMachine{
//  final static int SOLD_OUT=0;
  State soldOutState;
//  final static int NO_QUARTER=1;
  State noQuarterState;
//  final static int HAS_QUARTER=2;
  State hasQuarterState;
//  final static int SOLD=3;
  State soldState;
  State breakDownState;
  
  
// int state=SOLD_OUT;
  State state=soldOutState;
  int count=0;
  
  public GumballMachine(int count){
    soldOutState=new SoldOutState(this);
    noQuarterState=new NoQuarterState(this);
    hasQuarterState=new HasQuarterState(this);
    soldState=new SoldState(this);
    breakDownState=new BreakDownState(this);
    
    this.count=count;
    if (count>0){
      //state = NO_QUARTER;
      state=noQuarterState;
    }
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
  }
  public void dispense(){
    state.dispense();
  }
  public void insertwrongcoin(){
    state.insertwrongcoin();
  }
  public void setState(State state){//set은 return이 없음 get은 매개변수 없고 return 있음
    this.state=state;
  }
  public State getNoQuarterState(){
    return noQuarterState;
  }
  public State getSoldState(){
    return soldState;
  }
  public State getSoldOutState(){
    return soldOutState;
  }
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  public State getBreakDownState(){
    return breakDownState;
  }
  public int getCount(){
    return count;
  }
}
      