package com.sonata.sreams.sep7;

import java.util.List;
import java.util.stream.Collectors;

public class TestService {
	public static List<Employee> evaluateTax(){
		return DataBaseEmp.getEmployee().stream().filter(emp->emp.getEmpSal()>5000).collect(Collectors.toList());
				
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(evaluateTax());

	}

}
