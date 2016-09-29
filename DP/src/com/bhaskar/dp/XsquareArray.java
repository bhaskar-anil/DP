package com.bhaskar.dp;

public class XsquareArray {

	/*
	 * There are two kind of queries {1 L R} & {2 L R}
	 * 
	 * Need to sum up some elements of array A and B according to one of the
	 * above case
	 * 
	 * What is use of DP here?
	 * 
	 * Just call the elements from array A or B and sum up
	 * 
	 * Time taken is R-L (Linear)
	 * 
	 */
	
	/*
	 * This function computes the sum by calling the array
	 * 
	 * Don't get confused by the -1 in the for loop, it is because here first element of array is A[0]
	 * 
	 * */

	static long xSquare(long A[], long B[], int Q, int L, int R) {
		long sum = 0;
		switch (Q) {
		case 1:
			for (int i = L-1; i <= R-1; i+=2) {
				sum += A[i];
			}
			for (int i = L; i < R; i+=2) {
				sum += B[i];
			}
			return sum;

		case 2:
			for (int i = L-1; i <= R-1; i+=2) {
				sum += B[i];
			}
			for (int i = L; i < R; i+=2) {
				sum += A[i];
			}
			return sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		long A[] = {1,2,3,4,5}, B[] = {5,4,3,2,1};
		
		System.out.println(xSquare(A,B,1,3,5));

	}

}
