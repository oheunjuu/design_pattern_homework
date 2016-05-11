package com.j2.w10.Facade;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
    Amplifier amp= new Amplifier("Eunju's Amplifier");
    Tuner tuner=new Tuner("Eunju's tuner",amp);
    DvdPlayer dvd=new DvdPlayer("Eunju's funny DVD",amp);
    Projector projector=new Projector("Eunju's projector",dvd);
    
    HTFacade ht=new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("'Captain America movie '");
    ht.endMovie();
  }
}
