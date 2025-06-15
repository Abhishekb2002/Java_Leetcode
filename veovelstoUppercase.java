import java.util.*;

public class veovelstoUppercase {
    public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    
    System.out.println("enter the string");
    String str=s.nextLine();

    // veovels   a e i o u

    char ch[]=str.toCharArray();

    for(int i=0; i<ch.length; i++)
    {
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        {
            ch[i]=(char)(ch[i]-32);
        }
    }
    System.out.println(" ");
    for(int i=0; i<ch.length;i++)
    {
        System.out.print(ch[i]+" ");
    }   
}
}

