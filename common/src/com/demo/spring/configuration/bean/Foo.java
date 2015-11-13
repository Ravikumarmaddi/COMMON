package com.spring.configuration.bean;

public class Foo {
	public String name = "ravi";

	public Foo() {
	   this.name ="adjlkfjas";
		// TODO Auto-generated constructor stub
	}

	public Foo(Bar bar) {
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("Foo init called.");
	}

	public void cleanup() {
		System.out.println("Foo cleanup called.");
	}
}
