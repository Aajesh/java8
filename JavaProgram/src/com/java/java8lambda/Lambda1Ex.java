package com.java.java8lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> pointList = new ArrayList();
		pointList.add("1");
		pointList.add("2");
		
		pointList.forEach(p->System.out.println(p));
		
		
	}

}//end of the class
