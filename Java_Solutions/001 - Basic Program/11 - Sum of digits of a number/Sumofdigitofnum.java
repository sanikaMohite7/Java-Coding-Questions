import java.util.*;

public class Sumofdigitofnum
{
    public static void main(String[] args)
    {
        int n = 97;
        int sum = 0;

        while(n!=0)
        {
            int rem = n % 10;
            sum +=rem;
            n /=10;
        }
        System.out.println(sum);
        
    }
}