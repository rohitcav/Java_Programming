public class leapYear {
    public static void main(String[] args) {
        int year=1800;
        if(year >= 1 && year<=9999)
        {
            if(isLeapYear(year))
            {
                System.out.println("Year "+ year + " is a Leap Year");
            }
            else {
                System.out.println("Year "+ year + " is not a Leap Year");
            }
        }
        else{
            System.out.println("Number "+ year + " is not Valid");
        }

    }
    public static boolean isLeapYear(int year)
    {
        if (year%4==0 && year%100==0 && year%400==0)
        {
            return true;
        }
        else return false;
    }
}
