import java.util.*;

public class Power
{
   static int power(int base ,int x)
   {
    if(x==0)
    {
        return 1;
    }
    return base * power(base ,x-1);

   }
    public static void main(String[] args)
    {
        int base = 9;
        int x = 2;

        System.out.println(power(base, x));
    }
}