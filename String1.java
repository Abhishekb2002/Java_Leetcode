import java.util.*;

class String1
{
    public static void main(String args[])
    {
        String str="aDItyA";

        for(int i=0; i<str.length() ; i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
            System.out.println(str.charAt(i));
            }
            // else
            // {
            //     System.out.println(str.charAt(i));
            // }
    }
    }
}