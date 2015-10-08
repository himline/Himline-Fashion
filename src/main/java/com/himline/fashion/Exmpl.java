package com.himline.fashion;

public class Exmpl {
	public String amar(){
		return "no arguments";
	}
	public String amar(int x){
		return "one arguments";
		//
	}
	public int amar(String x){
		return 0;
	}
	public String amar(int x , int y){
		return "two arguments";
	}
	public String amar(int x , int y , int z){
		return "three arguments";
	}
	public static void main(String[] args) {
		Exmpl ov = new Exmpl();
		System.out.println(ov.amar());
		System.out.println(ov.amar(1));
		System.out.println(ov.amar(1,2));
		System.out.println(ov.amar(1,2,3));
		System.out.println(ov.amar("amm"));
	}

	}


