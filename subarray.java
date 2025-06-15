public class subarray
{
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int tp=0;
        for(int i=0; i<arr.length; i++)
        {
            int iStart=i;
            for(int j=i+1; j<arr.length;j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+" ");
                    tp++;
                }
                System.out.println();
            }
            System.out.println("total sub array"+tp);
            
        }
    }
    
}
