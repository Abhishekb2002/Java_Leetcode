import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

public class java3{
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(15);
        inputList.add(10);
        inputList.add(34);
        inputList.add(25);
        inputList.add(10);

        List<Integer> outputList = new ArrayList<>();
        LinkedHashSet<Integer> seen = new LinkedHashSet<>();

        for (Integer item : inputList) {
            if (seen.add(item)) {
                outputList.add(item);
            } else {
                outputList.remove(item);
                outputList.add(item);
            }
        }

        System.out.println(outputList);
    }
}
