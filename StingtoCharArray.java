import java.util.*;

class StingtoCharArray
{
    public static void main(String args[])
    {
        System.out.println("enter the string ");

        Scanner s= new Scanner(System.in);
        String str =s.nextLine();

        char Arr[]=str.toCharArray();

        System.out.println(str.length());

        System.out.println(Arr.length);
    }
}