package com.java.java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamCoreStreamO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Stream<String> ds=memberNames.stream().filter(s->s.startsWith("A"));
		ds.forEach(System.out::println);



		/**Stream.map()
		 * 
		 */
		
		
		Stream<String> dss=memberNames.stream().filter(s->s.startsWith("A")).map(String::toUpperCase);
     	dss.forEach(System.out::println);
		
    	/**Stream.sorted
		 * 
		 */
     	
     System.out.println("===============sorted==================");
		
     	Stream<String> sorted=memberNames.stream().sorted().map(String::toUpperCase);
     	sorted.forEach(System.out::println);
		
     	 System.out.println("===============sorted=54=================");
     	
	
     	boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
     	
     	
     	
     	

System.out.println(matchedResult);
	
	
	
matchedResult = memberNames.stream()
.allMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);
	
	
	
long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

System.out.println(totalMatched);




//String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
String firstMatchedName = memberNames.stream().findFirst().get();

System.out.println(firstMatchedName);
System.out.println(firstMatchedName);



	
	
	}

}
