package com.himline.fashion;

import java.util.Scanner;

public class TestJava {
	static String[] arraylist = new String[3];
	public static void main(String[] args) {
		for (int i = 0; i < arraylist.length; i++) {
			System.out.println("enter name ");
			Scanner sc = new Scanner(System.in);
			arraylist[i] = sc.nextLine();
			// System.out.println(sc.nextLine());
			// System.out.println(arraylist[i]);
		}
		System.out.println(" name to be searched:");                                                                         
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arraylist.length; i++) {

			if (sc.nextLine().toString().equals(arraylist[i].toString()))
				System.out.println("found " + i + "th");

		}

	}

}
