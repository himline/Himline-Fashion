package com.himline.annotation;

class Test {
	@Deprecated
	public void display() {
		System.out.println("Hello 1");
	}
}

public class Deprecated1 {
	public static void main(String args[]) {
		Test t1 = new Test();
		t1.display();
	}
}