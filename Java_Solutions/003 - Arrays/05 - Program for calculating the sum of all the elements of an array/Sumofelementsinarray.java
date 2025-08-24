import java.util.*;

public class Sumofelementsinarray
{
   public static void main(String[] args)
   {
    int arr[] = {9,7,6,4,2};

    int sum = 0;

    for(int i = 0; i<=arr.length-1;i++)
    {
        sum += arr[i];
    }

    System.out.println("The sum of all the elements in the array is: " + sum);
   } 
}
