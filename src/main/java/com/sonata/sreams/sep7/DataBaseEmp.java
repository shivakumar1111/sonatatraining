package com.sonata.sreams.sep7;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {
	
	public static List<Employee>getEmployee(){
		List<Employee>List = new ArrayList();
		List.add(new Employee(123,"shiva","it",5000));
		List.add(new Employee(124,"anil","cival",7000));
		List.add(new Employee(125,"shiva","dedence",4000));
		List.add(new Employee(126,"gagan","socal",9000));
		List.add(new Employee(127,"vasu","training",8000));
		return List;
	}

}
