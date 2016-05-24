package com.j2.w11.templateBarista;

public class BeverageTestDrive {
  public static void main(String[] args) {    
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    System.out.println("\nMaking tea...");
    tea.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffee.prepareRecipe();
    System.out.println("\nMaking with Hook!!");
    TeaWithHook teaHook = new TeaWithHook();
    CoffeeWithHook coffeeHook = new CoffeeWithHook();
    System.out.println("\nMaking tea...");
    teaHook.prepareRecipe();
    System.out.println("\nMaking coffee...");
    coffeeHook.prepareRecipe();
  }
}