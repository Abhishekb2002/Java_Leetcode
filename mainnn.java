import java.util.*;

class mainnn
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=s.nextLine();

        // char Arr[]=str.toCharArray();

        int Count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.At(i)=='a')
            {
                Count++;

            }   
        }
        System.out.println("Character are :"+Count);
    }
}