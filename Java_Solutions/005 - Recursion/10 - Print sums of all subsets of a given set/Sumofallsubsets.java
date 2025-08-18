import java.util.*;
import java.io.*;

public class Sumofallsubsets {
    static void subSetSum(int arr[], int l, int r, int sum) {
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }

        // Include current element
        subSetSum(arr, l + 1, r, sum + arr[l]);
        
        // Exclude current element
        subSetSum(arr, l + 1, r, sum);
    }
    
    public static void main(String[] args) {
        int arr[] = {9, 7, 6};
        int n = arr.length;
        System.out.println("All possible subset sums:");
        subSetSum(arr, 0, n-1, 0);
    }   
}