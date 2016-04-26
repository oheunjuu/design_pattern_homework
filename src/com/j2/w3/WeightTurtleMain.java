package com.j2.w3;

import java.awt.Color;
import ch.aplu.turtle.*;

public class WeightTurtleMain{
  public static void main(String[] args){
    WeightTurtle wt=new WeightTurtle(10);
    System.out.println("Hello Weight Turtle");
    wt.addStatusBar(20);
    String msg="Hello I weigh"+wt.getWeight()+"kg.";
    wt.setStatusText(msg);
  }
}