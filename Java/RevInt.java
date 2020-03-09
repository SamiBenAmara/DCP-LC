import java.util.*;
import java.lang.*;

class RevInt
{
    public static int revInt(int x)
    {
        long num = 0;
        long factor = 1;
        long clone = x;
        if (clone < 0)
            x = -x;

        while (x % factor != x) factor *= 10;
        factor /= 10;

        while (x >= 10)
        {
            num += (x % 10) * factor;
            factor /= 10;
            x /= 10;
        }

        num += x;
        if (clone < 0)
            num = -num;

        if (num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE)
            return 0;

        return Math.toIntExact(num);
    }    

    public static void main(String[] args)
    {
        System.out.println(revInt(1534236469));
    }
}

/*Input
1534236469
Output
1808608067
Expected
0*/

/*public int reverse(int x) 
{
    StringBuilder str = new StringBuilder(Integer.toString(x));
    if (x < 0)
        str = new StringBuilder(str.substring(1, str.length()));
        
    long num = Long.parseLong(str.reverse().toString());
        
    if (x < 0)
        num = 0 - num;
        
    if (num > Integer.MAX_VALUE || num <  Integer.MIN_VALUE)
        return 0;
        
    return Math.toIntExact(num);
}*/