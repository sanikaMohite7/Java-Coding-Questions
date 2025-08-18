import java.util.*;

public class Permuations
{
    static void stringPermutations(String str ,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans + " ");
        }

        for(int i = 0 ;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String r = str.substring(0,i) + str.substring(i + 1);
            stringPermutations(r , ans + ch);
        }
    }
    public static void main(String[] args)
    {
        String str = "abc";
        stringPermutations(str , "");
    }    
}
