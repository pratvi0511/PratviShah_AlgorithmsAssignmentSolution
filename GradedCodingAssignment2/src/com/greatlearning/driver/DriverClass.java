package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.services.*;

public class DriverClass {
	public static void main(String[] args){
		AscOrder a = new AscOrder();
		DscOrder d = new DscOrder();
		Rise r = new Rise();
		Decline dec = new Decline();
		Search src = new Search();
		int size;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number of companies: ");
		size = s.nextInt();
		double[] stockPrice = new double[size];
		boolean bool[] = new boolean[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the current stock price of the company " + (i+1));
			stockPrice[i] = s.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			bool[i] = s.nextBoolean();
		}
		System.out.println();
		boolean done = false;
		do {
			System.out.println("                     ");
		    System.out.println("-------------------------------------------------------------------------------------");
		    System.out.println("Enter the operation that you want to perform: ");
		    System.out.println("1. Display the companies stock prices in ascending order.");
		    System.out.println("2. Display the companies stock prices in descending order.");
		    System.out.println("3. Display the total number of companies for which the stock prices rose today.");
		    System.out.println("4. Display the total number of companies for which the stock prices declined today.");
		    System.out.println("5. Search a specific stock price.");
		    System.out.println("6. Press 0 to exit.");
		    System.out.println("-------------------------------------------------------------------------------------");
		    System.out.println("                     ");
		    int choice = s.nextInt();
		    switch(choice) {
		       case (1):
		    	   System.out.println("Stock prices in ascending order are : ");
			       a.ascOrder(stockPrice);
			       System.out.println("                     ");
		           break;
		       case (2):
		    	   System.out.println("Stock prices in descending order are : ");
			       d.dscOrder(stockPrice);
			       System.out.println("                     ");
                   break;
		       case (3):
		    	   r.riseCount(bool);
		           System.out.println("                     ");
                   break;
		       case (4):
		    	   dec.declineCount(bool);
		           System.out.println("                     ");
                   break;
		       case (5):
		    	   System.out.println("Please enter the key value: ");
		           double key = s.nextDouble();
		           src.searchCheck(stockPrice, key);
		           System.out.println("                     ");
                   break;
		       case (0):
		    	   done = true;
		           System.out.println("Exited successfully!");
		   }
		} while (!done);
	}
}
