public class binarytoOctal {
    public static void main(String args[])
    {
        System.out.println("binary to decimal ");
        int binary=1010;
        int decimal=0;
        int i=0;
        while(binary>0)
        {
            int temp1=binary%10;
            decimal=decimal+(int)(temp1*Math.pow(2,i));
            i++;
            binary=binary/10;
        }
        System.out.println(decimal);

        System.out.println("dicimal to octal");
         
        int count =1;
        int octal=0;
        int tempdecimal=decimal;
        while(tempdecimal>0)
        {
            int temp=tempdecimal%8;
            octal=octal+count*temp;
            count=count*10;
            tempdecimal=tempdecimal/8;    
        }
        System.out.println(octal);
    }
    
}
