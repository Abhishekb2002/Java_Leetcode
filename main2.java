import java.util.*;

class main2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0  , iNo2 = 0  , iAns = 0;

        System.out.println("");
        iNo1 = sobj.nextInt();

        System.out.println("");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;
        System.out.println(""+iAns);
    }
}