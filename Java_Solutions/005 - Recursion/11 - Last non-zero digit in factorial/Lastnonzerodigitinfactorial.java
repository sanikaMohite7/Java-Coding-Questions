import java.util.*;

public class Lastnonzerodigitinfactorial
{
    static int fact(int n)
    {
    if(n == 0 || n == 1)
    {
        return 1;
    }

    return n * fact(n-1);
}
    public static void main(String[] args)
    {
        int n = 5;
        int fact = fact(n);

        int res;

        while(fact % 10 == 0)
        {
            fact /= 10;
        }

        System.err.println(fact % 10);
    }
}
