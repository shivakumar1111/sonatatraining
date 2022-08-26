package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayTest {
	@Test
	public void testAdd() {
		ArrayList1 a1 = new ArrayList1();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		int size=a1.getSize();
		System.out.println(size);
	    assertEquals(7,size);
		
	}

}
