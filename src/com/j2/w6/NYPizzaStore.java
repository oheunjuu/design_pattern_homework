package com.j2.w6;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    if (type.equals("cheese")){
      return new NYStyleCheesePizza();
    }else return null;
  }
}
 
