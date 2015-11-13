package com.demo.collections.streams;

import java.util.Arrays;
import java.util.List;
//  w  ww  . java 2  s  .c o m
public class InternalIteratorDemo {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 /*   int sum = numbers.stream()
        .filter(n -> n % 2  == 1)
        .map(n  -> n * n)
        .reduce(0, Integer::sum);

    System.out.println(sum);*/
  }
}