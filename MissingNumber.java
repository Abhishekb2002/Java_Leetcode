import java.util.*;

import javax.sound.sampled.SourceDataLine;

class MissingNumber
{
    public static void main(String  args[] )
    {
        int arr[]={2,4,3,5,6,8,7};
        int iSum=0;
        int iCount=1;
        
        for(int i=0; i<arr.length;i++)
        {
             iCount++;
             iSum=iSum+arr[i];
        }
        int iAns=1;
        iAns =((iCount*(iCount+1))/2)-iSum;
        System.out.println("Missing number in array : "+iAns);
        System.out.println("additon of array : "+iSum);
        System.out.println("number of element in array : "+iCount);
    }
}