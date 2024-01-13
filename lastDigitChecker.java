/*
Last Digit Checker
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
 */

public class lastDigitChecker {
    public static void main(String[] args) {
        if(hasSameLastDigit(11,11,318))
        {
            System.out.println("At least two of the numbers has shared same rightmost digit ");
        }
        else{
            System.out.println("Numbers are not in the Range of 10-1000 or Does not contain the shared rightmost digit ");
        }
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        if(num1<10 || num1>1000 || num2<10 || num2>1000 || num3<10 || num3>1000 )
        {
            return false;
        }
        else {
            return (num1%10==num2%10 || num1%10==num3%10 || num2%10==num3%10);
        }
    }
}
