import java.util.Stack;

public class parenthesis {
    public static boolean areParenthesesBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray())
         {
            if (c == '(' || c == '[' || c == '{')
            {
                stack.push(c);
            }
             else if (c == ')' || c == ']' || c == '}') 
            {
                if (stack.isEmpty())
                {
                    return false;  // Unbalanced if closing bracket without matching opening bracket
                }
                
                char openBracket = stack.pop();
                
                if ((c == ')' && openBracket != '(') ||(c == ']' && openBracket != '[') || (c == '}' && openBracket != '{')) 
                {
                    return false;  // Unmatched opening and closing brackets
                }
            }
        }
        
        return stack.isEmpty();  // True if all brackets are matched and stack is empty
    }

    public static void main(String[] args) {
        String input1 = "()";
        boolean balanced1 = areParenthesesBalanced(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + balanced1);

        String input2 = "()[]{}";
        boolean balanced2 = areParenthesesBalanced(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + balanced2);

        String input3 = "(]";
        boolean balanced3 = areParenthesesBalanced(input3);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + balanced3);
    }
}
