import java.util.*;

class RemoveWhiteSpace
{
    public static void main(String a[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the string");
        String str=s.nextLine();

        // String str="abhi bhosale";

        str =str.replaceAll("\\s","");
        System.out.println("after replacing white spaceas :"+str);
    }
}