import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class main18
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the string ");

        String str =sobj.nextLine();

        System.out.println("Enter word you want search");
        String word =sobj.nextLine();

        String Arr[] =str.split(" ");

        int iCount = 0;

        for(int i=0; i<Arr.length; i++)
        {
            if(Arr[i].equals(word))
            {
                iCount++;

            }
        }
        System.out.println("frequency of the word is"+iCount);

    }
}