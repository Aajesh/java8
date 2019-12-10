package com.java.collectionex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapString {
	public static void main(String[] args) {
	HashMap m = new HashMap();
	String abc="chiru";
	m.put(abc, 700);
	m.put("Bala", 800);
	m.put("Venki", 200);
	m.put("Nag", 500);
	System.out.println(m);
	
	//String abc="Chiru";
	abc.toLowerCase();
	
	Object obj=m.get("chiru");
	

	System.out.println(obj);
	
	//System.out.println(m.get("chiru"));
	
//	System.out.println(m);
	
	}
	
}

