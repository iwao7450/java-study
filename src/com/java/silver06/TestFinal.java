package com.java.silver06;

public class TestFinal {
	public static void main(String[] args) {
		SubSub subsub = new SubSub();
		subsub.methodA();
	}
}

class SuperSuper {
	void methodA(){System.out.println("SuperA.methodA");}
}
// このクラスを元にサブクラスは作成できない（継承できない）
final class FinalSuperA {
	void methodA() {System.out.println("FinalSuperA.methodA");}
}
class FinalSuperB {
	// このメソッドをサブクラスでオーバーライドできない
	final void methodA() {System.out.println("FinalSuperB");}
}
class SubSub extends SuperSuper {
	@Override
	void methodA() {System.out.println("SubA.methodA");}
}
// finalクラスから継承できないため、コメントアウトを外すとコンパイルエラー
// class SubB extends FinalSuperA {}
class SubC extends FinalSuperB {
	//親クラスのメソッドがfinal修飾子付いてるため、オーバーライドできない
	//void methodA() {System.out.println("SubC.methodA");}
}