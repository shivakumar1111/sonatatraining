package com.sonata.day4;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;




import org.junit.jupiter.api.Test;

public class CallTest {
	@Test
	public void addTest() {
		Calculater e1 = new Calculater();
		Assertions.assertEquals(4,e1.add(2, 2));
	}
	@Test
	public void divTest() {
		Calculater e1 = new Calculater();
		int x= e1.div(1, 1);
		assertThrows(ArithmeticException.class,()->e1.div(1,0),"it is an error");
		
	}

}
