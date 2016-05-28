package com.j2.w12.Iterator.KoreanMenu;

public class KDinerMenu implements KMenu{
  static final int MAX_ITEMS=6;
  int numberOfItems=0;
  KMenuItem[] menuItems;
  public KDinerMenu(){
    menuItems=new KMenuItem[MAX_ITEMS];
    addItem("�����", 
            "�ѱ����� ���!! ���� �����", true, 5.99); 
    addItem("�����", 
            "������ �ո� �����", true, 2.99); 
    addItem("��ġ�", 
            "��ġ�� ��� �� ��ġ� ", false, 3.29); 
    addItem("ȣ����", 
            "����� ȣ���� �� ����� ȣ����",true, 3.05); 
    addItem("������ ����", 
            "���� �Ծ ���ִ� ������ �ո� ����!", true, 3.99); 
    addItem("�ø��", 
            "���� ���� ���ִ� �ø��", true, 3.89); 
    
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