public class RotateArray {

    public static void rotation(int arr[],int R,int n)
    {
        R=R%n;
        int temp[]=new int[n];
        for(int i=0; i<n; i++)
        {
            temp[(i+R)%n]=arr[i];
        }
        System.arraycopy(temp,0,arr,0,n);

        // for(int i=0; i<temp.length;i++)
        // {
        //     System.out.println(temp[i]+" ");
        // }
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String ags[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int R=2;

        rotation(arr,R,n);
        print(arr);
    }
    
}
