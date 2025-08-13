import java.util.*;

public class Palindromenum
{
    public static void main(String[] args)
    {
        int n = 97;
        int rev = 0;
        int original = n;

        while(n!=0)
        {
            int rem = n % 10;
            rev = rev * 10 +rem;
            n /=10;
        }
        if(original == rev)
        {
            System.out.println("Number is palindrome "+rev);
        }
        else
        {
            System.out.println("Number is not palindrome "+rev);
        }
    }
}