package com.j2.w13.State;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gum=new GumballMachine(5);
    gum.insertQuarter();
    gum.turnCrank();
    gum.ejectQuarter();
    gum.dispense();
  }
}