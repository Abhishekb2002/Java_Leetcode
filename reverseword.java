class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
  
         
        StringBuilder sb = new StringBuilder();
        String[]str = S.trim().split("[.]");
        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i>0){
                sb.append(".");
            }
        }
        return sb.toString();
}
}


// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i

/**
 *  

  String reverseWords(String S)
    {
        String[] words=S.split("\\.");
        String reverseWords="";
        for(String word:words){
            reverseWords=word+"."+reverseWords;
        }
        return reverseWords.substring(0,S.length());
    }


 */