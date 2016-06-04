package com.j2.w13.DVD;

public class DVDplayer{
  State state;
  State screenOnState;
  State screenOffState;
  State screenSleepState;
  
  public DVDplayer(){
    screenOnState=new ScreenOnState(this);
    screenOffState=new ScreenOffState(this);
    screenSleepState=new ScreenSleepState(this);
    state=screenOnState;
  }
  public void play(){
    state.play();
  }
  public void stop(){
    state.stop();
  }
  public void end(){
    state.end();
  }
  public void setState(State state){
    this.state=state;
  }
  public State getScreenOn(){
    return screenOnState;
  }
  public State getScreenOff(){
    return screenOffState;
  }
  public State getScreenSleep(){
    return screenSleepState;
  }
}
  