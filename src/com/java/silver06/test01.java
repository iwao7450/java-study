package com.java.silver06;

public class test01 {

	public static void main(String[] args) {
		// サブクラスをインスタンス化
		Sub sub = new Sub();
		// スーパークラスで定義したメソッドの呼び出し
		System.out.println("名前：" + sub.getName());
		// サブクラスで定義したメソッドの呼び出し
		System.out.println("サブの名前：" + sub.getSubName());
	}

}
