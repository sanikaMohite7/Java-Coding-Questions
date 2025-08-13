import java.util.*;
//Strong num:- The sum of factorial of num is eqaul to num
public class Strongnum
{
    static int fact(int n)
    {
        int fact = 1;
        for(int i = 2; i <= n;i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        int n =145;
        int temp = n;
        int sum = 0;

        while(temp != 0)
        {
            int digit = temp % 10;
            sum += fact(digit);
            temp/=10;
        }

        if(sum == n)
        {
            System.out.println("Number is strong number");
        }
        else
        {
            System.out.println("Number is not a strong number");
        }
    }    
}
