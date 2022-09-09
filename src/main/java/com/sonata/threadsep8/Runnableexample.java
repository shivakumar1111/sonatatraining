package com.sonata.threadsep8;

public class Runnableexample implements Runnable{
	public void run() {
		try {
			System.out.println("thread " + Thread.currentThread().getId()+ "is running");
		}catch(Exception e) {System.out.println(e);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnableexample r1 = new Runnableexample();
		Thread t1 = new Thread(r1);
		t1.start();

	}

}
