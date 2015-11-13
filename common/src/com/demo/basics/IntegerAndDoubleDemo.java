package com.demo.basics;

public class IntegerAndDoubleDemo {

	public static void main(String[] args) {
		get(1, 1);
		get(1.1, 1.1);
		get(11L, 11L);
		get(11L, 11L);
	}

	private static void get(Integer a, Integer b) {

		System.out.println(a + "" + b);
	}

	private static void get(Long a, Long b) {

		System.out.println(a + "" + b);
	}

	private static void get(Float a, Float b) {

		System.out.println(a + "" + b);
	}

	private static void get(Double a, Double b) {

		System.out.println(a + "" + b);
	}

	private static void get(int a, int b) {

		System.out.println(a + "" + b);
	}

	private static void get(long a, long b) {

		System.out.println(a + "" + b);
	}

	private static void get(float a, float b) {

		System.out.println(a + "" + b);
	}

	private static void get(double a, double b) {

		System.out.println(a + "" + b);
	}

}
