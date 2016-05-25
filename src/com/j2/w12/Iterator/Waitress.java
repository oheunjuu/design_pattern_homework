package com.j2.w12.Iterator;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;
  
  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }
  public void printMenu() {
    Iterator pancakeIterator = pancakeHouseMenu.createIterator();
    printMenu(pancakeIterator);
    System.out.println();
    Iterator dinerIterator = dinerMenu.createIterator();
    printMenu(dinerIterator);
  }
  public static void printMenu(Iterator iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = (MenuItem)iterator.next();
      //System.out.print(menuItem.getName()+" " ); 
      //System.out.println(menuItem.getPrice()+" ");
      //System.out.println(menuItem.getDescription()+" ");
      System.out.println(menuItem.toString());
    }
  }
}
