public class Arrayavg
{
    public static double averages(int []nums,int n)
    {
        int  sum=0;
        int count=0;

        for(int i=0; i<n; i++)
        {
            if(nums[i] % 3==0&& nums[i]  % 2==0)
            
            sum+=nums[i];
            count++;
        }

        if(count==0)
        {
            return 0.0;
                }

             return  (double)  sum/count;
    }

    public static void main(String[] args)
    {
        int[] nums ={  6, 9, 12, 15, 18, 21, 24, 27};
        int n=nums.length;

        double average= averages(nums,n);
        System.out.println("Average :"+average);
    }
}