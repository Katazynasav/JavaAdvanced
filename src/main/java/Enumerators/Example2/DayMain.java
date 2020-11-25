package Enumerators.Example2;

public class DayMain {
    public static void main(String[] args) {
        for(Day day: Day.values()){
            printQuoteOfTheDay(day);

        }
    }

    private static void printQuoteOfTheDay(Day day) {
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:

                System.out.println("Kas nedirba mielas vaike,tam ir duonos duot nereikia.");
                break;
            case FRIDAY:
                System.out.println("Friday is my second favorite F word.First Preke is Fanta.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("What day is this? ");

        }
    }
}
