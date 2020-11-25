package Exceptions.Example2;
/*
When executing java code, different errors can occur:
they can be - coding errors,wrong inputs,other unpredictable things.

If it happens ,java will generate an error message.Technically speaking -
Java will  'throw and exception'
 */
public class ExceptionTester {
    public static void main(String[] args) {
        System.out.println("Program started....");

        try {
            System.out.println("Doing some calculation...");
            int x = 5/0;
        }catch (ArithmeticException e){
            System.out.println("Ivyko klaida");
            //sukti cikla is naujo,kviesti funkcija
            e.printStackTrace();
        }
        System.out.println("Vykdom programa toliau");
    }

}
