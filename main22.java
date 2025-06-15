import java.util.*;
class Sorting
{
    public int Arr[];
    public Sorting(int Size)
    {
        Arr=new int[Size];
    }

}

class main22
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter the number ");
        int Size=sobj.nextInt();

        Sorting obj = new Sorting(Size);

       obj.Sorting();
        
    } 
}