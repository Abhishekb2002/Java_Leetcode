public class DecimaltoOctal {
    public static void main(String args[])
    {

        int decimal=146;
        int remender=1;
        int octal=0;
        System.out.println("decimal to octal");
        while(decimal!=0)
        {
            int itemp=decimal%8;
             octal=octal+itemp*remender;
             remender=remender*10;
             decimal=decimal/8;
               }    
            System.out.println(octal);
    }
    
}
