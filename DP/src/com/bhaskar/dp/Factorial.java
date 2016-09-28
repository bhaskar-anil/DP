package com.bhaskar.dp;

import java.util.Scanner;

public class Factorial {

	/*
	 *    LINEAR TIME
	 * 
	 * 	  LINEAR SPACE
	 * 
	 * */
	
	static int factorialDPMemoized(int n) {
		//We need a Table or an Array to Memorize the last FACT values
		//We are using an array here
		
		int f[] = new int[n+1];

		//we know that FACT(0) is 1
		f[0] = 1;

		for (int i = 1; i <= n; i++) {
			
			f[i] = f[i - 1] * i;
		}

		return f[n];
	}
	
	/*
	 * 
	 *    LINEAR TIME
	 * 
	 *    CONSTANT SPACE
	 * 
	 * */
	
	static int factorialDPBottomUp(int n) {
		int temp = 1,fact = 1;

		
		for (int i = 2; i <= n; i++) {
			//we know what is FACT(1) is (temp)
			//we know FACT(2) is 2 * FACT(1)
			//...so on
			
			fact = i * temp;
			
			//In Bottom up approach we just need to keep track or last FACTORIAL
			//eg. For FACT(i) we just need FACT(i-1), because FACT(i) = i*FACT(i-1)
			temp = fact;
			
		}

		return fact;
	}

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int k = 0; k < t; k++) {
			System.out.println(factorialDPBottomUp(scan.nextInt()));
		}

	}

}
