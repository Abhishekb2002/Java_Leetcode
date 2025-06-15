import java.util.Scanner;

public class CharacterCountString2
 {
    public static int countFrequency(String str, char ch)
     {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String input = s.nextLine();

        System.out.print("Please enter a character to count: ");
        char ch = s.next().charAt(0);

        int result = countFrequency(input, ch);

        System.out.println("Frequency of letter '" + ch+ "': " + result);
  
    }
}
