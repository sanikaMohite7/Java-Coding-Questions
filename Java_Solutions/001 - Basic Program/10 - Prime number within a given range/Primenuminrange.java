import java.util.*;

public class Primenuminrange
{
    static boolean isPrime(int n)
    {
        for(int i = 2; i <= Math.sqrt(n);i++)
        {
        if(n % i == 0)
        {
            return false;
        }
        }

        return true;

    }
    public static void main(String args[])
    {
        int low = 2 ,high = 20;

        for(int i = low;i<=high;i++)
        {
            if(isPrime(i))
            {
            System.out.println(i + " ");
            }
        }
    }
}