import java.util.*;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int arr[] = {9,7,6,4,2};

        int n = arr.length;

        for(int i = n-1; i>=0;i--)
        {
            System.err.println(arr[i] + " ");
        }
    }
}
