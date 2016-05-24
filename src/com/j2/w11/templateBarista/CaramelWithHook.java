package com.j2.w11.templateBarista;

import java.io.*;

public class CaramelWithHook extends CaffeineBeverageWithHook{
  public void brew(){ 
    System.out.println("Drippint Coffee through a filter."); 
  } 
  public void addCondiments(){ 
    System.out.println("Adding vanilla syrup, espresso, milk, caramel."); 
  } 
  public boolean customerWantsCondiments(){ 
    String answer=getUserInput(); 
    if (answer.toLowerCase().startsWith("y")){ 
      return true; 
    } 
    else{ 
      return false; 
    } 
  } 
  private String getUserInput() { 
    String answer = null; 
    System.out.print("Would you like lemon with your tea (y/n)? "); 
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
    try { 
      answer = in.readLine(); 
    } catch (IOException ioe) { 
      System.err.println("IO error trying to read your answer"); 
    } 
    if (answer == null) { 
      return "no"; 
    } 
    return answer; 
  } 
} 