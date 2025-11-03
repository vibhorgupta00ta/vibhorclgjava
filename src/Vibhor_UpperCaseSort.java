import java.util.*;
import java.util.stream.*;

public class Vibhor_UpperCaseSort {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "mango", "cherry");
        fruits.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
