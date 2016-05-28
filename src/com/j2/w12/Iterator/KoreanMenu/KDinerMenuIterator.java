package com.j2.w12.Iterator.KoreanMenu;

public class KDinerMenuIterator implements KIterator{
  KMenuItem[] items;
  int position=0;
  public KDinerMenuIterator(KMenuItem[] items){
    this.items=items;
  }
  public Object next(){
    KMenuItem menuItem=items[position];
    position=position + 1;
    return menuItem;
  }
  public boolean hasNext(){
    if (position >=items.length || items[position]==null){
      return false;
    }else{
      return true;
    }
  }
}
 
    