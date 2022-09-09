package com.sonata.impi;

import java.util.ArrayList;
import java.util.List;

import com.sonata.interf.Myserviceintf;

public class Myserviceimpi {
	
	private Myserviceintf myService;
	
	
	Myserviceimpi(){}
	public Myserviceimpi(Myserviceintf mySer){
		this.myService=mySer;
	}

	public List<String> retrieveuser(String user){
		List<String> filteredVale = new ArrayList<String>();
		List<String> allToDo = myService.retrieveuser(user);
		for(String all : allToDo) {
			if (all.contains("spring")) {
				filteredVale.add(all);
			}
		}
		return filteredVale;
	}
}
