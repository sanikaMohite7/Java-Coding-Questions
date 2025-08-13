import java.util.*;

public class Fact
{
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n * fact(n-1);
    }
    public static void main(String[] args)
    {
        // int fact = 1;
        // int n = 5;
        // for(int i = 1; i<=n;i++)
        // {
        //     fact = fact * i;
        // }
        // System.out.println(fact);
        int n = 5;

        int res= fact(n);
        System.out.println(res);
    }
}