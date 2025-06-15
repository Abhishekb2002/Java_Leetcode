import java.util.*;
public class substring {

    public static String  Substring(String str,int si, int ei)
    {
        String substr=" ";
        for(int i=si; i<=ei;i++)
        {
            substr=substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="Helloworld";

        System.out.println(str.substring(0,5));      // java inbuild method

        System.out.println(Substring(str,1,5));
        
    }
    
}
