package com.j2.w14.proxy;

public class HasQuarterState implements State{ 
  transient GumballMachine gumballMachine; 
  public HasQuarterState(GumballMachine gumballMachine){ 
    this.gumballMachine=gumballMachine; 
  } 
  public void insertQuarter(){ 
    System.out.println("You cannot insert another quarter."); 
  } 
  public void ejectQuarter(){ 
    System.out.println("Quarter returned."); 
    gumballMachine.setState(gumballMachine.getNoQuarterState()); 
  } 
  public void turnCrank(){ 
    System.out.println("you turned..."); 
    gumballMachine.setState(gumballMachine.getSoldState()); 
  } 
  public void dispense(){ 
    System.out.println("No gumball."); 
  } 
  public void insertwrongcoin(){ 
    System.out.println("You cannot insert another quarter."); 
  } 
} 
