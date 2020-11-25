package Lambda.Example2;

public class LambdaTester { public static void main(String[] args) {
    MathOperation addition = (int a, int b) -> a + b;
    MathOperation subtraction = (int a, int b) -> a - b;
    MathOperation multiplication = (int a, int b) -> a * b;
    MathOperation division = (int a, int b) -> a / b;
    System.out.println("10 + 2 = " + operate(10, 2, addition));
    System.out.println("10 - 2 = " + operate(10, 2, subtraction));
    System.out.println("10 * 2 = " + operate(10, 2, multiplication));
    System.out.println("10 / 2 = " + operate(10, 2, division));
}
    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }
}

