import java.util.*;
class Even
{
    public void Array(int iSize)
    {
        int Arr[]=new int[iSize];
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the array element");
        for(int i=0; i<iSize; i++)
        {
             Arr[i]=sobj.nextInt();
        }  
        for(int i=0; i<Arr.length; i++)
        {
            if(Arr[i]%2==0)
            {
                System.out.println("even number"+Arr[i]);
            }
            else 
            {
                System.out.println("odd number are"+Arr[i]);
            }
        }
    }
}
class EvenOddArray
{
    public static void main(String args[])
    {
        
        Scanner sobj= new Scanner(System.in);
        System.out.println("enter the number");
        int iNo1=sobj.nextInt();
        Even eobj=new Even();
        eobj.Array(iNo1);
    }
}