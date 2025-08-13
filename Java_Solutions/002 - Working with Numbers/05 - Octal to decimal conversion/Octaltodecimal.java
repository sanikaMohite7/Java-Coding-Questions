public class Octaltodecimal
{
    public static void main(String[] args)
    {
        int octalnum = 123;
        int decimalnum = 0;
        int base = 1;
        
        while(octalnum > 0)
        {
            int lastDigit = octalnum % 10;
            decimalnum += lastDigit * base;
            base *= 8;
            octalnum /= 10;
        }
        System.out.println("Decimal Number: " + decimalnum);
    }    
}
