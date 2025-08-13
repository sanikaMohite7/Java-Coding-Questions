import java.util.*;

public class Automorphicnum
{
    public static void main(String[] args)
    {
        int n = 25;
        
        int square = n * n;

        int digits = String.valueOf(n).length();

        int lastDigits = square % (int)Math.pow(10, digits);

        if(lastDigits == n)
        {
            System.out.println(n + " is a automorphic number");
        }
        else
        {
             System.out.println(n + " is not an automorphic number");
        }
    }    
}
