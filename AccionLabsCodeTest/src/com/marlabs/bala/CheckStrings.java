package com.marlabs.bala;

import java.util.Scanner;

public class CheckStrings 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :");
		String X = sc.nextLine();
		System.out.println("Enter the Second String :");
		String Y = sc.nextLine();
		System.out.println("Given Two Strings are: " + X + ", " + Y);

		if (check(X, Y)) 
		{
			System.out.println(" Yes : Given Strings can be derived from each other");
		}
		else 
		{
			System.out.println(" No : Given Strings cannot be derived from each other");
		}
	}
	public static boolean check(String X, String Y)
	{
		int m;
		if ((m = X.length()) != Y.length()) 
		{
			return false;
		}
		for (int i = 0; i < m; i++)
		{
			X = X.substring(1) + X.charAt(0);

			if (X.compareTo(Y) == 0) 
			{
				return true;
			}
		}
		return false;
	}

}
