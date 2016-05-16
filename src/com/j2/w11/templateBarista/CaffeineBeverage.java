package com.j2.w11.templateBarista;

public abstract class CaffeineBeverage{
  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }
  abstract void brew();
  abstract void addCondiments();
  
  void boilWater(){
    System.out.println("boiling water...");
  }
  void pourInCup(){
    System.out.println("pouring into cup");
  }
}
