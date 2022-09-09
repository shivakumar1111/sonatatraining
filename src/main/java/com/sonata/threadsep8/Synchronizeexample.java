package com.sonata.threadsep8;

public class Synchronizeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classone s1 = new Classone();
		Classtwo ob = new Classtwo(s1);
		Classthree obj = new Classthree(s1);
		ob.start();
		obj.start();

	}

}
