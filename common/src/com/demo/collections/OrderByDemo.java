package com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderByDemo {
     public static void main(String args[]) {
      // create an array of string objs
      String init[] = { "One", "Two", "Three","Three","Three","One", "One", "Two", "Three" };
      
      // create one list
      List list = new ArrayList(Arrays.asList(init));
      
      System.out.println("List value before: "+list);
      
      // sort the list
      Collections.sort(list);
      
      System.out.println("List value after sort: "+list);
   }
}