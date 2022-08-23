package com.sonata.impl;

import com.sonata.inf.Empinf;
import com.sonata.model.Employee;

public class EmpImpl implements Empinf {

	@Override
	public double yearlySal(Employee e1) {
		double ySal;
		ySal=e1.getEmpSal()*12;
		return ySal;
	}

	@Override
	public double appSal(Employee e1) {
		double aSal;
		if (e1.getEmpSal()<10000) {
			aSal=5000;
		}
		else {
			aSal=1000;
		}
		return aSal;
	}
	

}
