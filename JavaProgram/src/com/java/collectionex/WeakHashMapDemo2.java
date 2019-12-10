package com.java.collectionex;

import java.util.HashMap;

public class WeakHashMapDemo2 {
	public static void main(String[] args) throws InterruptedException {
		HashMap m = new HashMap();
		Temp1 t = new Temp1();
		m.put(t, "Durga");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}

class Temp1 {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize() Called");
	}
}