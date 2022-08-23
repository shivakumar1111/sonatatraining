package com.sonata.inf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.impl.EmpImpl;
import com.sonata.model.Employee;

public class Test2 {
	@Test
	public void addtest() {
		Employee e1=new Employee();
		e1.setEmpSal(100);
		EmpImpl e2=new EmpImpl();
	 Assertions.assertEquals(1200,e2.yearlySal(e1));
	}
	
	@Test
	public void addtest1() {
		Employee e1=new Employee();
		e1.setEmpSal(100);
		EmpImpl e2=new EmpImpl();
		Assertions.assertEquals(120,e2.yearlySal(e1));
	}

}
