package com.sonata.sreams.sep7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1,Employee o2) {
		return (int) (o1.getEmpSal()-o2.getEmpSal());
	}
}

public class SortExampleEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = DataBaseEmp.getEmployee();
		
		//traditional way
		Collections.sort(employee, new MyComparator());
		System.out.println(employee);

		
		// lambda expression way
		Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()));
		System.out.println(employee);
		
		//using stream api sort method

		employee
		.stream()
		.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}
