public class CountEvenOdd {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};

        int Count_Even=0;
        int Count_Odd=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("even : "+a[i]);
                Count_Even++;
            }
            else{
                System.out.println("odd : "+a[i]);
                Count_Odd++;

            }
        }
        System.out.println("number of even count :"+Count_Even);
         System.out.println("number of odd count :"+Count_Odd);

    }
    
}
