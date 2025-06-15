public class HappyNumber {
    
    public static void main(String args[]) {
        int number = 16;
        int result = number;

        while (result != 1 && result != 4) {
            int sum = 0;
            while (result != 0) {
                int digit = result % 10;
                sum += digit * digit;
                result /= 10;
            }
            result = sum;
        }

        if (result == 1) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }
}
