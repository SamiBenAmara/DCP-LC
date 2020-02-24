// A girl is walking along an apple orchard with a bag in each hand. 
// She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag.

// Given an input describing the types of apples she will pass on her path, in order, 
// determine the length of the longest portion of her path that consists of just two types of apple trees.
import java.util.*;

class DCP298
{
	public static int treePath(int[] arr)
	{
		ArrayList<int> arrTwo = new ArrayList<int>();
		int length = 0;

		for (int i = 0; i < arr.length; i++)
		{
			arrTwo.add(arr[i]);
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[j] != arrTwo[0] && arrTwo.length == 1)
				{

				}
			}
		}

		return length;
	}

	public static void main(String[] args)
	{
		int[] arr = {2, 1, 2, 3, 3, 1, 3, 5};
		System.out.println(treePath(arr));
	}
}