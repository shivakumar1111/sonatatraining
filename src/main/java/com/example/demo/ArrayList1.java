package com.example.demo;

//import com.sonata.Interface.ArrayList;
import java.util.*;
public class ArrayList1 {
	ArrayList arr = new ArrayList();
	
	public void add(int element) {
		arr.add(element);
	}
	
	public void delete(int element) {
		arr.remove(element);
	}
	int getSize() {
		return arr.size();
	}

}
