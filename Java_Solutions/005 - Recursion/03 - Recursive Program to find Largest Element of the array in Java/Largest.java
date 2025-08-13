import java.util.*;

public class Largest
{
   static int arr[] = {2,3,9,7,6,4};

   static int largest()
   {
    int max = arr[0];

    for(int i = 0;i<=arr.length;i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;

   }
    public static void main(String[] args)
    {
        System.out.println(largest());
    }    
}
