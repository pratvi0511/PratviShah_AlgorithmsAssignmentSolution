package com.greatlearning.services;

public class Search {
	
	public void searchCheck(double arr[], double key) {
		boolean found = false;

	    for (double n : arr) {
	      if (n == key) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println("Stock of value " + key + " is present.");
	    else
	      System.out.println("Value is not found.");
	}
}
