import java.util.*;

class HasMap3
{
    public static void main(String args[])
    {
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the string :");
        String str =sobj.nextLine();

        char Brr[]=str.toCharArray();

        // String Arr[]=str.split(" ");

        // System.out.println("number of word in string "+Arr.length);
        System.out.println("number of character in string "+Brr.length);

        HashMap <Character  ,Integer> hobj=new HashMap();

        int Frequency=0;
        for(char ch : Brr)
        {
            if(hobj.containsKey(ch))
            {
                Frequency = hobj.get(ch);
                hobj.put(ch,Frequency+1);
            }
            else{
                hobj.put(ch,1);
            }
        }
        Set<Character> setobj = hobj.keySet();

        for(char value : setobj)
        {
        System.out.println(value+" occurs "+hobj.get(value)+"times");
        }
    }
}