public class arraysumcheck {

    public static void main(String args[])
    {
        int arr[]={8,3,7,6,4,2,5};

        int sum = 10;
        int count=0;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    count++;
                    System.out.println("two number are : "+"("+arr[i]+","+arr[j]+")");
                }
            }
        }
        System.out.println(count);
    }
    
}
