import java.util.*;

public class Vibhor_Q2_MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
        System.out.println("Days: " + (days == -1 ? "Invalid month" : days));
    }
}
