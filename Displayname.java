// not working
import java.util.Scanner;
import java.util.*;
public class Displayname
 
{
    public static void main(String ags[])
    {
        // char Arr[]=new char[40];

        Scanner sobj =new Scanner(System.in);
     

        System.out.println(" please enter full name");
        String str =sobj.nextLine();
        char Arr[] = str.toCharArray();
        System.out.println("your name is "+Arr);


    }
    
}
