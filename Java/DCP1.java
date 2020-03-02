import java.util.*;

class DCP1
{
	public static boolean twoSum(int[] arr, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     	
     	// Add the values of the array to a hashmap, using the array value as the key   
        for (int i = 0; i < arr.length; i++) map.put(arr[i], i);
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++)
        {
        	// Check whether the hashmap contains a value that is equal to the target value minus an array value 
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