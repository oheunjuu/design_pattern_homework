package com.j2.w4;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.event.MouseMotionAdapter;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener(){
    addMouseListener (new MouseAdapter(){
      public void mousePressed(MouseEvent e){
        Point2D.Double p;
        //p=(Point2D.Double)e.getPoint()
        double d;
        double w;
        p = toTurtlePos(e.getPoint());
        d = distance(p);
        w = towards(p);
        heading(w);
        forward(d);
        setStatusText("moving to "+p.toString());
      }
      public void mouseReleased(MouseEvent e){
        setStatusText("Released");
      }      
    });
    addMouseMotionListener(new MouseMotionAdapter(){
      public void mouseDragged(MouseEvent e){
        Point2D.Double p;
        //p=(Point2D.Double)e.getPoint()
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("dragging to "+p.toString());
      }
    });
  }
}

public class TurtleMouseObserverMain{
  public static void main(String[] args){
    TurtleMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Click or Drag!");
  }
}
