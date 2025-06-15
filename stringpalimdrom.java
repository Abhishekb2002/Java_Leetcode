class  stringpalimdrom
{
    public static void main(String args[])
    {
        String name ="mam";
     
        String rev="";
        
        
        int lang =name.length();

        // int lang=name.charAt();

        for(int i=lang-1; i>=0;i--)
        {
            rev= rev+name.charAt(i);
        }

        if(name.equals(rev))
        {
            System.out.println(name+" string is palindrom" );
        }
        else{
             System.out.println(name+" string is not a palindrom" );
        }
        
    }
}