import java.util.*;
import java.io.*;

public class GenerateallCombinationsofBalancedParentheses
{
    public static void allcombination(int n ,int open ,int close ,String s , ArrayList<String> ans)
    {
        if(open == n && close == n)
        {
            ans.add(s);
            return;
        }

        if(open < n)
        {
            allcombination(n, open + 1, close, s + "{", ans);
        }

        if(close < open)
        {
            allcombination(n, open, close + 1, s + "}", ans);
        }

    }
    public static void main(String[] args)
    {
        int n = 3;

        ArrayList<String> ans = new ArrayList<>();

        allcombination(n, 0 ,0 , "" ,ans);

        for(String s: ans)
        {
            System.out.println(s);
        }
    }
}
