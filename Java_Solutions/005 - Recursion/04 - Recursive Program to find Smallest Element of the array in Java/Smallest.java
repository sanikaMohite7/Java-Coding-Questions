import java.util.*;

public class Smallest {
    static int arr[] = {1, 2, 3, 4};

    static int Smallest() {
        int min = arr[0];

        // Fix: i < arr.length instead of i <= arr.length
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(Smallest());
    }
}
