/*
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class sharedDigit {
    public static void main(String[] args) {
        if(hasSharedDigit(121,12))
        {
            System.out.println("Both the numbers are having at least one shared digit ");
        }
        else{
            System.out.println("Numbers are not in the Range of 10-99 or Does not contain the shared digit ");
        }
    }
    public static boolean hasSharedDigit(int num1, int num2)
    {
        if(num1<10 || num1>99 || num2<10 || num2>99)
        {
            return false;
        }
        else{
            return(num1%10==num2%10 || num1%10==num2/10 || num1/10==num2%10 || num1/10==num2/10);
        }
    }
}
