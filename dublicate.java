import java.util.*;

class dublicate
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter array size");
        
        int iSize=sobj.nextInt();

        int Arr[]= new int[iSize];

        System.out.println("enter element in array ");
        for(int iCnt=0; iCnt<iSize; iCnt++)
        {
            Arr[iCnt] =sobj.nextInt();
        }
        
        // int Arr[] ={1,2,3,4,2,5,6};

        for(int i=0;i<Arr.length; i++)
        {
            for(int j=i+1; j<Arr.length; j++)
            {
                if(Arr[i]==Arr[j])
                {
                    System.out.println("dublicate element "+Arr[i]);

                }
            }
        }      
    }
}