package com.j2.w12.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
//  static final int MAX_ITEMS=3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu(){
    menuItems= new ArrayList();
    // menuItems=new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT", 
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99); 
    addItem("BLT", 
            "Bacon with lettuce & tomato on whole wheat", false, 2.99); 
    addItem("Soup of the day", 
            "Soup of the day, with a side of potato salad", false, 3.29); 
    addItem("Hotdog", 
            "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05); 
    addItem("Steamed Veggies and Brown Rice", 
            "Steamed vegetables over brown rice", true, 3.99); 
    addItem("Pasta", 
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89); 
    
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem=new MenuItem(name,description,v,p);
    //if(numberOfItems>=MAX_ITEMS){
     // System.out.println("Error");
    //}else{
     // menuItems[numberOfItems]=menuItem;
     // numberOfItems=numberOfItems+1;
    //menuItems[0]=menuItem;
    //}
    menuItems.add(menuItem);
  }
  public ArrayList getMenuItems(){
    return menuItems;
  }
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
  public String toString(){
    return "Pancake house Menu";
  }
}