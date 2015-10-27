package com.himline.fashion;

public class Test {
	public void display() {
		System.out.println("Hello 1");
	}


public class Demo extends Test {
	@Override
	public void dasplay() {
		System.out.println("Hello 2");
	}

	public void main(String args[]) {
		Demo d1 = new Demo();
		d1.display();
	}
}
}