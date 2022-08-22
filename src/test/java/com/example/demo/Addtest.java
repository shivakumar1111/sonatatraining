package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Addtest {

	@Test
	void addTest1() {
		Addinterface add = new DefaultAddition();
		assertEquals(20, add.add(10, 10));
	}
	
	@Test
	void addTest2() {
		Addinterface add = new DefaultAddition();
		assertEquals(0, add.add(1, -1));
	}
	
	@Test
	void addTest3() {
		Addinterface add = new DefaultAddition();
		assertEquals(1, add.add(2, 5));
	}
	
	@Test
	void addTest4() {
		Addinterface add = new DefaultAddition();
		assertEquals(10, add.add(5, 5));
	}

}