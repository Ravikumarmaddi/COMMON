package com.demo.basics;

public class EquelsDemo {

	public static void main(String[] args) {
	
		String a = new String("Janu");
		String b = new String("Janu");
		String c = "Janu";
		String d = "Janu";
		
		if(a == b) System.out.println("Test 1 a = b");
		if(a.equals(b)) System.out.println("Test 2 a = b");
		
		if(c == d) System.out.println("Test 3 c = d");
		if(c.equals(d)) System.out.println("Test 4 c = d");
		
		if(b == c) System.out.println("Test 5 b = c");
		if(b.equals(c)) System.out.println("Test 6 b = c");
	}

}
