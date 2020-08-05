package com.marlabs.bala;

public class MoveAllZeros {
	
	static void moveZerosToEnd(int arr[], int n) 
    { 
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0)
            {
                arr[count++] = arr[i];
            }
        }
        while (count < n)
        {
            arr[count++] = 0; 
        }
    } 
	public static void main (String[] args) 
    { 
        int arr[] = {6, 0, 8, 2, 3, 0, 4, 0, 1}; 
        int n = arr.length; 
        moveZerosToEnd(arr, n); 
        System.out.println("Array after pushing zeros to the back: ");
        System.out.print("{");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+", ");
        }
        System.out.print("}");
    } 

}
