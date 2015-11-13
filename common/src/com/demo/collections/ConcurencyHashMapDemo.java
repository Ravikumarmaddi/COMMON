package com.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurencyHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> c = new ConcurrentHashMap<String, String>();
		c.put("ravi","ravi");
		c.put("bbb","ccc");
		c.put("ccc","ddd");
		c.put("ddd","ddd");
		c.put("eee","ddd");
		c.put("fff","ddd");
		c.put("ggg","ddd");
		c.put("hhh","ddd");
		c.put("iii","ddd");
		c.put("jjj","ddd");
		c.put("kkk","ddd");
		c.put("lll","ddd");
		c.put("mmm","ddd");
		c.put("nnn","ddd");
		c.put("ooo","ddd");
		c.put("ppp","ddd");
		c.put("qqq","ddd");
		c.put("sss","ddd");
		c.put("ttt","ddd");
		c.put("uuu","ddd");
		c.put("vvv","ddd");
		c.put("www","ddd");
		c.put("xxx","ddd");
		c.put("yyy","ddd");
		c.put("zzz","ddd");
		
		System.out.println("print");

	}

}
