import java.util.*;

public class Reverseofanum
{
    public static void main(String[] args)
    {
        int n = 97;
        int rev = 0;
        int original = n;

        while(n != 0)
        {
            int rem = n % 10;
            rev = rev*10 +rem;
            n/=10;
        }
        System.out.println(rev);
    }
}