package com.demo.oops;

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B");
	}
}

class C extends B {
	C() {
		System.out.println("C");
	}
}

public class SuperSubclassDemo  {
	
	public static void main(String args[]) {
		C c1 = new C();
		System.out.println();
		B b1 = new B();
		System.out.println();
		A a1 = new A();
		System.out.println();
		
		A c2 = new C();
		System.out.println();
		A b2 = new B();
		//OUTPUT
		/*
		A
		B
		C

		A
		B

		A

		A
		B
		C

		A
		B
		*/
	}
}
