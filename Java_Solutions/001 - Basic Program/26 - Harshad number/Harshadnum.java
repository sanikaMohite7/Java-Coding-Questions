import java.util.*;

public class Harshadnum
{
   public static void main(String[] args)
   {
    int n = 97;
    int sum = 0;
    int temp = n;
    
    while(temp != 0)
    {
        int digit = temp % 10;
        sum += digit;
        temp/=10;
    }

    if(n % sum == 0)
    {
        System.out.println("Number is Harshad number");
    }
    else
    {
        System.out.println("Number is not harshad number");
    }
   } 
}
