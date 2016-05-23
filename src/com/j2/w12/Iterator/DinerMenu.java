package com.j2.w12.Iterator;

public class DinerMenu{
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT","zzz",true,3.9);
    addItem("apple","zzz",true,0.9);
    addItem("soup","zzz",true,4.9);
  }
  
  public void addItem(String name, String description, boolean v, double price){
    MenuItem menuItem=new MenuItem(name,description,v,price);
    if(numberOfItems>=MAX_ITEMS){
      System.out.println("Error");
    }else{
      menuItems[0]=menuItem;
      numberOfItems=numberOfItems+1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
}