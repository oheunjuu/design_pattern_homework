package com.j2.w9.undo;

public class DoorCloseCommand implements Command{
  private GarageDoor door;
  int level;
  public DoorCloseCommand(GarageDoor door){
    this.door=door;
  }
  public void execute(){
    door.close();
  }
  public void undo(){
    door.dim(level);
  }
}