package com.j2.w13.DVD;

public class ScreenOffState implements State{
  DVDplayer dvdplayer;
  public ScreenOffState(DVDplayer dvdplayer){
    this.dvdplayer=dvdplayer;
  }
  public void play(){
    System.out.println("You pushed play button. Screen wake up!");
    dvdplayer.setState(dvdplayer.getScreenOn());
  }
  public void stop(){
    System.out.println("No DVD in player. Can't stop.");
  }
  public void end(){
    System.out.println("No DVD in player. Can't end.");
  }
}