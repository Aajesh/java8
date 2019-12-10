package com.java.collectionex;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
	public static void main(String[] args) {
	Hashtable m = new Hashtable();
	String abc="chiru";

	m.put(abc, 700);
	m.put("Bala", 800);
	m.put("Venki", 200);
	m.put("Nag", 500);
	abc.toLowerCase();
    
	
	System.out.println(m);
	
;
	
	Object obj=m.get("chiru");
	

	System.out.println(obj);
	
	System.out.println(m.size());
	System.out.println(m.isEmpty());
	

	
	System.out.println(m.size());
	

	System.out.println(m);
	}
	
}






