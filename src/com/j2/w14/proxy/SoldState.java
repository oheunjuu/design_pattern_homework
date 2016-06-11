package com.j2.w14.proxy;

public class SoldState implements State{ 
  transient GumballMachine gumballMachine; 
  public SoldState(GumballMachine gumballMachine){ 
    this.gumballMachine=gumballMachine; 
  } 
  
  public void insertQuarter(){ 
    System.out.println("Please wait. we are giving you a gumball."); 
  } 
  public void ejectQuarter(){ 
    System.out.println("Sorry. you already turned a crank."); 
  } 
  public void turnCrank(){ 
    System.out.println("Sorry. you already turned a crank.Please Wait!"); 
  } 
  public void dispense(){ 
    if (gumballMachine.getCount()>0){ 
      System.out.println("Here is your gumball!"); 
      gumballMachine.setState(gumballMachine.getNoQuarterState()); 
    } 
    else{ 
      System.out.println("Sorry. gumballs are sold out..."); 
      gumballMachine.setState(gumballMachine.getSoldOutState()); 
    } 
  } 
  public void insertwrongcoin(){ 
    System.out.println("error..."); 
  } 
} 