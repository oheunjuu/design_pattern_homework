package com.j2.w9;

public class GarageDoorOpenCommand implements Command{
  GarageDoor gd;
  
  public GarageDoorOpenCommand(GarageDoor gd){
    this.gd=gd;
  }
  public void execute(){
    gd.open();
  }
}