package com.sonata.threadsep8;

class hi extends Thread{
	public void run() {
		try {
			for (int i=1;i<5;i++) {
				System.out.println("hi");
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {System.out.println(e);}
	}
	
}
class hello extends Thread{
	public void run() {
		for (int i=1;i<5;i++) {
			System.out.println("hello");
			try {Thread.sleep(1000);}catch(InterruptedException e) {System.out.println(e);}
	}
		
	}
}

public class Threadtest {
	

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		
		hi obj1= new hi();
		hello obj2 = new hello();
		
		obj1.start();
		obj2.start();
		
	}

}
