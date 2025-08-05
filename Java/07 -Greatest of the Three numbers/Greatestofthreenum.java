import java.util.*;

public class Greatestofthreenum
{
    public static void main(String[] args)
    {
        int a = 9 ,b = 7 ,c = 6;

        if(a > b && a > c)
        {
            System.out.println("a is greater");
        }
        else if(b >c && b > a)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
}