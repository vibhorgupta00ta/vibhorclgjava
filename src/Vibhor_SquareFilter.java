import java.util.*;
import java.util.stream.*;

public class Vibhor_SquareFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 3, 10);
        numbers.stream()
                .map(n -> n * n)
                .filter(n -> n > 50)
                .forEach(System.out::println);
    }
}
