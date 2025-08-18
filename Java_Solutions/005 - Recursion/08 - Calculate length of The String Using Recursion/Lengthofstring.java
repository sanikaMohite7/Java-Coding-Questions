import java.util.*;

public class Lengthofstring
{
    public static void main(String[] args)
    {
        String str = "Sanika Prathamesh";
        int i = 0;

        char ch[] = str.toCharArray();

        for(char c : ch)
        {
            i++;
        }
        System.out.println("Length of string is: " +i);
    }    
}
