public class Parentheses2 {
    public static boolean areParenthesesBalanced(String s) {
        int parentheses = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                parentheses++;
            } else if (c == ')' || c == ']' || c == '}') {
                parentheses--;
                if (parentheses < 0) {
                    return false;  // Unbalanced parentheses
                }
            }
        }
        
        return parentheses == 0;
    }
    
    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        
        System.out.println("Input 1: " + input1);
        System.out.println("Parentheses are balanced: " + areParenthesesBalanced(input1));
        
        System.out.println("Input 2: " + input2);
        System.out.println("Parentheses are balanced: " + areParenthesesBalanced(input2));
        
        System.out.println("Input 3: " + input3);
        System.out.println("Parentheses are balanced: " + areParenthesesBalanced(input3));
    }
}



// class Solution
// {
//     //Function to check if brackets are balanced or not.
//     static boolean ispar(String x)
//     {
//         int count=0;
//         for(char c: x.toCharArray()){
//              if(c=='{'||c=='('||c=='[')
//              {
//                  count++;
                 
//              }
//                  else if(c=='}'||c==')'||c==']')
//                  {
//                      count--;
//                      if(count<0)
//                      {
//                          return false;
//                      }
//                  }
//          }
//          return count==0;
//     }
// }

//  corrext
// class Solution
// {
//     //Function to check if brackets are balanced or not.
//     static boolean ispar(String x)
//     {
//              // add your code here
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<x.length(); i++){
//             char ch = x.charAt(i);
//             if(ch=='('|| ch=='{' || ch=='['){
//                 s.push(ch);
//             }
//             else{
//                 if(s.isEmpty()){
//                     return false; 
//                 }
//                 if(s.peek()=='(' && ch==')' || s.peek()=='{' && ch=='}' || s.peek()=='[' && ch==']'){
//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()){
//             return true;
//         }
//         else{
//             return false; 
//         }// Check if all parentheses are closed
//     }
// }