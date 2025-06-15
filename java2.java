public class java2 {
    public static void main(String args[])
    {
        int arr[]={10,20,15,2,23,90,67};
        //output =[20,90]

        // for(int i=0; i<arr.length;i++)
        // {
        //     if (arr[i+1]>arr[i])
        //     {
        //         System.out.println(arr[i+1]);
        //     }
        // }
        
        for(int i=1; i<arr.length-1;i++)
        {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
            {
                System.out.println(arr[i]);
            }
        }
    }
    
}
