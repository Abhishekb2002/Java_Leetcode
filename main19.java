import java.util.*;

class sorting 
{
    private int Arr[];

    public sorting(int Size)
    {
        Arr = new int[Size];
    }
    
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the element :");
        for(int i =0; i<Arr.length ;i++)
        {
            Arr[i] = sobj.nextInt();
        }

    }

    public void Display()
    {
        System.out.println("Element of array are :");
        for(int i =0 ; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }
}
class main19
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int Size = sobj.nextInt();

        sorting obj = new sorting(Size);
        obj.Accept();
        obj.Display();

    }
}