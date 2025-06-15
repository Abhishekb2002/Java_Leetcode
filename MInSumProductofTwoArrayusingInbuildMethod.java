
import java.util.Arrays;
import java.util.Collections;
class  MInSumProductofTwoArrayusingInbuildMethod
{
    public static void main (String[] args)
    {
        Integer arr1[] = {10, 30, 40, 20};
       Integer arr2[] = {2, 4, 5, 1};
          int n = arr1.length;

          //Sort arr1 in ascending order
          Arrays.sort(arr1);

          //Sort arr2 in descending order
          Arrays.sort(arr2, Collections.reverseOrder());

          int product = 0;
          for(int i=0; i<n; i++)
              product += arr1[i]*arr2[i];

          System.out.print(product);
   }
}