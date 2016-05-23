package com.j2.w12.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu{
//  static final int MAX_ITEMS=3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu(){
   // menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT","zzz",true,2.9);
    addItem("soup","zzz",true,1.9);
    addItem("stake","zzz",false,5.9);
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
}