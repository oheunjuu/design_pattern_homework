package com.j2.w10.Facade;

public class Projector{
  String description;
  DvdPlayer dvdplayer;
  public Projector(String description,DvdPlayer dvdplayer){
    this.description=description;
    this.dvdplayer=dvdplayer;
  }
  public void on(){
    System.out.println(description+" on.");
  }
  public void off(){
    System.out.println(description+" off.");
  }
  public void wideScreenMode(){
    System.out.println(description+" Screen is ready.");
  }
  public String toString(){
    return description;
  }
}