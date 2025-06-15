public class NonRepeatingCharString {
    public static void main(String args[]) {
        String str = "google";

        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
