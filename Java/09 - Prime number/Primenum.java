import java.util.*;

public class Primenum
{
    static boolean isPrime(int n)
    {
        if(n < 1)
        {
            return false;
        }

        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args)
    {
        if(isPrime(7))
        {
            System.out.println("Number is prime number");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}