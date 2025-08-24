import java.util.*;

public class Reversearray_2 
{
    public static void main(String[] args)
    {
        int arr[] = {9,7,6,4,2};

        int n = arr.length;

        int start = 0;
        int end = n -1;

        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
