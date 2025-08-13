import java.util.*;

public class Binarytodecimal
{
    public static void main(String[] args)
    {
        int Binarynum = 1001;
        int decimalnum = 0;
        int base = 1;

        while(Binarynum > 0)
        {
            int lastDigit = Binarynum % 10;
            decimalnum += lastDigit * base;
            base *= 2;
            Binarynum /= 10;

        }
        System.out.println("Decimal Number: " + decimalnum);
    }
}
