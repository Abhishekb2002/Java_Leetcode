public class DecimalToBinary {

    public static void main(String args[])
    {
        int n=7;
        int binary=0;
        int pow=0;
        int no=n;
        while(no>0)
        {
            int temp=no%2;
            binary=binary+(temp*(int)Math.pow(10,pow));
            no=no/2;
            pow++;

        }
        System.out.println("decimal "+n+" to binary :"+binary);
    }
    
}
