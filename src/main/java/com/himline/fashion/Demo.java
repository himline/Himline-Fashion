package com.himline.fashion;

class Deprecated1 {
	@Deprecated
	public void display() {
		System.out.println("Hello 1");
	}
}

public class Demo {
	public static void main(String args[]) {
		Test t1 = new Test();
		t1.display();
	}
}
