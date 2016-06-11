package com.j2.w14.proxy;

import java.rmi.*;

public class GumballMonitor{
  GumballMachineRemote m;
  public GumballMonitor(GumballMachineRemote m){
    this.m=m;
  }
  public void report(){
    try{
      System.out.println(m.getLocation());
      System.out.println(m.getCount());
      System.out.println(m.getState());
    }
    catch(RemoteException e){
      e.printStackTrace();
    }
  }
}