package com.j2.w11.templateBarista;

public class BaristaWithHook{
  public static void main(String[] args){
    CoffeeWithHook coffeeHook= new CoffeeWithHook();
    TeaWithHook teaHook= new TeaWithHook();
    CaramelWithHook caramelHook = new CaramelWithHook();
    System.out.println("Making Coffee...");
    coffeeHook.prepareRecipe();
    System.out.println("\nMaking Tea...");
    teaHook.prepareRecipe();
    System.out.println("\nMaking Caramel Macciato...");
    caramelHook.prepareRecipe();
  }
}
