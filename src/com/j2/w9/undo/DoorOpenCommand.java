package com.j2.w9.undo;

public class DoorOpenCommand implements Command{
  private GarageDoor door;
  int level;
  public DoorOpenCommand(GarageDoor door){
    this.door=door;
  }
  public void execute(){
    door.open();
  }
  public void undo(){
    door.dim(level);
  }
}