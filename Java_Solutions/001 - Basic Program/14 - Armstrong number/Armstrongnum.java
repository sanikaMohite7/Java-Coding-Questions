import java.util.*;

public class Armstrongnum
{
    public static void main(String[] args)
    {
        int n = 153;
        int sum = 0;
        int original = n;

        while(n != 0)
        {
            int digit = n % 10;
            sum += digit * digit * digit;
            n/=10;
        }

        if(sum == original)
        {
            System.out.println(original + " is an Armstrong number.");
        }
        else
        {
            System.out.println(original + " is not an Armstrong number.");

        }
    }
}