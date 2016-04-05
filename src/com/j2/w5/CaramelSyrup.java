package com.j2.w5;

public class CaramelSyrup extends CondimentDecorator{
  public CaramelSyrup(Beverage beverage){
    this.beverage=beverage;
  }
  public String getDescription(){
    return beverage.getDescription()+", Caramel Syrup ";
  }
  public double cost(){
    return .55 + beverage.cost();
  }
}