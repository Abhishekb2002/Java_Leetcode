class StringPalindrom
{
    public static void main(String arr[])
    {
        String name="`mam`";

        String name2="";

        for(int i=name.length()-1;i>=0;i--)
        {
            name2=name2+name.charAt(i);

        }

        if(name.equals(name2))
        {
            System.out.println(name+" string is palindrom");

        }
        else
        {
        System.out.println(name+" string is not palindrom");
        }

    }
}