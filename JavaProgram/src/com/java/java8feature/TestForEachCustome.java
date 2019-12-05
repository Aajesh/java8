package com.java.java8feature;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class TestForEachCustome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
	
		
		Consumer<Map.Entry<String, Integer>> action = entry -> 
		{ 
		    System.out.println("Key is : " + entry.getKey()); 
		    System.out.println("Value is : " + entry.getValue()); 
		}; 
	
	
		map.entrySet().forEach(action);
		
	}
	

}
