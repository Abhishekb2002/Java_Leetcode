public class SecondLargest {
    public static void main(String args[])
    {
        int arr[]={12,35,1,10,11,1};

        int largest=arr[0];
        int secondlargest=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest)
            {
                secondlargest=arr[i];
            }
        }
        System.out.println("the second largest element int the array is :"+secondlargest);
    }
    
}
