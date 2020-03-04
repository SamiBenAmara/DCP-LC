/* Given an array of integers, return a new array such that each element at index i 
 * of the new array is the product of all the numbers in the original array except the one at i.
 */

import java.util.*;
import java.util.stream.*;

class DCP2
{
	// Version that disallows division
	public static int[] multipliedArrayNoDiv(int[] arr)
	{
		int total = 1;
		int[] clone = arr.clone();

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
				if (j != i) total *= arr[j];
			
			clone[i] = total;
			total = 1;
		}

		return clone;
	}

	// Original Version
	public static int[] multipliedArray(int[] arr)
	{
		int total = 1;

		for (int i = 0; i < arr.length; i++)
			total *= arr[i];

		for (int i = 0; i < arr.length; i++)
			arr[i] = total / arr[i];

		return arr; 
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};

		int[] result = multipliedArrayNoDiv(arr);

		for (int i = 0; i < arr.length; i++) 
			System.out.println(result[i]);
	}
}