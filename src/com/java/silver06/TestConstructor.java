package com.java.silver06;

public class TestConstructor {
	public static void main(String[] args) {
		Child child1 = new Child();
		Child child2 = new Child(10);
	}
}

class Parent {
	Parent() {System.out.println("Parent()");}
	Parent(int a) {System.out.println("Parent(int a)");}
}

class Child extends Parent {
	Child() {System.out.println("Child()");}
	Child(int a) {System.out.println("Child(int a)");}
}
