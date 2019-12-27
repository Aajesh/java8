package com.java8.Lambadawith;

import com.java8.lambdainterface.Sayable;

public class LambdaExpressionExample3 {
	public static void main(String[] args) {
		Sayable s = (str) -> {
			return "I have nothing to say."+str;
		};
		
		System.out.println(s.say("Aajesh"));
	}
}//end of the 