import java.util.*;

public class Largestnum
{
    public static void main(String[] args)
    {
        int arr[] = {9,7,6,5,4};

        int large = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + large);
    }
}