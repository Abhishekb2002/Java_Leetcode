import java.util.*;

class CountSmallCharacter
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the string ");
        String str=s.nextLine();

        char Arr[]=str.toCharArray();

        System.out.println(str.length());
        System.out.println(Arr.length);

        int iCount=0;

        for(int i=0; i<Arr.length; i++)
        {
            if((Arr[i]>='a')&&(Arr[i]<='z'))
            {
                iCount++;
            }
        }
        System.out.println("small case character are :"+iCount);

    }
}