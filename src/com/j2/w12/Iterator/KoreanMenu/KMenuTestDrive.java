package com.j2.w12.Iterator.KoreanMenu;

import java.util.*;

public class KMenuTestDrive{
  public static void main(String[] args){
    KPancakeHouseMenu pancakeHouseMenu = new KPancakeHouseMenu();
    KDinerMenu dinerMenu= new KDinerMenu();
    
    KoreanWaitress waitress = new KoreanWaitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}