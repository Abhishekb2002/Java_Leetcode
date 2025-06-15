import java.util.*;
class main1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0 , iNo2 = 0, iAns = 0;

        System.out.println("enter first element");
        iNo1 = sobj.nextInt();

        System.out.println("enter Second  element");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is :"+iAns);
    }
}