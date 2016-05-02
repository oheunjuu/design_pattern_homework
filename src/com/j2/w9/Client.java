package com.j2.w9;

public class Client{
  public static void main(String[] args){
    SimpleRemoteControl remote=new SimpleRemoteControl();
    Light light= new Light();
    GarageDoor gd=new GarageDoor();
    LightOnCommand lighton=new LightOnCommand(light);
    GarageDoorOpenCommand garageopen = new GarageDoorOpenCommand(gd);
    
    remote.setCommand(lighton);
    remote.buttonWasPressed();
    remote.setCommand(garageopen);
    remote.buttonWasPressed();
  }
}
