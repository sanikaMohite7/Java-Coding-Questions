import java.util.*;

public class Hexadecimaltodecimal
{
    public static void main(String[] args)
    {
        int hexnum = 0x1A;
        int decimalnum = 0;
        int base = 1; 
        
        while(hexnum > 0)
        {
            int lastDigit = hexnum % 10;
            decimalnum += lastDigit * base;
            base *= 16;
            hexnum /= 10;
        }
        System.out.println("Decimal Number: " + decimalnum);
    }    
}
