package com.example.demo;

public class Calculater {
	public int div(int a,int b) {
		return a/b;
	}
	public int add(int a,int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		Calculater c1 = new Calculater();
		System.out.println(c1.div(5, 5));
		System.out.println(c1.add(5, 5));
		
	}

}
