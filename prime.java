import java.util.*;

class Addition
{
    public int primenumber(int iNo)
    {
        if(iNo%2==0)
        {
            System.out.println("prime number"+iNo);
        }
        return iNo;
    }  
}

class prime
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number ");
        int iNo1=s.nextInt();

        Addition aobj= new Addition();

        int iRet=aobj.primenumber(iNo1);

        System.out.println("prime numbers"+iRet);

    }
}