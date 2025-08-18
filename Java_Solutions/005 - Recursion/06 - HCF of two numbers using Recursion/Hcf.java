import java.util.*;

public class Hcf
{
    static int HCF_num(int n1 ,int n2)
    {
        
        if(n1 == 0)
        {
            return n2;
        }
        if(n2 == 0)
        {
            return n1;
        }

        if(n1 == n2)
        {
            return n1;
        }

        if(n1 > n2)
        {
            return HCF_num(n1-n2 ,n2);
        }
        return HCF_num(n1 ,n2-n1);

    }
    public static void main(String[] args)
    {
        int n1 = 24 ,n2 = 20;
        System.out.println(HCF_num(n1, n2));
    }    
}
