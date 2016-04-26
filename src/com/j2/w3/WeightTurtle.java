package com.j2.w3;

import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtle extends Turtle{
  protected int weight;
  public WeightTurtle(int w){
    weight=w;
    setColor(Color.black);
    setPenColor(Color.red);
  }
  public int getWeight(){
    return weight;
  }
}