package com.greatlearning.services;

public class Decline {

	public void declineCount(boolean arr[]) {
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == false) {
				counter++;
			}
		}
		System.out.println("Total number of companies whose stock price declined today : " + counter);
	}
}
