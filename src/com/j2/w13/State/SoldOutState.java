package com.j2.w13.State;

public class SoldOutState implements State{
  GumballMachine gumballMachine;
  public SoldOutState(GumballMachine gumballMachine){
    this.gumballMachine=gumballMachine;
  }
  public void insertQuarter(){
    System.out.println("You cannot insert a quarter. gumball is soldout!");
  }
  public void ejectQuarter(){
    System.out.println("You cannot eject. You haven't inserted a quarter yet.");
  }
  public void turnCrank(){
    System.out.println("You turned. But no gumballs.");
  }
  public void dispense(){
    System.out.println("No gumballs dispended.");
  }
  public void insertwrongcoin(){
    System.out.println("You cannot insert a quarter. gumball is soldout!");
  }
}