// A fixed point in an array is an element whose value is equal to its index. 
// Given a sorted array of distinct elements, return a fixed point, if one exists. 
// Otherwise, return False.

class DCP273
{
	public static int fixedPoint(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
			if (arr[i] == i) return i;
		return -1; 
	}

	public static void main(String[] args)
	{
		int[] arr = {4, 50, 88, 34, 72, 7};

		System.out.println(fixedPoint(arr));
	}
}