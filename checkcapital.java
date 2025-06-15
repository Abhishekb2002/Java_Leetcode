
import java.util.Scanner;
class Marvellous
{
public boolean Checksmall(char cha)
{
    if((cha>='A')&&(cha<='Z'))
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
public class checkcapital
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
            System.out.println(ch+" is capital case char");
         }
         else{
            System.out.println(ch+" is not a Capital case char");
         }
    }
    
}
 