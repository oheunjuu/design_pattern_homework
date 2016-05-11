package com.j2.w10.Facade;

public class DvdPlayer{
  String description;
  Amplifier amplifier;
  String movie;
  public DvdPlayer(String description, Amplifier amplifier){
    this.description=description;
    this.amplifier=amplifier;
  }
  public void on(){
    System.out.println(description+" on.");
  }
  public void off(){
    System.out.println(description+" off.");
  }
  public void play(String movie){
    this.movie=movie;
    System.out.println(description+" plays "+movie);
  }
  public void stop(){
    System.out.println(description+" stops "+movie);
  }
  public void eject(){
    movie=null;
    System.out.println(description+" ejects"+movie);
  }
  public String toString(){
    return description;
  }
}