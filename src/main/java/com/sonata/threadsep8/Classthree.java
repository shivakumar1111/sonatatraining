package com.sonata.threadsep8;

public class Classthree extends Thread{
	Classone d;
	Classthree(Classone d){
		this.d=d;
	}
	public void run()
	{
		d.print(15);
	}

}
