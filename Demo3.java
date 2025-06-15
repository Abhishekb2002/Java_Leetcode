import java.util.*;

class Demo
{
    public void countDigit(int iCol,int iRow)
    {
        int iCnt =1;
        int i=0;
        int j=0;


        for(i =1; i<=iCol; i++)
        {
            for(j=1; j<=iRow; j++)
            {
                System.out.print(iCnt+"\t"); 
                iCnt++;

            }
            System.out.println();
        }
    }
}
class Demo3
{
    public static void main(String args[])
    {
         

        Scanner sobj = new Scanner(System.in);

        System.out.println(" enter the number of rows");
       int i = sobj.nextInt();

        System.out.println("enter the number of coloums");
       int j = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.countDigit(i,j);




    }
}