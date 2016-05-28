package com.j2.w12.Iterator.KoreanMenu;

public class KoreanWaitress {
  KPancakeHouseMenu pancakeHouseMenu;
  KDinerMenu dinerMenu;
  
  public KoreanWaitress(KPancakeHouseMenu pancakeHouseMenu, KDinerMenu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }
  public void printMenu() {
    KIterator pancakeIterator = pancakeHouseMenu.createIterator();
    printMenu(pancakeIterator);
    System.out.println();
    KIterator dinerIterator = dinerMenu.createIterator();
    printMenu(dinerIterator);
  }
  public static void printMenu(KIterator iterator) {
    while (iterator.hasNext()) {
      KMenuItem menuItem = (KMenuItem)iterator.next();
      System.out.print(menuItem.getName()+" " ); 
      System.out.println(menuItem.getPrice()+" ");
      System.out.println(menuItem.getDescription()+" ");
      //System.out.println(menuItem.toString());
    }
  }
}
