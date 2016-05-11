package com.j2.w10.Facade;

public class Tuner{
  String description;
  Amplifier amplifier;
  double frequency;
  public Tuner(String description, Amplifier amplifier){
    this.description=description;
  }
  public void on(){
    System.out.println(description+" on.");
  }
  public void off(){
    System.out.println(description+" off.");
  }
  public void setFrequency(double frequency){
    System.out.println(description+" setting frequency "+frequency);
  }
  public String toString(){
    return description;
  }
}