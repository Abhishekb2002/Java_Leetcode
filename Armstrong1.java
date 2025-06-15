class Armstrong1
{
    public static void main(String args [])
    {
        int arms=0,n=153,c=0,sum=0;             //(1*1*1+5*5*5+3*3*3)cube addition=153  is armstrong

        c=n;

        while(n>0)
        {
            arms=n%10;
            sum=(arms*arms*arms)+sum;
            n=n/10;
        }
        if(c==sum)
        {
            System.out.println("number is armstrong"+sum);
        }
        else
        {
            System.out.println("number is not armstong"+sum);
        }

        System.out.println("");

    }
    
}