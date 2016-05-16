package com.j2.w11.Barista;

public class Coffee{
  void prepareRecipe(){
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Boiling Water");
  }
  public void brewCoffeeGrinds(){
    System.out.println("brewing Coffee Grinds");
  }
  public void pourInCup(){
    System.out.println("pour in Cup");
  }
  public void addSugarAndMilk(){
    System.out.println("add Sugar and Milk");
  }
}