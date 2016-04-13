package com.j2.w6;

import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
    Scanner Cal=new Scanner(System.in);
    Cal scan=new Cal();
    
    int num1;
    int num2;
    int res;
    String operator;
    
    
    System.out.println("insert number:");
    num1=Cal.nextInt();
    num2=Cal.nextInt();
    
    System.out.println("insert operator:");
    Cal.nextLine();
    operator=Cal.nextLine();
    
    switch(operator){
      case "+":
        res=scan.plus(num1,num2);
        scan.println(res);
        break;
      case "-":
        res=scan.minus(num1,num2);
        scan.println(res);
        break;
      case "*":
        res=scan.multiple(num1, num2);
        scan.println(res);
        break;
      case "/":
        res=scan.division(num1,num2);
        scan.println(res);
        break;
      default:
        System.out.println("insert again: ");
        break;
    }
  }
}