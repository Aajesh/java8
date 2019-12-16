package com.java.java8default;

public interface SIM {
	public abstract void call();
	public abstract void sms();
	
	public default void vedioCall() {
		System.out.println("Vedio call executed from sim interface ");
		
	}
	

}
