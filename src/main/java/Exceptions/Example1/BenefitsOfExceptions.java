package Exceptions.Example1;
/*
Exception handling in java is a powerful mechanism,
to handle runtime errors so the normal flow of the application
is maintained.
*/
public class BenefitsOfExceptions {
    public static void main(String[] args) {
        System.out.println(calculatePercentagesWithException(10, 0));
    }

    private static double calculatePercentage(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (a / b) * 100.0;

    }

    private static double addPercentages(int a, int b, int c, int d) {
        double percentage1 = calculatePercentage(a, b);
        double percentage2 = calculatePercentage(c, d);
        return percentage1 + percentage2;

    }
    private static double calculatePercentagesWithException(int a, int b)  {
        if(b == 0) {
            throw new IllegalArgumentException("Second argument cannot be zero.");
        } else {
            return 100.0 * (a / b);
        }
    }
    }





