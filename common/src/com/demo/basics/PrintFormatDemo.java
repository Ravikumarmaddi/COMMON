package com.demo.basics;

import java.util.ArrayList;

public class PrintFormatDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("aaaaa");
		a.add("bbbbbbb");
		a.add("cccc");
		a.add("dddddddddddddd");
		a.add("eeeeeeeeeeeeeeeeeeeeeeeeeeee");
		a.add("ffffffffffffffffffffffffffffffff");
		a.add("gggg");
		a.add("hhhh");
		a.add("iii");
		a.add("kkkkkkkkkkkkkkkk");
		int bigOne = 0;
		for (int i = 0; i < a.size(); i++) {
			if(bigOne < a.get(i).length())
				bigOne = a.get(i).length();
			
		}
		bigOne = bigOne +3;
		for (int i = 0; i < a.size(); i++) {
			System.out.format(" %-" +bigOne+"s", a.get(i));
			if((i + 1) % 3 == 0) System.out.println("\n");
		}
		//System.out.format(" %10s", "Ravi");
	}
}
