package com.collections;

import java.util.ArrayList;

public class ShallowArrayListCopyDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("111");
		a.add("222");
		a.add("333");
		a.add("444");

		ArrayList<String> b = a;
		b.add("555");
		b.add("666");
		b.add("777");
		b.add("888");

		ArrayList<String> c = (ArrayList<String>) a.clone();
		c.add("555");
		c.add("666");
		c.add("777");
		c.add("888");

		System.out.println("A size: " + a.size() + "\nB size: " + b.size()+ "\nC size: " + c.size());

	}

}
