import java.util.*;

public class GCD
{
    public static void main(String[] args)
    {
        int n1 = 28 ,n2 = 7;
        
        while(n2 != 0)
        {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("The GCD: "+n1);
    }    
}
