import java.util.*;
import java.lang.Boolean;


class string
{
    public static void main(String args[])
    {

        // Scanner sobj=new Scanner(System.in);
        // String str=sobj.nextLine();

        // String str2=sobj.nextLine();

       String name="Abhi";

       String rev="";

       int lang =name.length();

    //    int lang = name.CharAt();

       for(int i=lang-1; i>=0; i--)
       {
          rev =rev+name.charAt(i); 
       }

       System.out.println(rev);

    }
}