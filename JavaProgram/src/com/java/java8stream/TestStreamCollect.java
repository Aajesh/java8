package com.java.java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



 /**
 * @author Ram
 * Convert Stream to List – Stream.collect( Collectors.toList() )
 * 
 * convert stram to array
 * 
 *
 */
public class TestStreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>();
	     
		for (int i = 0; i < 10; i++) {
			list.add(i);
			
		}
		//Stream<Integer> stream = list.stream();
		//  List<Integer> stream=list.stream().filter(p->p%2==0).collect(Collectors.toList());
	      //System.out.print(stream);
		
		
	    Stream<Integer> stream = list.stream();
	    
	    Integer[] arg=stream.filter(p->p%2==0).toArray(Integer[]::new);
	    System.out.print(arg);
	    
	    
	    
	    
	    
	    
		
	}

}
