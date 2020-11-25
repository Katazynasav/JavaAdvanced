package Exceptions.Example3;

public class MultiplyExceptionTester {
    public static void main(String[] args) {
        int[] integerArray = new int[10];
        try {
            //int x = integerArray[11] / 5;
            // System.out.println(x);
            MultiplyExceptionTester multipleExceptionTester = new MultiplyExceptionTester();
            multipleExceptionTester.someMethod();
            //servicas.funkcija1() -> funkcija2 -> funkcija3();
        }catch (CustomEdvinasException e){
            System.out.println("Klaida PAGAUTA nauja");
        } catch (ArithmeticException e) {
            System.out.println("Do some logic after AE is thrown.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("common handling logic for exceptions");
        } catch (Exception ex) {
            System.out.println("Exception is caught do something");
        } finally {
            System.out.println("Executed every time. CLose DB connection");
        }
        System.out.println("Move forward. Close DB.");
    }
    public String someMethod() throws CustomEdvinasException {
        System.out.println("Some specific difficult logic here");
        throw new CustomEdvinasException();
        //return "labas";
    }}
