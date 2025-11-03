import java.util.*;

record Book(String title, double price, String author) {}

public class Vibhor_Q4_BookRecord {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Java Basics", 450, "James"),
                new Book("Advanced Java", 650, "Robert"),
                new Book("Data Structures", 800, "Thomas")
        );
        books.stream()
                .filter(b -> b.price() > 500)
                .forEach(b -> System.out.println(b.title() + " - " + b.price() + " - " + b.author()));
    }
}
