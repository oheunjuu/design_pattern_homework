package com.j2.w9.undo;

public class DVDstopCommand implements Command{
  private DVDplayer dvd;
  int level;
  public DVDstopCommand(DVDplayer dvd){
    this.dvd=dvd;
  }
  public void execute(){
    dvd.stop();
  }
  public void undo(){
    dvd.playing(level);
  }
}