package com.j2.w6;

import java.util.Scanner;

class Cal{
  int plus(int x, int y){
    int result= x + y;
    return result;
  }
  int minus(int x ,int y){
    int result= x - y;
    return result;
  }
  int multiple(int x, int y){
    int result= x * y;
    return result;
  }
  int division(int x ,int y){
    int result= x / y;
    return result;
  }
  void println(int x){
    System.out.println("result:"+x);
  } 
}