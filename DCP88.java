// Implement division of two positive integers without using the division, multiplication, or modulus operators. 
// Return the quotient as an integer, ignoring the remainder.

// Perform division by subtracting the divisor from the dividend until the dividend's value falls below zero

import java.util.Scanner.*;
import java.util.*;

class DCP88
{
	public static int div(int x, int y)
	{
		if (x - y < 0) return 0;
		return 1 + div(x - y, y);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int a = scan.nextInt();

		System.out.println("Enter another number: ");
		int b = scan.nextInt();

		System.out.println(div(a, b));
	}
}