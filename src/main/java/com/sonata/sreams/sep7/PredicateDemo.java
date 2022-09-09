package com.sonata.sreams.sep7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate =new PredicateDemo();
		System.out.println(predicate.test(4));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(predicate).forEach(t-> System.out.println(t));

	}

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if(t%2==0) {
			return true;
		}else {
			return false;
		}
	}
}