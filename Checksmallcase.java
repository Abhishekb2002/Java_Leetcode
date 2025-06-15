import java.util.Scanner;
import java.lang.Boolean;

class Marvellous
{
public boolean Checksmall(char cha)
{
    if((cha>='a')&&(cha<='z'))
    {
        return true;
    }
    else
    {
        return false;
    }

}
}
public class Checksmallcase 
{
    public static void main (String arr[])
    {
         
        Scanner sobj = new Scanner(System.in);

        System.out.println("plese enter one character");
         char ch=sobj.next().charAt(0);

         boolean ret=false;

         Marvellous mobj = new Marvellous();

         ret =mobj.Checksmall(ch);

         if(ret==true)
         {
            System.out.println("is small case char");
         }
         else{
            System.out.println("is not a small case char");
         }


    }
    
}
 