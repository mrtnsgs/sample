package com.sample.fibonacci;

public class RecursivoInt {
	public static int RecursivoInt1(int num1) {
		
		if(num1 == 0) {
			return 1;
		}
		
		return num1 + RecursivoInt1(num1 - 1);
	}	
}