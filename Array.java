import java.util.*;
class arrayx
{
    public int Arr[];

    public arrayx(int iSize)
    {
        Arr =new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("please enter "+Arr.length +" element");
        for(int iCnt=0; iCnt<Arr.length; iCnt++)
        {
            System.out.println("enter the no"+(iCnt+1));
            Arr[iCnt]=sobj.nextInt();
        }

    }
        public void Display()
        {
              System.out.println("element of array are ");
           

            for(int iCnt=0;iCnt<Arr.length;iCnt++)
            {
                System.out.println(Arr[iCnt]+"\t");
            }
             System.out.println(); 
        }      
} 

class Array
 {
    public static void main(String a[])
    {
        arrayx obj = new arrayx(5);

        obj.Accept(); 

        obj.Display();


    }
    
}
