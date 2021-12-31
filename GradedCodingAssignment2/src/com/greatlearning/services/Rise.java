package com.greatlearning.services;

public class Rise {
	
	public void riseCount(boolean arr[]) {
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true) {
				counter++;
			}
		}
		System.out.println("Total number of companies whose stock price rose today : " + counter);
	}

}
