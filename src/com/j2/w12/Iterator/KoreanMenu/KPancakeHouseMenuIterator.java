package com.j2.w12.Iterator.KoreanMenu;

import java.util.ArrayList;

public class KPancakeHouseMenuIterator implements KIterator{
  ArrayList items;
  int position = 0;
  public KPancakeHouseMenuIterator (ArrayList items){
    this.items=items;
  }
  public Object next(){
    Object object = items.get(position);
    position=position+1;
    return object;
  }
  public boolean hasNext(){
    if (position >=items.size()){
      return false;
    }else{
      return true;
    }
  }
}