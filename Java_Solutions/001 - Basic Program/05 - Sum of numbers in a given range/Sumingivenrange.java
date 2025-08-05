import java.util.*;

public class Sumingivenrange
{
    public static void main(String[] args)
    {
        int low = 11 ,high = 20;
        int sum = 0;

        for(int i = low ; i <= high; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}