package com.java.java8stream;

import java.util.Date;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Ram
 *  Stream.generate() or Stream.iterate()
 */
public class TestStreamGenreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Stream<Date> stream=Stream.generate(()->{return new Date();});
		
		//stream.forEach(p->System.out.println(p));
		
		//IntStream stream = "12345_abcdefg".chars();
        //stream.forEach(p -> System.out.println(p));
         
        //OR
         
        Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));
		
	}

}
