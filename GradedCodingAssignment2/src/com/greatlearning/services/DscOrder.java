package com.greatlearning.services;

public class DscOrder {
	
	public void dscOrder(double arr[]) {
		for (int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++){
				double tmp = 0;  
		        if (arr[i] < arr[j]){  
		        	tmp = arr[i];  
		            arr[i] = arr[j];  
		            arr[j] = tmp;  
		        }  
		    } 
		System.out.print(arr[i] + " ");  
		}
	}
}
