package com.sonata.threadsep8;

public class Classtwo extends Thread{
	Classone d;
	Classtwo(Classone d)
	{
		this.d=d;
	}
	public void run()
	{
		d.print(5);
	}

}
