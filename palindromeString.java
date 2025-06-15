import java.util.*;

class palindromeString
 {
    public static void main(String args[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("String is");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iEnd = Arr.length - 1;
        int iStart = 0;

        boolean bret = true;

        while (iStart < iEnd) {
            if (Arr[iStart] != Arr[iEnd]) {
                bret = false;
                break;
            }
            iStart++;
            iEnd--;
        }
        if (bret == true) {
            System.out.println(str+" String is palindrome ");
        } else {
            System.out.println(str+" String is not a palindrome");
        }
    }
}
// correct
// // class Solution {
//     int isPalindrome(String S) {
//         S = S.replaceAll("[^\\w]","").toLowerCase();
        
//         char arr1[]=S.toCharArray();
        
        
//         int iStart=0;
//         int iEnd=arr1.length-1;
        
      
//         while(iStart<iEnd){
//         if (arr1[iStart]!=arr1[iEnd])
//         {
//             return 0;
//         }
//         iStart++;
//         iEnd--;
//         }
//         return 1;
//     } 
// };