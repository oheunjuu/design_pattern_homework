package com.j2.w14.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{ 
  State soldOutState; 
  State noQuarterState; 
  State hasQuarterState; 
  State soldState; 
  State breakDownState; 
  
  State state=soldOutState; 
  int count=0; 
  String location;
  
  public GumballMachine(String location,int count) throws RemoteException{ 
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
  public State getState(){
    return state;
  }
  public String getLocation(){
    return location;
  }
}