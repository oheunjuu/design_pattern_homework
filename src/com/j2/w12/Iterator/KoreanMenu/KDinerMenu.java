package com.j2.w12.Iterator.KoreanMenu;

public class KDinerMenu implements KMenu{
  static final int MAX_ITEMS=6;
  int numberOfItems=0;
  KMenuItem[] menuItems;
  public KDinerMenu(){
    menuItems=new KMenuItem[MAX_ITEMS];
    addItem("ºñºö¹ä", 
            "ÇÑ±¹ÀÎÀº ¹ä½É!! ÀüÁÖ ºñºö¹ä", true, 5.99); 
    addItem("µÈÀåÂî°³", 
            "¾ö¸¶ÀÇ ¼Õ¸À µÈÀåÂî°³", true, 2.99); 
    addItem("±èÄ¡Âî°³", 
            "ÂüÄ¡°¡ µë»Ò µé¾î°£ ±èÄ¡Âî°³ ", false, 3.29); 
    addItem("È£¹ÚÁ×", 
            "À¯±â³ó È£¹ÚÀÌ µé¾î°£ ´ã¹éÇÑ È£¹ÚÁ×",true, 3.05); 
    addItem("¾ö¸¶ÀÇ Áý¹ä", 
            "¾ðÁ¦ ¸Ô¾îµµ ¸ÀÀÖ´Â ¾ö¸¶ÀÇ ¼Õ¸À Áý¹ä!", true, 3.99); 
    addItem("³Ã¸ð¹Ð", 
            "´õ¿î ¿©¸§ ¸ÀÀÖ´Â ³Ã¸ð¹Ð", true, 3.89); 
    
  }
  
  public void addItem(String name, String description, boolean v, double price){
    KMenuItem menuItem=new KMenuItem(name,description,v,price);
    if(numberOfItems>=MAX_ITEMS){
      System.out.println("Oops! Menu is full. Can't add item anymore.");
    }else{
      menuItems[numberOfItems]=menuItem;
      //menuItems[numberOfItems]=menuItem;
      numberOfItems=numberOfItems+1;
    }
  }
  public KMenuItem[] getMenuItems(){
    return menuItems;
  }
  public KIterator createIterator(){
    return new KDinerMenuIterator(menuItems);
  }
}