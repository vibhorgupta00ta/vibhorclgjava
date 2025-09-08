package exception.example;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 3, b = 1, c;
            c=a/b;
        }catch (NullPointerException e){
            System.out.println("Exception is handled");
        }catch (ArithmeticException e){
            System.out.println("Aritmetic Exception is handled");
        }
        System.out.println("The result is printed");
    }
}