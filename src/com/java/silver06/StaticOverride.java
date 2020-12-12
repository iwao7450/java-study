package com.java.silver06;

public class StaticOverride {

	public static void main(String[] args) {
		SubA obj = new SubA();
		obj.methodA();
		obj.methodB();
	}
}

class SuperA {
	void methodA() {System.out.println("SuperA.methodA");}
	static void methodB() {System.out.println("SuperA.methodB");}
}

class SubA extends SuperA {
	@Override
	void methodA() {System.out.println("SubA.methodA");}
	// staticメソッドはオーバーライドできない
	static void methodB() {System.out.println("SubA.methodB");}
}