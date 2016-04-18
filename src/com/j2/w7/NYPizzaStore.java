package com.j2.w7;

public class NYPizzaStore extends PizzaStore{
  protected Pizza createPizza(String item){
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
    if(item.equals("cheese")){
      pizza=new CheesePizza(ingredientFactory);
      pizza.setName("NY style cheese Pizza");
    }
    return pizza;
  }
}