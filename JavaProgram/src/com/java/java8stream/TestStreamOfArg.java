package com.java.java8stream;

import java.util.stream.Stream;


/**
 * @author Ram
 * 
 * Stream.of(array of element )
 */
public class TestStreamOfArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		 
		 stream.forEach(System.out::println);
	      
	}

}
