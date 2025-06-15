import java.util.*;
public class CountCapitalcase
 {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the String");
        String str=s.nextLine();

        char Arr[]=str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);

        int iCount=0;

        for(int i=0; i<Arr.length; i++)
        {
            if((Arr[i]>='A')&& (Arr[i]<='Z'))
            {
                iCount++;
            }
        }
        System.out.println("Capital case character are: "+iCount);

    }
    
}
