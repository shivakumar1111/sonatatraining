package com.sonata.dao;

import com.sonata.model.Employee;

public class App {

	public static void main(String[] args) {
		Employee s1= new Employee();
		s1.setEmpid(14);
		s1.setEmpname("gagan");
		s1.setEmpsal(3000);
		
		Employeeimpli p1 = new Employeeimpli();
		int a1 = p1.save(s1);
		System.out.println(a1);

	}

}
