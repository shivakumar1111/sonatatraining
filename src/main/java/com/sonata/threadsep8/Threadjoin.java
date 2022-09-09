package com.sonata.threadsep8;

public class Threadjoin extends Thread {
	
	Threadjoin(String s){
		super(s);
	}
	public void run() {
		for (int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
				System.out.println("thread executing " + Thread.currentThread());
			}catch(InterruptedException e) {System.out.println(e);}
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Threadjoin t1=new Threadjoin("one");
		Threadjoin t2=new Threadjoin("two");
		Threadjoin t3=new Threadjoin("three");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();

	}

}
