package com.j2.w12.sort;

import java.util.Arrays;
import java.util.ArrayList;

public class DuckSortTestDrive {
  public static void main(String[] args){
    Duck[] ducks={new Duck("eunju",10), 
      new Duck("oh",12),
      new Duck("dohyun",14),
      new Duck("Baek",11)};
    System.out.println("Before sorting:");
    for (int i=0; i<ducks.length; i++){
      System.out.println(ducks[i].name + " " +ducks[i].weight);
    }
    Arrays.sort(ducks);
    System.out.println("After sorting:");
    for (int i=0; i<ducks.length; i++){
      System.out.println(ducks[i].name + " " +ducks[i].weight);
    }
    System.out.println();
    
    Duck[] myDucks={new Duck("Sang",8),new Duck("Myung",2),new Duck("uni",10)};
    System.out.println("Before sorting");
    for (int i=0; i<myDucks.length; i++){
      System.out.println(myDucks[i].name + " " +myDucks[i].weight);
    }
    Arrays.sort(myDucks, new DuckComparator());
    System.out.println("After sorting:");
    for (int i=0; i<myDucks.length; i++){
      System.out.println(myDucks[i].name + " " +myDucks[i].weight);
    }
  }
}