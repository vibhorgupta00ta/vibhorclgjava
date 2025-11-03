@FunctionalInterface
interface Operation {
    int calculate(int n);
}

public class VibhorfunctionalInterfaceQuestion {

    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args){
        int n = 5;

        Operation anonClass = new Operation() {
            @Override
            public int calculate(int n) {
                return n * n;
            }
        };
        System.out.println("Square using Anonymous Inner Class: " + anonClass.calculate(n));

        Operation lambda = (num) -> num * num;
        System.out.println("Square using Lambda Expression: " + lambda.calculate(n));

        Operation methodRef = VibhorfunctionalInterfaceQuestion::square;
        System.out.println("Square using Method Reference: " + methodRef.calculate(n));
    }
}
