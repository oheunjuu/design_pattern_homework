package com.j2.w13.GumballBefore;

public class GumballMachineTestDrive{
  public static void main(String[] args){
    GumballMachine gm=new GumballMachine(5);
    gm.insertQuarter();
    gm.insertQuarter();
    gm.turnCrank();
  }
}