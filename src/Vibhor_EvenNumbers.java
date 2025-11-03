import java.util.*;
import java.util.stream.*;

public class Vibhor_EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 8, 12, 5, 7, 10, 15);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
