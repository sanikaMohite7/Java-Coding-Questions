import java.util.*;

public class Friendlyfair
{
    public static void main(String[] args)
    {
        int num1 = 6; 
        int num2 = 28;

        int sum1 = getDivisorSum(num1);
        int sum2 = getDivisorSum(num2);

        if ((sum1 / (double)num1) == (sum2 / (double)num2)) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pair");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Friendly Pair");
        }
    }
    
    public static int getDivisorSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
