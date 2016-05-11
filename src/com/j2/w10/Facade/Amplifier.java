package com.j2.w10.Facade;

public class Amplifier{
  String description;
  Tuner tuner;
  DvdPlayer dvd;
  public Amplifier(String description){
    this.description=description;
  }
  public void on(){
    System.out.println(description+" on");
  }
  public void off(){
    System.out.println(description+" off");
  }
  public void setDvd(DvdPlayer dvd){
    System.out.println(description+" setting "+dvd);
    this.dvd=dvd;
  }
  public void setTuner(Tuner tuner){
    System.out.println(description+" tunning "+tuner);
    this.tuner=tuner;
  }
  public void setVolume(int level){
    System.out.println(description+" volume level is "+level);
  }
  public String toString(){
    return description;
  }
}
  