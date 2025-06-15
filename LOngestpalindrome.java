public class LOngestpalindrome {

    public static boolean ispalindrome(int brr)
    {
        int rev=0; 
        int temp=brr;
        if(brr<0)
        {
            return false;
        }

        while(brr!=0)
        {
            int digit=brr%10;
            rev=rev*10+digit;
            brr=brr/10;
        }
        

        return temp==rev;

    }
    public static void main(String args[])
    {
        int arr[]={1,444,45454,999,9999};

        int longestPalindrome=0;

        for(int brr:arr)
        {
            
            if(ispalindrome(brr) && brr > longestPalindrome) {
                longestPalindrome = brr;
        }
    }
    System.out.println("lengest palindrome is "+longestPalindrome);

}
}
