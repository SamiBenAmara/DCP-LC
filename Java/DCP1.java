import java.util.*;

class DCP1
{
	public static boolean twoSum(int[] arr, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < arr.length; i++) map.put(arr[i], i);
        
        for (int i = 0; i < arr.length; i++)
        {
            int t = target - arr[i];
            if (map.containsKey(t) && map.get(t) != i) return true;
        }
        
        return false;
    }

	public static void main(String[] args)
	{
		int[] arr = {33, 12, 200, 50, 88, 1};

		System.out.println(twoSum(arr, 251));
	}
}