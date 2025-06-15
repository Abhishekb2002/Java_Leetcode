public class minProductoOfTwoArrayWithoutusingInbuildMethod {
    public static void main(String args[])
    {
        int arr1[] = {10, 30, 40, 20};
       int arr2[] = {2, 4, 5, 1};

        int temp=0;
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=i+1; j<arr1.length; j++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
       }
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=i+1; j<arr2.length; j++)
            {
                if(arr2[i]<arr2[j])
                {
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
       }
        // for(int i=0; i<arr2.length; i++)
        // {
        //     System.out.print(arr2[i]+" ");
        // }
    
        int product=1;
        int sum=0;


        for(int i=0; i<arr1.length; i++)
        {
            sum=sum+arr1[i]*arr2[i];
        }
        System.out.println("mim product sum is "+sum);
    }
    
}

