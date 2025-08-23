import java.util.*;

public class Secondsmallnum
{
    static int secondsmallnum(int arr[])
    {
        int small = arr[0];

        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] < small)
            {
                small = arr[i];
            }
        }

        int sec_small = Integer.MAX_VALUE;

        for(int i = 0; i <arr.length; i++)
        {
            if(arr[i] != small && arr[i] < sec_small)
            {
                sec_small = arr[i];
            }
        }
        return sec_small;
    }
    public static void main(String[] args)
    {
        
        int arr[] = {9,7,6,4,2};

        int secondSmall = secondsmallnum(arr);
        System.out.println("The second smallest element is: " + secondSmall);
        
    }
}
