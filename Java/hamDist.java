import java.util.*;

class hamDist
{
	public static int hammingDist(int x, int y)
	{
		int total = 0;
		if (x < y)
		{
			int temp = x;
			x = y;
			y = temp;
		}

		while (x != 0)
		{
			if (y != 0)
			{
				if (x % 2 != y % 2)
					total++;
			}

			else 
				if (x % 2 == 1)
					total++;

			x /= 2;
			y /= 2;
		}

		return total;
	}

	public static void main(String[] args)
	{
		System.out.println(hammingDist(4, 2));
	}
}