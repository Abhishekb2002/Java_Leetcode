import java.util.*;

class Demo
{
    public int Addition(int a,int b)
    {
        int Sum = 0;
      Sum = a + b ;
        return Sum;

        
    }
     
}

class Demo1
{
    public static void main(String args[])
    {
          int iAns =0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter first element");
        int iNo1 = sobj.nextInt();

        System.out.println("enter second element");
         int iNo2 = sobj.nextInt();
         
         Demo dobj = new Demo();
        iAns = dobj.Addition(iNo1,iNo2);
         
        System.out.println("Addition is"+iAns);




    }
}