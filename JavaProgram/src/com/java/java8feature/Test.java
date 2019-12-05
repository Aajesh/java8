package com.java.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test{
	
	public static void main(String[] args) {
		System.out.println("Test - main()------");
		
		
		Interf i=()-> System.out.println("interf implement--- :  ");
		i.methodOne();
		
		
		
		List<String> list=new ArrayList<String>();
		list.add("ajesh");
		list.add("atul");
		list.add("satish");
		list.add("jay");
		list.add("harsh");
		
		
		
		
		
		List<String> upped = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upped);
		
		
		
		List<String> l2 = list.stream().map(s ->s.toUpperCase()).collect(Collectors.toList()); 
		System.out.println(l2);
		
		
		Function<String, String> function=s->s.toUpperCase();
		
		System.out.println(function.apply("checkt "));
		
		
		
		
		
	}
}