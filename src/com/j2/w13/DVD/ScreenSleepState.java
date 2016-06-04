package com.j2.w13.DVD;

public class ScreenSleepState implements State{
  DVDplayer dvdplayer;
  public ScreenSleepState(DVDplayer dvdplayer){
    this.dvdplayer=dvdplayer;
  }
  public void play(){
    System.out.println("DVD wake up~!! playing continuously.");
    dvdplayer.setState(dvdplayer.getScreenOn());
  }
  public void stop(){
    System.out.println("DVD is already stopped.");
  }
  public void end(){
    System.out.println("You pushed end button. Bye~");
    dvdplayer.setState(dvdplayer.getScreenOff());
  }
}