public class SwapAlternative {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int temp=0;

        for(int i=0; i<arr.length; i+=2)
        {
            if(i+1<arr.length)
            {
             temp=arr[i+1];
             arr[i+1]=arr[i];
             arr[i]=temp;
        }
    }
         for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");

    }}
    
}
