package com.java.java8stream;

import java.util.stream.Stream;

/**
 * @author Ram  
 * 
 * streamOf
 *
 */
public class TestStreamOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> st=Stream.of(1,2,3,4,5,6,7,8,9);
		st.forEach(System.out::println);
		
		//st.forEach(p->System.out.println(p));
		

	}

}
