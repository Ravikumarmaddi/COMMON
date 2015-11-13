package com.demo.string;

public class OverPrintDemo {
	public static void main2(String[] args) {
		System.out.println("ssssssssssssss");
		System.out.println("1%\r");
		//System.out.println(String.format("[#                    ] 1%\r"));
		System.out.print("ddddddddddddddddddd");
		
	}
	public static void main(String[] args) {
		System.out.println("Line 1 (first variant)");
		System.out.print("\33[1A\33[2K");
		System.out.println("Line 1 (second variant)");
	}

}
