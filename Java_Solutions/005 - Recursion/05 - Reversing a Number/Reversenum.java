import java.util.*;

public class Reversenum 
{
    static int reversenum(int n)
    {
        int rev_num = 0;

        while(n > 0)
        {
            int rem = n % 10;
            rev_num = rev_num * 10 + rem;
            n = n / 10;
        }
        return rev_num;
    }
    public static void main(String[] args)
    {
        int rev_num = 97;
        System.out.println("Reversed number is: " + reversenum(rev_num));    
    }
}
