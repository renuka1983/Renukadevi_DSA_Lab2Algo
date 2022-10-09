package com.gl.paymoney.main;	
import java.util.Scanner;
public class DriverClass {

private static int getNoOfTransactions(int[] transArray, int target)
		{
			int sum = 0;
	for(int i = 0; i < transArray.length; i++)
			{
				sum += transArray[i];
				
				if (sum >= target)
				{
					return i+1;
				}	
			}		
			return -1;
		}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Please input no of transactions:");
	int noOfTransaction = s.nextInt();	// number of transactions
	int [] transArray = new int[noOfTransaction]; 
	System.out.println("Enter the transaction values");
	for (int i = 0; i< noOfTransaction; i++)	// input noOfTransaction inputs in array
	{
		transArray[i]= s.nextInt();
	}
	
	System.out.println("Please enter number of targets:");
	int noOfTargets = s.nextInt();
	
	for (int i = 0; i<noOfTargets; i++) // input targets
	{
		System.out.println("Enter the target # " + (i+1) );
		int target = s.nextInt();
		
		//call method?
		// getNoOfTransactions // transArray
		int transCount = getNoOfTransactions( transArray, target);
		if (transCount <0)
		{
			System.out.println("Target not achieved");
		}
		else
		{
			System.out.println("Target achieved in :" + transCount + " targets");
		}
		
	}
	

}

}

