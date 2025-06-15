
import java.util.Scanner;

class main12
{
    public static void main(String args[])
    {
        int iCnt=0;
        int iSum=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("how many number you want to enter in array");
        int isize= sobj.nextInt();

         int Arr[] =new int[isize];
        
        System.out.println("Number of element in the array are:"+Arr.length);
        System.out.println("enter the element in the array :");
        for(iCnt =0; iCnt<Arr.length ; iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();   
        }
        System.out.println("enter of the array are");
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);

        }
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            iSum = iSum +Arr[iCnt];

        }
        System.out.println("Addition is :"+iSum);
    }



}