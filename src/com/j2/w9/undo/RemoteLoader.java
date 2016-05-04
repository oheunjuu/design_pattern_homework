package com.j2.w9.undo;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
    
    Light light = new Light();
    LightOnCommand lighton = new LightOnCommand(light);
    LightOffCommand lightoff = new LightOffCommand(light);
    
    GarageDoor garage = new GarageDoor();
    DoorOpenCommand dooropen = new DoorOpenCommand(garage);
    DoorCloseCommand doorclose = new DoorCloseCommand(garage);
    
    DVDplayer player = new DVDplayer();
    DVDplayCommand dvdplay=new DVDplayCommand(player);
    DVDstopCommand dvdstop = new DVDstopCommand(player);
    
    remoteControl.setCommand(0,lighton,lightoff);
    remoteControl.setCommand(1,dooropen,doorclose);
    remoteControl.setCommand(2,dvdplay,dvdstop);
    
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);
    
    remoteControl.onButtonWasPushed(1);
    remoteControl.offButtonWasPushed(1);
    
    remoteControl.onButtonWasPushed(2);
    remoteControl.offButtonWasPushed(2);
    
//    remoteControl.undoButtonWasPushed();
    System.out.println(remoteControl);    
  }
}