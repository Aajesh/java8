package com.java.java8feature;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Ram
 * void forEachOrdered(Consumer<? super T> action)  
 *
 */
public class TestForEachOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky"); 
	        System.out.println("------------Iterating by passing lambda expression---------------"); 

	  gamesList.stream().forEachOrdered(name->System.out.println(name));
	  gamesList.stream().forEachOrdered(System.out::println);
		
	
	}

}
