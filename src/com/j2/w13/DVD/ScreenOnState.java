package com.j2.w13.DVD;

public class ScreenOnState implements State{
  DVDplayer dvdplayer;
  public ScreenOnState(DVDplayer dvdplayer){
    this.dvdplayer=dvdplayer;
  }
  public void play(){
    System.out.println("Dvd is already playing.");
  }
  public void stop(){
    System.out.println("You pushed stop button. Screen sleep~");
    dvdplayer.setState(dvdplayer.getScreenSleep());
  }
  public void end(){
    System.out.println("DVD end. Screen Off!");
    dvdplayer.setState(dvdplayer.getScreenOff());
  }
}