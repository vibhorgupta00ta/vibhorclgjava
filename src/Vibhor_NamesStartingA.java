import java.util.*;

public class Vibhor_NamesStartingA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Rahul", "Anita", "Sneha", "Arjun");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
