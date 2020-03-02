import java.util.*;

class DCP320
{
	public static String distinctSubstring(String str)
	{
		HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();

		for (int i = 0; i < str.length(); i++)
		{
			map.putIfAbsent(str.substring(i, i + 1), new ArrayList(i));
		}

		for (String s : map.keySet())
		{
			ArrayList a = map.getValue();	
			for (int i : a) System.out.print(i);
			System.out.println();
		}
		
		return "SUCCESS";
	}

	public static void main(String[] args)
	{
		String s = "jiujitsu";
		distinctSubstring(s);
	}
}