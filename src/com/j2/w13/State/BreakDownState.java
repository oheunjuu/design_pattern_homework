package com.j2.w13.State;

public class BreakDownState implements State{
  GumballMachine gumballMachine;
  public BreakDownState(GumballMachine gumballMachine){
    this.gumballMachine=gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("Sorry. Machine is broken down.");
  }
  public void ejectQuarter(){
    System.out.println("Here is wrong quarter.");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }
  public void turnCrank(){
    System.out.println("You inserted worng quarter. Turn crank and get your wrong quarter.");
  }
  public void dispense(){
    System.out.println("You inserted wrong quarter. You cannot get a gumball.");
  }
  public void insertwrongcoin(){
    System.out.println("Sorry. You cannot use this machine.");
  }
}
