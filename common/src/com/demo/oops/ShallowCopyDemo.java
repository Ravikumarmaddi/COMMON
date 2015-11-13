package com.demo.oops;

public class ShallowCopyDemo {
	public static void main(String[] args) {
		ShallowCopyDemo demo = new ShallowCopyDemo();
		demo.sahllowCopyDemo();
	}
	
	void sahllowCopyDemo(){
		Emp a = new Emp("a","b");
		Emp b = a;
		System.out.println(a.a);
		System.out.println(b.a);
		a.a = "c";
		System.out.println(a.a);
		System.out.println(b.a);
	}
	class Emp {
		String a;
		String b;

		public Emp(String a, String b) {
			super();
			this.a = a;
			this.b = b;
		}

		
	}
}

