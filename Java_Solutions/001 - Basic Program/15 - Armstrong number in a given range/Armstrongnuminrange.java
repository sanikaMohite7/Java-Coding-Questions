import java.util.*;

public class Armstrongnuminrange
{
    public static void main(String[] args)
    {
        int num = 153;
        int sum = 0;
        int original = num;

        int low = 100 ,high = 200;
        for(int i =low; i<= high; i++)
        {
        while(num != 0)
        {
            int digit =  num %10;
            sum += digit * digit *digit;
            num/=10;
        }
        }

        if(original == sum)
        {
            System.out.println("Number is palindrome "+sum);
        }
    }
}