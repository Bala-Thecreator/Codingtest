package com.marlabs.bala;

public class FindPair {
	
	public static void main(String args[]) 
    { 
        int[] arr = {9, 7, 4, 5, 6, 1}; 
        int sum = 13; 
        getPairsCount(arr, sum); 
    }
	
	public static void getPairsCount(int[] arr, int sum) 
    { 
  
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if ((arr[i] + arr[j]) == sum)
                {
                	System.out.println("Pairs are : " + arr[i] + ", " + arr[j]);
                    count++; 
                }
            }
        }
        System.out.printf("Count of pairs is:  %d",count); 
    }
}
