import java.util.*;

class Hashmap
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the string :");
        String str =sobj.nextLine();

        char Brr[]=str.toCharArray();

        String Arr[]=str.split(" ");

        System.out.println("number of word in string "+Arr.length);
        System.out.println("number of character in string "+Brr.length);

    }
}