package com.java.oopsdu;

public class TestPC {
	
	public static void main(String[] arg) {
		
	    // 	Parent p=new Parent();
			//p.m1();
			//p.m2();
			
			//Parent p1=new Child();
			//p1.m1();
		//	p1.m2();
			
			Child c=new Child();
			c.m1();
			c.m2();
			
			((Parent)c).m1();
			

			//((Parent)c).m2();
			
		//	Child c=(Child) new Parent();
		//	c.m1();
			//c.m2();
	}

}
