public class ReverseArray
 {
    public static void main(String args[])
    {
        int arr[]={3,2,4};

        int itemp=0;
        int iStart=0;
        int iEnd=arr.length-1;

        while(iStart<iEnd)
        {
            itemp=arr[iStart];
            arr[iStart]=arr[iEnd];
            arr[iEnd]=itemp;

            iStart++;
            iEnd--;

        }
        System.out.println("reverse array are : ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
