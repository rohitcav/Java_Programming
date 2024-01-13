package Java_Exercises;

public class switch_printWeek {
    public static void main(String[] args) {

            printWeekDay(8);

    }
    public static void printWeekDay(int weeknum)
    {
        switch (weeknum)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednessday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Number "+ weeknum+" is Invalid Number !! Please provide number in the range of 1 to 7.");
                break;

        }

    }
}
