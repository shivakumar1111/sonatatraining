package com.sonata.main;

import com.sonata.impl.EmpImpl;
import com.sonata.model.Employee;

public class EmpExcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setEmpId(123);
		e1.setEmpName("shiva");
		e1.setEmpSal(100);
		
		EmpImpl e2 =new EmpImpl();
		System.out.println(e2.yearlySal(e1));
		System.out.println(e2.appSal(e1));
		

	}

}