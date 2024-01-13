package Java_Exercises;

public class speedConverter {
    public static void main(String[] args)
    {
       double MPH= toMilesPerHour(2.5);
       System.out.println("2.5 KMPH = " + MPH + "MPH");

    }
    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            return (long)(kilometersPerHour * 1.609);
        }
        return 0;
    }
}
