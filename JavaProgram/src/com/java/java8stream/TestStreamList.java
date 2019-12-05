package com.java.java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



/**
 * @author Ram
 * 
 * List.stream()
 *
 */
public class TestStreamList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream=list.stream();
       // stream.forEach(System.out::println);
        stream.forEach(p->System.out.println(p));
        
        
        
		
	}

}
