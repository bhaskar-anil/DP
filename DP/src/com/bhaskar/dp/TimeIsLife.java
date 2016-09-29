package com.bhaskar.dp;

public class TimeIsLife {
	
	static long maxLottery(int N, int k, long slips[]){
		long memoized[] = new long[N];
		long max = 0;
		
		for(int i = 0; i <= k; i++){
			if(slips[i]>0){
				memoized[i] = slips[i];
			}
			
		}
		
		for(int i = k+1; i < N; i++){
			if(slips[i]>0){
				memoized[i] = memoized[i-(k+1)] + slips[i];
			}else{
				memoized[i] = memoized[i-(k+1)];
			}
		}
		
		for(int i = N-1; i >= N-1-k; i--){
			if(memoized[i] > max){
				max = memoized[i];
			}
		}
				
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxLottery(10,2,new long[]{1, 2, -3, -5, 4, 6, -3, 2, -1, 2}));

	}

}
