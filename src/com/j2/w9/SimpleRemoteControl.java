package com.j2.w9;

public class SimpleRemoteControl{
  Command slot;
  
  public SimpleRemoteControl(){}
  
  public void setCommand (Command command){
    slot=command;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
}