import java.util.*;
class StringSplit
{
    public static void main(String args [])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the string :");
        String str=s.nextLine();

        // char arr[]=str.toCharArray();

       String arr[]=str.split(" ");

        System.out.println("number of word are"+arr.length);
        System.out.println("word from string are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+"length:"+arr[i].length());
        }
    }
    
}