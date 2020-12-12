package com.java.silver06;

public class OverrideSub extends OverrideSuper {

	@Override
	public void printText(String s) {
		System.out.println("OverrideSub.printText : " + s);
	}

	@Override
	public void printNumber(int i) {
		System.out.println("OverrideSub.printNumber : " + i);
	}

}
