package com.himline.annotation;

class Test {
	public void display() {
		System.out.println("Hello 1");
	}
}

public class Override1 extends Test {
	@Override
	public void dasplay() {
		System.out.println("Hello 2");
	}

	public static void main(String args[]) {
		Override1 d1 = new Override1();
		d1.display();
	}
}