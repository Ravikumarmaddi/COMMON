package com.demo.string;

public class FormatDemo {
	public static void main(String[] args) {
		String s = "aaaagggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggga";
		System.out.format("%-40s %-10s%s%n", s.length() > 35 ? s.substring(0, 35): s,"sri","ravi");
	}
}
