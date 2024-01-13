package Java_Exercises;/*
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 */

public class javaComparator {
    public static void main(String[] args) {
        double firstnum=1.1234;
        double secondnum=1.123;
        if (areEqualByThreeDecimalPlaces(firstnum, secondnum)) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstnum, double secondnum)
    {
         if( (int)(firstnum * 1000) == (int)(secondnum * 1000))
         {
             return true;
         }
         else return false;
    }

}
