package com.sample.fibonacci;

public class Fibonacci {

	
	public static int seqFib(int num) {
		int f1=0;
		int f2=1;
		int f3=0;
		
		/*int cont=2;
		
		while (cont <= num) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			cont++;
		}
		return f3;*/		
		//return num + seqFib(num + 2);
		
		for (int i=2; i<=num; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		} 
		return f3;
		
	}
	
	public static int seqFibRecursivo (int num) {

		if (num < 2) { 
		    return num;
		    }
		// exemplo 10 // 10-1 = 9 + 10-2 = 8 || posição 9 + posição 8
		return seqFibRecursivo(num - 1) + seqFibRecursivo(num - 2);
	}
}


