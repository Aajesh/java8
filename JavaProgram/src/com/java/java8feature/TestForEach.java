package com.java.java8feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


/**
 * @author Ram
 * default void forEach(Consumer<super T>action)  
 *
 */
public class TestForEach {
	public static void main(String[] args) {
		
	List<String> gamesList = new ArrayList<String>();  
    gamesList.add("Football");  
    gamesList.add("Cricket");  
    gamesList.add("Chess");  
    gamesList.add("Hocky");  
    System.out.println("------------Iterating by passing lambda expression--------------"); 
	
  //  gamesList.forEach(System.out::println);   //method refernce 
    
    gamesList.forEach(name->System.out.println(name));  //lambda 
    
    
    
    System.out.println("==============hello========================");
    
    
    
    
    
    
  /*  ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    Consumer<Integer> action = System.out::println;
    numberList.stream().filter(n -> n%2  == 0).forEach( action );
    */
    
    
    System.out.println("==============hello========================");
    
    HashMap<String, Integer> map = new HashMap<>();
    
    map.put("A", 1);
    map.put("B", 2);
    map.put("C", 3);
     
    //1. Map entries
    Consumer<Map.Entry<String, Integer>> action = System.out::println;
     
    map.entrySet().forEach(action);
     
    //2. Map keys
    Consumer<String> actionOnKeys = System.out::println;
     
    map.keySet().forEach(actionOnKeys);
     
    //3. Map values
    Consumer<Integer> actionOnValues = System.out::println;
     
    map.values().forEach(actionOnValues);
    
	
	}
	
}//end of the TesTForEach 
