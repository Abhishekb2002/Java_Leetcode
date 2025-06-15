import java.util.*;
public class vowels 
{
    public static void main(String args [])
    {
        String s="abhishek";

        char ch[]=s.toCharArray();
        int vowels=0;

        // char c=s.charAt(i);
          for(int i=0; i<s.length();i++)
        {
            if(ch[i]=='a'||ch[i]=='u'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o')
            {
                System.out.println(ch[i]);
                vowels++;
            }
        }

        // for(int i=0; i<s.length();i++)
        // {
        //     if(s.charAt(i)=='a'||s.charAt(i)=='u'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o')
        //     {
        //         System.out.println(s.charAt(i));
        //         vowels++;
        //     }
        // }
      System.out.println("vowels are : "+vowels); 

    }

}
