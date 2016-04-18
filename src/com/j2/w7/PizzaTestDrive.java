package com.j2.w7; 


public class PizzaTestDrive { 
  public static void main(String[] args) { 
    PizzaStore nyStore = new NYPizzaStore(); 
    PizzaStore chicagoStore = new ChicagoPizzaStore(); 
    
    Pizza pizza = nyStore.orderPizza("cheese"); 
    System.out.println("Eunju ordered a " + pizza + "\n"); 
    
    pizza = chicagoStore.orderPizza("cheese"); 
    System.out.println("Ju ordered a " + pizza + "\n"); 
  } 
} 
