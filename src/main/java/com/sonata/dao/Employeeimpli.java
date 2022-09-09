package com.sonata.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.model.Employee;

public class Employeeimpli implements Employeintf{
	Dbconnection db = new Dbconnection();
	int row = 0;

	@Override
	public int save(Object object) {
		Employee p1= (Employee) object;
	    try {
	    	PreparedStatement s1 = db.getConnection().prepareStatement("insert into employee values(?,?,?)");
	    	
	    	s1.setInt(1,p1.getEmpid());
	    	s1.setString(2,p1.getEmpname());
	    	s1.setDouble(3, p1.getEmpsal());
	    	row = s1.executeUpdate();
	    	db.closeConnection();
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
		return row;
	}

	/*@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
