/*
First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

public class sumFirstAndLastDigit {
    public static void main(String[] args) {
        int num=6251;
        System.out.println("Sum of first and the last digit of number "+ num+ " is "+ sumFirstAndLastDigit(num));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        int first_digit;
        int last_digit;
        last_digit=number%10;
        int rev_number=0;
        while (number>0)
        {
            int remainder = number%10;
            rev_number=rev_number*10+remainder;
            number/=10;
        }
        first_digit=rev_number%10;
        return (first_digit+last_digit);
    }
}
