package com.sonata.Myserviceimpisep8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sonata.MyService.Myservicestub;
import com.sonata.impi.Myserviceimpi;
import com.sonata.interf.Myserviceintf;

 class Myserviceimpistubsepp8 {

	@Test
	void test() {
		Myserviceintf my = new Myservicestub();
		Myserviceimpi mys = new Myserviceimpi(my);
		List<String> filterMySer = mys.retrieveuser("Dummy");
		assertEquals(2,filterMySer.size());
		
		
	}

}

 