import java.util.*;

public class Vibhor_Q3_LeapYearMonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    yield 29;
                else
                    yield 28;
            }
            default -> -1;
        };
        System.out.println("Days: " + (days == -1 ? "Invalid month" : days));
    }
}
