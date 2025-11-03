import java.util.*;
import java.util.stream.*;

public class Vibhor_FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 78, 12, 56, 89, 45);
        int max = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Maximum: " + max);
    }
}
