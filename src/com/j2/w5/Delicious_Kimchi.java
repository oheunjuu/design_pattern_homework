package com.j2.w5;

public class Delicious_Kimchi{
  public static void main(String args[]){
    Kimchi kimchi = new waterkimchi();
    kimchi=new water(kimchi);
    kimchi=new baechoo(kimchi);
    System.out.println(kimchi.getDescription()
                      +" @spicy:"+kimchi.spicy());
    
    Kimchi kimchi2 = new mediumkimchi();
    kimchi2= new baechoo(kimchi2);
    kimchi2= new water(kimchi2);
    kimchi2= new pepper(kimchi2);
    System.out.println(kimchi2.getDescription()
                      +" @spicy:"+kimchi2.spicy()); 

    Kimchi kimchi3 = new hotkimchi();
    kimchi3= new baechoo(kimchi3);
    kimchi3= new water(kimchi3);
    kimchi3= new pepper(kimchi3);
    kimchi3= new pepper(kimchi3);
    System.out.println(kimchi3.getDescription()
                      +" @spicy:"+kimchi3.spicy()); 
    
  }
}