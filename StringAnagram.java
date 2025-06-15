import java.util.*;
public class StringAnagram {
    public static void main(String args[])
    {
        String str="listen";
        String str1="silent";

       if(anagaram(str,str1))
       
        System.out.println("string is anagram");
       
       else
        System.out.println("string is not anagram");

    }
    public static  boolean anagaram(String str1,String str2)
    {
        
        if (str1.length() != str2.length()) {
            return false;
        }

        char ch[]=str1.toCharArray();
        char ch1[]=str2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]!=ch1[i])
            
                return false;   
        }
        return true;
        
    }
    
}
