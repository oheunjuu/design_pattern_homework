package com.j2.w9.undo;

public class DVDplayCommand implements Command{
  private DVDplayer dvd;
  int level;
  public DVDplayCommand(DVDplayer dvd){
    this.dvd=dvd;
  }
  public void execute(){
    dvd.play();
  }
  public void undo(){
    dvd.playing(level);
  }
}