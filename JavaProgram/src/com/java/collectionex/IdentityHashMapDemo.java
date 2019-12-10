package com.java.collectionex;

import java.util.HashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		//Integer I1 = new Integer(10);
		//Integer I2 = new Integer(10);
		//m.put(I1, "Pawan");
		//m.put(I2, "Kalyan");
		System.out.println(m); // {10=Kalyan}
		
		System.out.println("=====hello===================");
		
		
		String sI1 = new String("abc");
		String sI2 = new String("abc");
		
		
	/*	String sI1 = "abc";
		String sI2 = "abc";
		*/
		
		m.put(sI1, "Pawan");
		m.put(sI2, "Kalyan");
		System.out.println(m); // {10=Kalyan}
		
		
		
	}
}
