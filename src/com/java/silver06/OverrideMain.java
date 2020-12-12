package com.java.silver06;

public class OverrideMain {

	public static void main(String[] args) {

		OverrideSub subObj = new OverrideSub();
		subObj.printNumber(10);
		subObj.printText("うんこ");

		OverrideSuper superObj = new OverrideSuper();
		superObj.printNumber(150);
		superObj.printText("めっちゃうんこ");

	}

}
