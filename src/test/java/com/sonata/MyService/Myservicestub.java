package com.sonata.MyService;

import java.util.Arrays;
import java.util.List;

import com.sonata.interf.Myserviceintf;

public class Myservicestub implements Myserviceintf {
	
	@Override
	public List<String> retrieveuser(String user){
		return Arrays.asList("learn spring mvc","learn spring","learn dance");
	}

}
