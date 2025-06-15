import java.util.*;
public class isPalindromString {

    public static boolean checkPalindrome(String str)
    {
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String str="noon";
        System.out.println(checkPalindrome(str));

        if(checkPalindrome(str)==true)
        {
            System.out.println(str+" is palindrome ");
        }
        else
        {
            System.out.println(str+" not a palindrome");
        }
    }
    
}
