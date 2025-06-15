import java.util.ArrayList;

public class Arraylist1 {

  public static boolean isPrime(int n) {
    if (n <= 1) 
    {return false;
    }
    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String args[]) {
    ArrayList<Integer> arr = new ArrayList<>();
    // Hashset <Integer> hash = new HashSet<>();
    // Hashmap <Integer> hashmap = new Hashmap<>();

    for (int i = 2; i < 50; i++) {
      if (isPrime(i)) {
        arr.add(i);
      }
    }

    System.out.println(arr);
  }
}
