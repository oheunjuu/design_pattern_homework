package com.j2.w10.adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.*;

public class IteratorEnumerationTestDrive {
 public static void main (String[] args) {
  ArrayList arr = new ArrayList(Arrays.asList(args));
  Enumeration enumeration = new IteratorEnumeration(arr.iterator());
  while (enumeration.hasMoreElements()) {
   System.out.println(enumeration.nextElement());
  }
 }
}