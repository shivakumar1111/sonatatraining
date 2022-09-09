package com.sonata.Myserviceimpisep8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.dao.Employeeimpli;
import com.sonata.model.Employee;

class Employeetest {
	Employee e1 = new Employee();
	Employeeimpli e2 = new Employeeimpli();

	@Test
	public void test() {
		
		
	        e1.setEmpid(14);
	        e1.setEmpname("anil");
	        e1.setEmpsal(5000.00);
	        assertEquals(0, e2.save(e1));
	    }

	@Test
	public void test1() {
		
		
	        e1.setEmpid(20);
	        e1.setEmpname("vasu");
	        e1.setEmpsal(5000.00);
	        assertEquals(1, e2.save(e1));
	    }
		
		
	
	}



