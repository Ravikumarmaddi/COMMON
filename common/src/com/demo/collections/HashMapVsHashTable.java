package com.demo.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapVsHashTable {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> ht = new Hashtable<String, String>();

		hm.put(null, "");
		hm.put(null, null);

		ht.put(null, "");  // NullPointerException
		ht.put("ravi", null);    // NullPointerException

	}

}
