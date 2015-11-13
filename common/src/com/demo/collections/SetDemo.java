package com.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void hashSetDemo() {
		HashSet<String> hs = new HashSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		System.out.println("Is HashSet empty? " + hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		System.out.println("Size of the HashSet: " + hs.size());
		System.out.println("Does HashSet contains first element? "
				+ hs.contains("first"));
	}

	public static void treeSetDemo() {
		TreeSet<String> hs = new TreeSet<String>();
		// add elements to HashSet
		hs.add("first");
		hs.add("second");
		hs.add("third");

		System.out.println(hs);
		System.out.println("Is HashSet empty? " + hs.isEmpty());
		hs.remove("third");
		System.out.println(hs);
		System.out.println("Size of the HashSet: " + hs.size());
		System.out.println("Does HashSet contains first element? "
				+ hs.contains("first"));
	}
}