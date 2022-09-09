package com.sonata.threadsep8;

public class Classone {
	public synchronized void print(int n)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {Thread.sleep(500);
			
			}catch(InterruptedException e) {System.out.println(e);}
		}
	}

}
