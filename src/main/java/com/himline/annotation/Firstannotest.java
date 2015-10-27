package com.himline.annotation;

public class Firstannotest {
	@Firstanno(age = 21, value = "yuvraj")
	void getName() {
		return;
	}

	public static void main(String[] args) {
		Firstannotest ft = new Firstannotest();
		ft.getName();

	}
}
