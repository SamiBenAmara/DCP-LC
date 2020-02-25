// Given an array of integers, determine whether it contains a Pythagorean triplet

import java.lang.Math;
import java.util.Scanner;

class DCP282
{
	public static boolean pythTriplet(int[] arr)
	{
		return (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) ? true : false;
	}

	public static void main(String[] args)
	{
		int[] arr = {0, 0, 0};
		Scanner scan = new Scanner(System.in);

		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();

		System.out.println(pythTriplet(arr));
	}
}