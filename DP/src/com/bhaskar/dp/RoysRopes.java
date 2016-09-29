package com.bhaskar.dp;

public class RoysRopes {
	
	static int minsRequiredToBurnTheRopeDown(int ropeLength, int Upper[], int Lower[]){
		int mins = 0;
		
		for(int i = 1; i < ropeLength; i++){
			int temp = i + Upper[i-1];
			if(temp>mins){
				mins = temp;
			}
		}
		
		for(int i = 1; i < ropeLength; i++){
			int temp = i + Lower[i-1];
			if(temp>mins){
				mins = temp;
			}
		}
		if(mins>ropeLength){
			return mins;
		}
		return ropeLength;
	}

	public static void main(String[] args) {
		
		int Upper[] = {0,0,6,0},Lower[] = {0,0,0,0};

		System.out.println(minsRequiredToBurnTheRopeDown(5, Upper, Lower));
		

	}

}
