public class Parentheses1 {
    public static boolean areParenthesesBalanced(String input) {
        int count = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false; // Unbalanced parentheses
                }
            }
        }

        return count == 0; // Check if all parentheses are closed
    }

    public static void main(String[] args) {
        String input = "(()())(())";
        boolean balanced = areParenthesesBalanced(input);

        System.out.println("Input String: " + input);
        System.out.println("Parentheses are balanced: " + balanced);
    }
}
