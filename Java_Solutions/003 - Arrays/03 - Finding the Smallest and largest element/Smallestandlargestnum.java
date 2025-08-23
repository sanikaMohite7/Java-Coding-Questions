import java.util.*;

public class Smallestandlargestnum
{
   public static void main(String[] args)
   {
       int arr[] = {9,7,6,4,2};

       int small = Integer.MAX_VALUE;
       int large = Integer.MIN_VALUE;

       for(int i = 0; i < arr.length; i++)
       {
           if(arr[i] < small)
           {
               small = arr[i];
           }
           if(arr[i] > large)
           {
               large = arr[i];
           }
       }
       System.out.println("The smallest element in the array is: " + small);
       System.out.println("The largest element in the array is: " + large);
   }
}
